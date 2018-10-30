package codewritten;

import gui.ClassCreationWindow;
import gui.ClassInformationPanel;
import gui.PanelsWindow;
import gui.ProjectInformationPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class BlueJJFormDesignerMyCode {
	/*
		NOTE: Class Created with the purpose of not interfering with the code produced by
		the GUI designers and NOT for creating extensible and/or easily maintainable software.
	*/
	private PanelsWindow appWindow = new PanelsWindow(this);
	private ClassWidget firstClass = new ClassWidget("firstClass",
			new javax.swing.ImageIcon(getClass().getResource("/img/ClassNull.PNG")), this);
	private JPanel panel3;
	private int newWindowX = 180;

	//Panels Window Fields
	private int tabIndex, docPanelCounter;
	private ArrayList<String> appWindowNames = new ArrayList<String>();
	private JTabbedPane tabbedPane1;

	public void setAppWindowTabbedPane(JTabbedPane tabbedPane1) {
		this.tabbedPane1 = tabbedPane1;
		tabIndex = -1;
		docPanelCounter = 0;
	}

	public void setPanel3(JPanel panel3) {
		this.panel3 = panel3;
	}

	public void addLblToBtn12(final JButton button12, final JLabel label4) {
		button12.setLayout(new GridLayout(2, 1));
		button12.add(label4);
	}

	public void createNewClassWindow() {
		ClassCreationWindow newClassWindow = new ClassCreationWindow(this);
		newClassWindow.setVisible(true);
	}

	public void addDocumentBtnActionListener() {
		addDocumentPanelIfPossible(appWindow);
		appWindow.setVisible(true);
	}

	public void addFirstClassBtnActionListener() {
		if (!firstClass.getDragged()) {
			addClassPanelIfPossible("FirstClass", appWindow);
			appWindow.setVisible(true);
        }
        firstClass.setDragged(false);
	}

	public void addFirstClassBtnMotionListener(MouseEvent e, JButton button12) {
		button12.setBounds(e.getX() + button12.getX() - 10, e.getY() + button12.getY() - 10,
			button12.getWidth(), button12.getHeight());
		firstClass.setDragged(true);
	}

	public void createClassIcon(String className) {
		ImageIcon img7 = new javax.swing.ImageIcon(getClass().getResource("/img/ClassNull.PNG"));
		ClassWidget newClass = new ClassWidget(className, img7, this);

		JButton newClassBtn = new javax.swing.JButton();
		setUpNewBtn(newClass, newClassBtn);
		addNewClassBtnActionListener(newClassBtn, newClass);
		addNewClassBtnMouseMotionListener(newClassBtn, newClass);
        panelRefresh(panel3);
	}

	private void setUpNewBtn(ClassWidget newClass, JButton newClassBtn) {
		newClassBtn.setBounds(newWindowX, 125, 89, 58);
        newClassBtn.setIcon(newClass.getImageIcon());
        newClassBtn.setLayout(new GridLayout(2, 1));
        JLabel newLabel = new JLabel(newClass.getName());
        newClassBtn.add(newLabel);
        panel3.add(newClassBtn);
        if (newWindowX<=400) newWindowX += 100;
	}

	private void addNewClassBtnActionListener(JButton newClassBtn, ClassWidget newClass) {
		 newClassBtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	addNewClassBtnActionListenerProperties(newClass);
	            }
	        });
	}

	private void addNewClassBtnActionListenerProperties(ClassWidget newClass) {
		if (!newClass.getDragged()) {
            addClassPanelIfPossible(newClass.getName(), appWindow);
            appWindow.setVisible(true);
        }
        newClass.setDragged(false);
	}

	private void addNewClassBtnMouseMotionListener(JButton newClassBtn, ClassWidget newClass) {
		newClassBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                newClassBtn.setBounds(evt.getX() + newClassBtn.getX() - 10,
                		evt.getY() + newClassBtn.getY() - 10, 89, 58);
                newClass.setDragged(true);
            }
        });
	}

	private void panelRefresh(JPanel panel) {
		panel.revalidate();
        panel.repaint();
	}

	//Panels Window Code
	public void addDocumentPanelIfPossible(PanelsWindow frame) {
		if (docPanelCounter == 0) {
			addDocumentPanel(frame);
			tabbedPane1.setSelectedIndex(tabIndex);
		}
	}

	private void addDocumentPanel(PanelsWindow frame) {
        tabIndex++;
        docPanelCounter++;
        ProjectInformationPanel newDoc = new ProjectInformationPanel(0, this);
        tabbedPane1.addTab("README.TXT", newDoc);
        tabbedPane1.setTabComponentAt(tabIndex, addPanelTab("README.TXT"));
    }

	 private void addClassPanelIfPossible(String name, PanelsWindow frame) {
		if (checkIfNameEligible(name)) {
			addClassPanel(name, frame);
			tabbedPane1.setSelectedIndex(tabIndex);
		}
	 }

	 private boolean checkIfNameEligible(String newName) {
		for (int i = 0; i < appWindowNames.size(); i++) {
			if (appWindowNames.get(i).equals(newName)) {
				return false;
			}
		}
		return true;
	}

	private void addClassPanel(String className, PanelsWindow frame) {
        tabIndex++;
        ClassInformationPanel newClass = new ClassInformationPanel(className, this);
        tabbedPane1.addTab(className, newClass);
        tabbedPane1.setTabComponentAt(tabIndex, addPanelTab(className));
        appWindowNames.add(className);
    }

	private JPanel addPanelTab(String tabName) {
        JPanel pnlTab = new JPanel(new GridBagLayout());
        pnlTab.setOpaque(false);
        JLabel lblTitle = new JLabel(tabName);
        JButton btnClose = new JButton("x");
        GridBagConstraints gbc = new GridBagConstraints();

        setInitialTabGridBagConstraints(gbc);
        pnlTab.add(lblTitle, gbc);
        setSecondaryTabGridBagConstraints(gbc);
        pnlTab.add(btnClose, gbc);
        addBtnCloseActionListener(btnClose, tabName);
        return pnlTab;
    }

	private void setInitialTabGridBagConstraints(GridBagConstraints gbc) {
		gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
	}

	private void setSecondaryTabGridBagConstraints(GridBagConstraints gbc) {
		gbc.gridx++;
        gbc.weightx = 0;
	}

	private void addBtnCloseActionListener(JButton btnClose, String tabName) {
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					closeTab(tabName);
				}
	        });
	}

	public void closeTab(String tabName) {
		tabbedPane1.remove(tabbedPane1.indexOfTab(tabName));
		tabIndex--;
		removeNameIfClassRemoved(tabName);
		reduceCounterIfDocRemoved(tabName);
		disposeIfTabIndexZero();
    }

	private void removeNameIfClassRemoved(String tabName) {
		if (!tabName.equals("README.TXT")) {
			appWindowNames.remove(appWindowNames.indexOf(tabName));
		}
	}

	private void reduceCounterIfDocRemoved(String tabName) {
		if (tabName.equals("README.TXT")) {
			docPanelCounter--;
		}
	}

	private void disposeIfTabIndexZero() {
		if (tabIndex == -1) {
			appWindow.dispose();
		}
	}

	public void clearAppWindow() {
		removeDocPanelIfExists();
		removeAndClearAllClassPanels();
	}

	private void removeDocPanelIfExists() {
		if (docPanelCounter == 1) {
			closeTab("README.TXT");
		}
		docPanelCounter = 0;
	}

	private void removeAndClearAllClassPanels() {
		removeAllClassPanels();
		appWindowNames.clear();
	}

	private void removeAllClassPanels() {
		for (int i = 0; i < appWindowNames.size(); i++) {
			tabbedPane1.remove(tabbedPane1.indexOfTab(appWindowNames.get(i)));
			tabIndex--;
		}
	}

	public void addTextFieldListener(JTextField textField1, JButton button1) {
		if (!textField1.getText().equals("")) {
			button1.setEnabled(true);
		} else {
			button1.setEnabled(false);
		}
	}

}

/*
 * Created by JFormDesigner on Mon Apr 16 19:17:22 EEST 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import codewritten.BlueJJFormDesignerMyCode;

/**
 * @author Paul Chris
 */
public class PanelsWindow extends JFrame {

  BlueJJFormDesignerMyCode newReference;

	public PanelsWindow(BlueJJFormDesignerMyCode newReference) {
    this.newReference = newReference;
		initComponents();
    newReference.setAppWindowTabbedPane(tabbedPane1);
	}

	private void thisWindowClosing(final WindowEvent e) {
		//TODO add your code here
    newReference.clearAppWindow();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Paul
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menu3 = new JMenu();
		menuItem2 = new JMenuItem();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem1 = new JMenuItem();
		menu4 = new JMenu();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menuItem12 = new JMenuItem();
		menuItem13 = new JMenuItem();
		menuItem14 = new JMenuItem();
		menuItem15 = new JMenuItem();
		menuItem16 = new JMenuItem();
		menuItem17 = new JMenuItem();
		menu5 = new JMenu();
		menuItem18 = new JMenuItem();
		menuItem19 = new JMenuItem();
		menuItem20 = new JMenuItem();
		menuItem21 = new JMenuItem();
		menuItem22 = new JMenuItem();
		menuItem23 = new JMenuItem();
		menuItem24 = new JMenuItem();
		menuItem25 = new JMenuItem();
		menu6 = new JMenu();
		menuItem26 = new JMenuItem();
		menuItem27 = new JMenuItem();
		menuItem28 = new JMenuItem();
		menuItem29 = new JMenuItem();
		menuItem30 = new JMenuItem();
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		separator10 = new JSeparator();
		label1 = new JLabel();

		//======== this ========
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(final WindowEvent e) {
				thisWindowClosing(e);
			}
		});
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Project");

				//======== menu3 ========
				{
					menu3.setText("Move tab...");

					//---- menuItem2 ----
					menuItem2.setText("To new window");
					menuItem2.setEnabled(false);
					menu3.add(menuItem2);
				}
				menu1.add(menu3);
				menu1.addSeparator();

				//---- menuItem3 ----
				menuItem3.setText("Save");
				menu1.add(menuItem3);

				//---- menuItem4 ----
				menuItem4.setText("Reload");
				menu1.add(menuItem4);
				menu1.addSeparator();

				//---- menuItem5 ----
				menuItem5.setText("Print...");
				menu1.add(menuItem5);
				menu1.addSeparator();

				//---- menuItem1 ----
				menuItem1.setText("Close");
				menu1.add(menuItem1);
			}
			menuBar1.add(menu1);

			//======== menu4 ========
			{
				menu4.setText("Edit");

				//---- menuItem6 ----
				menuItem6.setText("Undo");
				menuItem6.setEnabled(false);
				menu4.add(menuItem6);

				//---- menuItem7 ----
				menuItem7.setText("Redo");
				menuItem7.setEnabled(false);
				menu4.add(menuItem7);
				menu4.addSeparator();

				//---- menuItem8 ----
				menuItem8.setText("Cut");
				menu4.add(menuItem8);

				//---- menuItem9 ----
				menuItem9.setText("Copy");
				menu4.add(menuItem9);

				//---- menuItem10 ----
				menuItem10.setText("Paste");
				menu4.add(menuItem10);
				menu4.addSeparator();

				//---- menuItem11 ----
				menuItem11.setText("Indent more");
				menu4.add(menuItem11);

				//---- menuItem12 ----
				menuItem12.setText("Indent less");
				menu4.add(menuItem12);

				//---- menuItem13 ----
				menuItem13.setText("Comment");
				menu4.add(menuItem13);

				//---- menuItem14 ----
				menuItem14.setText("Uncomment");
				menu4.add(menuItem14);

				//---- menuItem15 ----
				menuItem15.setText("Auto-layout");
				menu4.add(menuItem15);
				menu4.addSeparator();

				//---- menuItem16 ----
				menuItem16.setText("Insert method");
				menu4.add(menuItem16);

				//---- menuItem17 ----
				menuItem17.setText("Add method comment");
				menu4.add(menuItem17);
			}
			menuBar1.add(menu4);

			//======== menu5 ========
			{
				menu5.setText("Tools");

				//---- menuItem18 ----
				menuItem18.setText("Find...");
				menu5.add(menuItem18);

				//---- menuItem19 ----
				menuItem19.setText("Find Next");
				menu5.add(menuItem19);

				//---- menuItem20 ----
				menuItem20.setText("Find Next Backward");
				menu5.add(menuItem20);

				//---- menuItem21 ----
				menuItem21.setText("Replace...");
				menu5.add(menuItem21);

				//---- menuItem22 ----
				menuItem22.setText("Go to line...");
				menu5.add(menuItem22);
				menu5.addSeparator();

				//---- menuItem23 ----
				menuItem23.setText("Compile");
				menuItem23.setEnabled(false);
				menu5.add(menuItem23);

				//---- menuItem24 ----
				menuItem24.setText("Set/Clear Breakpoint");
				menuItem24.setEnabled(false);
				menu5.add(menuItem24);
				menu5.addSeparator();

				//---- menuItem25 ----
				menuItem25.setText("Toggle Documantation View");
				menu5.add(menuItem25);
			}
			menuBar1.add(menu5);

			//======== menu6 ========
			{
				menu6.setText("Options");

				//---- menuItem26 ----
				menuItem26.setText("Increase Font Size");
				menu6.add(menuItem26);

				//---- menuItem27 ----
				menuItem27.setText("Decrease Font Size");
				menu6.add(menuItem27);

				//---- menuItem28 ----
				menuItem28.setText("Reset Font Size");
				menu6.add(menuItem28);
				menu6.addSeparator();

				//---- menuItem29 ----
				menuItem29.setText("Key Bindings...");
				menu6.add(menuItem29);

				//---- menuItem30 ----
				menuItem30.setText("Preferences...");
				menu6.add(menuItem30);
			}
			menuBar1.add(menu6);
		}
		setJMenuBar(menuBar1);
		contentPane.add(tabbedPane1);
		tabbedPane1.setBounds(0, 0, 815, 635);

		//======== panel1 ========
		{
			panel1.setBackground(Color.lightGray);

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


			//---- separator10 ----
			separator10.setOrientation(SwingConstants.VERTICAL);
			separator10.setBackground(Color.gray);

			//---- label1 ----
			label1.setText("Saved");
			label1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
			label1.setHorizontalTextPosition(SwingConstants.CENTER);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setForeground(Color.gray);

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(655, Short.MAX_VALUE)
						.addComponent(separator10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(36, 36, 36)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addComponent(separator10, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		}
		contentPane.add(panel1);
		panel1.setBounds(0, 635, 815, 55);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Paul
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenu menu3;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private JMenuItem menuItem1;
	private JMenu menu4;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenuItem menuItem10;
	private JMenuItem menuItem11;
	private JMenuItem menuItem12;
	private JMenuItem menuItem13;
	private JMenuItem menuItem14;
	private JMenuItem menuItem15;
	private JMenuItem menuItem16;
	private JMenuItem menuItem17;
	private JMenu menu5;
	private JMenuItem menuItem18;
	private JMenuItem menuItem19;
	private JMenuItem menuItem20;
	private JMenuItem menuItem21;
	private JMenuItem menuItem22;
	private JMenuItem menuItem23;
	private JMenuItem menuItem24;
	private JMenuItem menuItem25;
	private JMenu menu6;
	private JMenuItem menuItem26;
	private JMenuItem menuItem27;
	private JMenuItem menuItem28;
	private JMenuItem menuItem29;
	private JMenuItem menuItem30;
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JSeparator separator10;
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

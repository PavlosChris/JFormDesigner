/*
 * Created by JFormDesigner on Wed Mar 28 14:24:14 EEST 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import codewritten.BlueJJFormDesignerMyCode;
import codewritten.MainFrameVisibility;

/**
 * @author Paul Chris
 */
public class MainApplicationWindow extends JFrame {

  BlueJJFormDesignerMyCode newReference = new BlueJJFormDesignerMyCode();
  MainFrameVisibility newVisibility;

	public MainApplicationWindow() {
		initComponents();
    newVisibility = new MainFrameVisibility(button4,
                        button5,  button6, button7,  button8,  button10, button13,
                        button14,  label1,  label2, radioButton1, panel2, button12, label4);
    newReference.setPanel3(panel3);
    newReference.addLblToBtn12(button12, label4);
	}

	private void button10ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newVisibility.changeVisibilityUpArrow();
	}

	private void button8ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newVisibility.changeVisibilityDownArrow();
	}

	private void button13ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newVisibility.changeVisibilityLeftArrow();
	}

	private void button14ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newVisibility.changeVisibilityRightArrow();
	}

	private void button11ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newReference.addDocumentBtnActionListener();
	}

	private void button12ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newReference.addFirstClassBtnActionListener();
	}

	private void button12MouseDragged(final MouseEvent e) {
		// TODO add your code here
    newReference.addFirstClassBtnMotionListener(e, button12);
	}

	private void button1ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newReference.createNewClassWindow();
	}

	private void button4ActionPerformed(final ActionEvent e) {
		// TODO add your code here
	}

	private void button2ActionPerformed(final ActionEvent e) {
		// TODO add your code here
	}

	private void button3ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    label3.setText("Compiling... Done.");
	}

	private void button5ActionPerformed(final ActionEvent e) {
		// TODO add your code here
	}

	private void button6ActionPerformed(final ActionEvent e) {
		// TODO add your code here
	}

	private void button7ActionPerformed(final ActionEvent e) {
		// TODO add your code here
	}

	private void button9ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    label3.setText("Initialising Virtual Machine... Done.");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Paul
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		menu6 = new JMenu();
		menuItem44 = new JMenuItem();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menu2 = new JMenu();
		menuItem12 = new JMenuItem();
		menuItem13 = new JMenuItem();
		menuItem14 = new JMenuItem();
		menuItem15 = new JMenuItem();
		menuItem16 = new JMenuItem();
		menuItem17 = new JMenuItem();
		menu3 = new JMenu();
		menuItem18 = new JMenuItem();
		menuItem19 = new JMenuItem();
		menuItem20 = new JMenuItem();
		menuItem21 = new JMenuItem();
		menuItem22 = new JMenuItem();
		menuItem23 = new JMenuItem();
		menu7 = new JMenu();
		menuItem26 = new JMenuItem();
		menuItem27 = new JMenuItem();
		menuItem28 = new JMenuItem();
		menu8 = new JMenu();
		menuItem29 = new JMenuItem();
		menuItem30 = new JMenuItem();
		menuItem31 = new JMenuItem();
		menuItem32 = new JMenuItem();
		menuItem33 = new JMenuItem();
		menuItem34 = new JMenuItem();
		menuItem35 = new JMenuItem();
		menuItem24 = new JMenuItem();
		menuItem25 = new JMenuItem();
		menu4 = new JMenu();
		checkBoxMenuItem1 = new JCheckBoxMenuItem();
		checkBoxMenuItem2 = new JCheckBoxMenuItem();
		checkBoxMenuItem3 = new JCheckBoxMenuItem();
		checkBoxMenuItem4 = new JCheckBoxMenuItem();
		checkBoxMenuItem5 = new JCheckBoxMenuItem();
		checkBoxMenuItem6 = new JCheckBoxMenuItem();
		checkBoxMenuItem7 = new JCheckBoxMenuItem();
		menu5 = new JMenu();
		menuItem36 = new JMenuItem();
		menuItem37 = new JMenuItem();
		menuItem38 = new JMenuItem();
		menuItem39 = new JMenuItem();
		menuItem40 = new JMenuItem();
		menuItem41 = new JMenuItem();
		menuItem42 = new JMenuItem();
		menuItem43 = new JMenuItem();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();
		button4 = new JButton();
		label2 = new JLabel();
		button5 = new JButton();
		radioButton1 = new JRadioButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		progressBar1 = new JProgressBar();
		label3 = new JLabel();
		button10 = new JButton();
		scrollPane1 = new JScrollPane();
		panel3 = new JPanel();
		button11 = new JButton();
		label4 = new JLabel();
		button12 = new JButton();
		panel1 = new JPanel();
		button13 = new JButton();
		button14 = new JButton();
		panel2 = new JPanel();
		textField1 = new JTextField();

		//======== this ========
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("BlueJ");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== menuBar1 ========
		{
			menu1.setText("Project");

			//---- menuItem1 ----
			menuItem1.setText("New Project");
			menu1.add(menuItem1);

			//---- menuItem2 ----
			menuItem2.setText("Open Project...");
			menu1.add(menuItem2);

			//======== menu6 ========
			{
				menu6.setText("Open Recent");

				//---- menuItem44 ----
				menuItem44.setText("C:\\Users\\User1\\Documents\\BlueJ");
				menu6.add(menuItem44);
			}
			menu1.add(menu6);

			//---- menuItem3 ----
			menuItem3.setText("Open NonBlueJ...");
			menu1.add(menuItem3);

			//---- menuItem4 ----
			menuItem4.setText("Open ZIP/JAR...");
			menu1.add(menuItem4);

			//---- menuItem5 ----
			menuItem5.setText("Close");
			menu1.add(menuItem5);

			//---- menuItem6 ----
			menuItem6.setText("Save");
			menu1.add(menuItem6);

			//---- menuItem7 ----
			menuItem7.setText("Save As...");
			menu1.add(menuItem7);
			menu1.addSeparator();

			//---- menuItem8 ----
			menuItem8.setText("Import...");
			menu1.add(menuItem8);

			//---- menuItem9 ----
			menuItem9.setText("Create Jar File...");
			menu1.add(menuItem9);
			menu1.addSeparator();

			//---- menuItem10 ----
			menuItem10.setText("Print...");
			menu1.add(menuItem10);
			menu1.addSeparator();

			//---- menuItem11 ----
			menuItem11.setText("Quit");
			menu1.add(menuItem11);
		}
		menuBar1.add(menu1);
		{
			menu2.setText("Edit");

			//---- menuItem12 ----
			menuItem12.setText("New Class...");
			menu2.add(menuItem12);

			//---- menuItem13 ----
			menuItem13.setText("New Package...");
			menu2.add(menuItem13);

			//---- menuItem14 ----
			menuItem14.setText("New CSS File...");
			menu2.add(menuItem14);

			//---- menuItem15 ----
			menuItem15.setText("Add Class from File...");
			menu2.add(menuItem15);

			//---- menuItem16 ----
			menuItem16.setText("Delete");
			menu2.add(menuItem16);
			menu2.addSeparator();

			//---- menuItem17 ----
			menuItem17.setText("New Inheritance Arrow...");
			menu2.add(menuItem17);
		}
		menuBar1.add(menu2);
		{
			menu3.setText("Tools");

			//---- menuItem18 ----
			menuItem18.setText("Compile");
			menu3.add(menuItem18);

			//---- menuItem19 ----
			menuItem19.setText("Compile Selected");
			menu3.add(menuItem19);

			//---- menuItem20 ----
			menuItem20.setText("Rebuild Package");
			menu3.add(menuItem20);

			//---- menuItem21 ----
			menuItem21.setText("Reset Java Virtual Machine");
			menu3.add(menuItem21);
			menu3.addSeparator();

			//---- menuItem22 ----
			menuItem22.setText("Use Library Class...");
			menu3.add(menuItem22);

			//---- menuItem23 ----
			menuItem23.setText("Project Documentation");
			menu3.add(menuItem23);

			//======== menu7 ========
			{
				menu7.setText("Testing");

				//---- menuItem26 ----
				menuItem26.setText("Run Tests");
				menu7.add(menuItem26);

				//---- menuItem27 ----
				menuItem27.setText("End Recording");
				menuItem27.setEnabled(false);
				menu7.add(menuItem27);

				//---- menuItem28 ----
				menuItem28.setText("Cancel Recording");
				menuItem28.setEnabled(false);
				menu7.add(menuItem28);
			}
			menu3.add(menu7);

			//======== menu8 ========
			{
				menu8.setText("Team");

				//---- menuItem29 ----
				menuItem29.setText("Checkout Project...");
				menu8.add(menuItem29);

				//---- menuItem30 ----
				menuItem30.setText("Share this Project...");
				menu8.add(menuItem30);
				menu8.addSeparator();

				//---- menuItem31 ----
				menuItem31.setText("Update from Repository");
				menuItem31.setEnabled(false);
				menu8.add(menuItem31);

				//---- menuItem32 ----
				menuItem32.setText("Commit to Repository");
				menuItem32.setEnabled(false);
				menu8.add(menuItem32);

				//---- menuItem33 ----
				menuItem33.setText("Share");
				menuItem33.setEnabled(false);
				menu8.add(menuItem33);

				//---- menuItem34 ----
				menuItem34.setText("Project History");
				menuItem34.setEnabled(false);
				menu8.add(menuItem34);
				menu8.addSeparator();

				//---- menuItem35 ----
				menuItem35.setText("Teamwork Settings");
				menuItem35.setEnabled(false);
				menu8.add(menuItem35);
			}
			menu3.add(menu8);
			menu3.addSeparator();

			//---- menuItem24 ----
			menuItem24.setText("Preferences...");
			menu3.add(menuItem24);
			menu3.addSeparator();

			//---- menuItem25 ----
			menuItem25.setText("Submit");
			menuItem25.setEnabled(false);
			menu3.add(menuItem25);
		}
		menuBar1.add(menu3);
		{
			menu4.setText("View");

			//---- checkBoxMenuItem1 ----
			checkBoxMenuItem1.setText("Show Uses");
			checkBoxMenuItem1.setSelected(true);
			menu4.add(checkBoxMenuItem1);

			//---- checkBoxMenuItem2 ----
			checkBoxMenuItem2.setText("Show Inheritance");
			checkBoxMenuItem2.setSelected(true);
			menu4.add(checkBoxMenuItem2);
			menu4.addSeparator();

			//---- checkBoxMenuItem3 ----
			checkBoxMenuItem3.setText("Show Debugger");
			menu4.add(checkBoxMenuItem3);

			//---- checkBoxMenuItem4 ----
			checkBoxMenuItem4.setText("Show Terminal");
			menu4.add(checkBoxMenuItem4);

			//---- checkBoxMenuItem5 ----
			checkBoxMenuItem5.setText("Show Code Pad");
			menu4.add(checkBoxMenuItem5);

			//---- checkBoxMenuItem6 ----
			checkBoxMenuItem6.setText("Show Team and Test Controls");
			menu4.add(checkBoxMenuItem6);

			//---- checkBoxMenuItem7 ----
			checkBoxMenuItem7.setText("Show Test Results");
			menu4.add(checkBoxMenuItem7);
		}
		menuBar1.add(menu4);
		{
			menu5.setText("Help");

			//---- menuItem36 ----
			menuItem36.setText("About BlueJ");
			menu5.add(menuItem36);

			//---- menuItem37 ----
			menuItem37.setText("Check Version");
			menu5.add(menuItem37);

			//---- menuItem38 ----
			menuItem38.setText("Installed Extentions");
			menu5.add(menuItem38);

			//---- menuItem39 ----
			menuItem39.setText("Copyright");
			menu5.add(menuItem39);
			menu5.addSeparator();

			//---- menuItem40 ----
			menuItem40.setText("BlueJ Website");
			menu5.add(menuItem40);

			//---- menuItem41 ----
			menuItem41.setText("Online Documentation");
			menu5.add(menuItem41);

			//---- menuItem42 ----
			menuItem42.setText("Interactive Tutorial");
			menu5.add(menuItem42);

			//---- menuItem43 ----
			menuItem43.setText("Java Class Libraries");
			menu5.add(menuItem43);
		}
		menuBar1.add(menu5);
		setJMenuBar(menuBar1);

		//---- button1 ----
		button1.setText("New Class...");
		button1.addActionListener(e -> button1ActionPerformed(e));
		contentPane.add(button1);
		button1.setBounds(10, 15, 100, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setIcon(new ImageIcon(getClass().getResource("/img/arrow.PNG")));
		button2.addActionListener(e -> button2ActionPerformed(e));
		contentPane.add(button2);
		button2.setBounds(10, 40, 100, button2.getPreferredSize().height);

		//---- button3 ----
		button3.setText("Compile");
		button3.addActionListener(e -> button3ActionPerformed(e));
		contentPane.add(button3);
		button3.setBounds(10, 70, 100, button3.getPreferredSize().height);

		//---- label1 ----
		label1.setText("Teamwork");
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label1.setVisible(false);
		contentPane.add(label1);
		label1.setBounds(15, 185, 70, label1.getPreferredSize().height);

		//---- button4 ----
		button4.setText("Share...");
		button4.setVisible(false);
		button4.addActionListener(e -> {
			button4ActionPerformed(e);
			button4ActionPerformed(e);
			button4ActionPerformed(e);
		});
		contentPane.add(button4);
		button4.setBounds(25, 205, 80, button4.getPreferredSize().height);

		//---- label2 ----
		label2.setText("Testing");
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label2.setVisible(false);
		contentPane.add(label2);
		label2.setBounds(new Rectangle(new Point(15, 245), label2.getPreferredSize()));

		//---- button5 ----
		button5.setText("Run Tests");
		button5.setMargin(new Insets(2, 6, 2, 6));
		button5.setVisible(false);
		button5.addActionListener(e -> button5ActionPerformed(e));
		contentPane.add(button5);
		button5.setBounds(35, 270, 75, button5.getPreferredSize().height);

		//---- radioButton1 ----
		radioButton1.setText("Recording");
		radioButton1.setEnabled(false);
		radioButton1.setVisible(false);
		contentPane.add(radioButton1);
		radioButton1.setBounds(new Rectangle(new Point(35, 295), radioButton1.getPreferredSize()));

		//---- button6 ----
		button6.setText("End");
		button6.setEnabled(false);
		button6.setVisible(false);
		button6.addActionListener(e -> button6ActionPerformed(e));
		contentPane.add(button6);
		button6.setBounds(new Rectangle(new Point(60, 320), button6.getPreferredSize()));

		//---- button7 ----
		button7.setText("Cancel");
		button7.setMargin(new Insets(2, 4, 2, 4));
		button7.setEnabled(false);
		button7.setVisible(false);
		button7.addActionListener(e -> button7ActionPerformed(e));
		contentPane.add(button7);
		button7.setBounds(60, 350, 50, button7.getPreferredSize().height);

		//---- button8 ----
		button8.setIcon(new ImageIcon(getClass().getResource("/img/DownArrow.PNG")));
		button8.setVisible(false);
		button8.addActionListener(e -> button8ActionPerformed(e));
		contentPane.add(button8);
		button8.setBounds(40, 160, 45, 16);

		//---- button9 ----
		button9.setIcon(new ImageIcon(getClass().getResource("/img/return.PNG")));
		button9.addActionListener(e -> button9ActionPerformed(e));
		contentPane.add(button9);
		button9.setBounds(720, 580, 40, button9.getPreferredSize().height);
		contentPane.add(progressBar1);
		progressBar1.setBounds(570, 582, progressBar1.getPreferredSize().width, 25);

		//---- label3 ----
		label3.setText("Initialising Virtual Machine... Done.");
		contentPane.add(label3);
		label3.setBounds(20, 585, 175, 20);

		//---- button10 ----
		button10.setIcon(new ImageIcon(getClass().getResource("/img/UpArrow.PNG")));
		button10.addActionListener(e -> button10ActionPerformed(e));
		contentPane.add(button10);
		button10.setBounds(40, 380, 45, 19);

		//======== scrollPane1 ========
		{
			panel3.setBackground(new Color(252, 244, 244));

			// JFormDesigner evaluation mark
			panel3.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel3.getBorder())); panel3.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel3.setLayout(null);

			//---- button11 ----
			button11.setIcon(new ImageIcon(getClass().getResource("/img/document.PNG")));
			button11.addActionListener(e -> button11ActionPerformed(e));
			panel3.add(button11);
			button11.setBounds(31, 33, 50, 60);

			//---- label4 ----
			label4.setText("FirstClass");
			panel3.add(label4);
			label4.setBounds(155, 40, 60, label4.getPreferredSize().height);

			//---- button12 ----
			button12.setIcon(new ImageIcon(getClass().getResource("/img/ClassNull.png")));
			button12.addActionListener(e -> button12ActionPerformed(e));
			button12.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					button12MouseDragged(e);
				}
			});
			panel3.add(button12);
			button12.setBounds(138, 33, 90, 55);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel3.getComponentCount(); i++) {
					Rectangle bounds = panel3.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel3.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel3.setMinimumSize(preferredSize);
				panel3.setPreferredSize(preferredSize);
			}
		}
		scrollPane1.setViewportView(panel3);
		contentPane.add(scrollPane1);
		scrollPane1.setBounds(120, 20, 640, 380);

		//======== panel1 ========
		panel1.setBackground(new Color(252, 244, 244));
		panel1.setBorder(LineBorder.createBlackLineBorder());
		panel1.setLayout(null);
		button13.setIcon(new ImageIcon(getClass().getResource("/img/ArrowLeft.PNG")));
		button13.addActionListener(e -> button13ActionPerformed(e));
		panel1.add(button13);
		button13.setBounds(720, 60, 20, 55);
		button14.setIcon(new ImageIcon(getClass().getResource("/img/ArrowRight.PNG")));
		button14.setVisible(false);
		button14.addActionListener(e -> button14ActionPerformed(e));
		panel1.add(button14);
		button14.setBounds(450, 60, 20, 50);
		{
			panel2.setBackground(new Color(252, 244, 244));
			panel2.setBorder(LineBorder.createBlackLineBorder());
			panel2.setVisible(false);

			GroupLayout panel2Layout = new GroupLayout(panel2);
			panel2.setLayout(panel2Layout);
			panel2Layout.setHorizontalGroup(
				panel2Layout.createParallelGroup()
					.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
			);
			panel2Layout.setVerticalGroup(
				panel2Layout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
						.addGap(0, 138, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			);
		}
		panel1.add(panel2);
		panel2.setBounds(470, 0, 270, 160);
		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < panel1.getComponentCount(); i++) {
				Rectangle bounds = panel1.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = panel1.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			panel1.setMinimumSize(preferredSize);
			panel1.setPreferredSize(preferredSize);
		}
		contentPane.add(panel1);
		panel1.setBounds(20, 410, 740, 160);

		contentPane.setPreferredSize(new Dimension(770, 670));
		setSize(770, 670);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents

	}


	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Paul
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private JMenu menu6;
	private JMenuItem menuItem44;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenuItem menuItem10;
	private JMenuItem menuItem11;
	private JMenu menu2;
	private JMenuItem menuItem12;
	private JMenuItem menuItem13;
	private JMenuItem menuItem14;
	private JMenuItem menuItem15;
	private JMenuItem menuItem16;
	private JMenuItem menuItem17;
	private JMenu menu3;
	private JMenuItem menuItem18;
	private JMenuItem menuItem19;
	private JMenuItem menuItem20;
	private JMenuItem menuItem21;
	private JMenuItem menuItem22;
	private JMenuItem menuItem23;
	private JMenu menu7;
	private JMenuItem menuItem26;
	private JMenuItem menuItem27;
	private JMenuItem menuItem28;
	private JMenu menu8;
	private JMenuItem menuItem29;
	private JMenuItem menuItem30;
	private JMenuItem menuItem31;
	private JMenuItem menuItem32;
	private JMenuItem menuItem33;
	private JMenuItem menuItem34;
	private JMenuItem menuItem35;
	private JMenuItem menuItem24;
	private JMenuItem menuItem25;
	private JMenu menu4;
	private JCheckBoxMenuItem checkBoxMenuItem1;
	private JCheckBoxMenuItem checkBoxMenuItem2;
	private JCheckBoxMenuItem checkBoxMenuItem3;
	private JCheckBoxMenuItem checkBoxMenuItem4;
	private JCheckBoxMenuItem checkBoxMenuItem5;
	private JCheckBoxMenuItem checkBoxMenuItem6;
	private JCheckBoxMenuItem checkBoxMenuItem7;
	private JMenu menu5;
	private JMenuItem menuItem36;
	private JMenuItem menuItem37;
	private JMenuItem menuItem38;
	private JMenuItem menuItem39;
	private JMenuItem menuItem40;
	private JMenuItem menuItem41;
	private JMenuItem menuItem42;
	private JMenuItem menuItem43;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	private JButton button4;
	private JLabel label2;
	private JButton button5;
	private JRadioButton radioButton1;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JProgressBar progressBar1;
	private JLabel label3;
	private JButton button10;
	private JScrollPane scrollPane1;
	private JPanel panel3;
	private JButton button11;
	private JLabel label4;
	private JButton button12;
	private JPanel panel1;
	private JButton button13;
	private JButton button14;
	private JPanel panel2;
	private JTextField textField1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

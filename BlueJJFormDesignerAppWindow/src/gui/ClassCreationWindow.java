/*
 * Created by JFormDesigner on Thu Mar 29 12:45:40 EEST 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import codewritten.BlueJJFormDesignerMyCode;
import codewritten.NewClassWindowVisibility;

/**
 * @author Paul Chris
 */
public class ClassCreationWindow extends JFrame {
  BlueJJFormDesignerMyCode newReference;
  NewClassWindowVisibility newClassVisibility;

	public ClassCreationWindow(BlueJJFormDesignerMyCode newReference) {
    this.newReference = newReference;
		initComponents();
    newClassVisibility = new NewClassWindowVisibility(
                    toggleButton1, toggleButton2,  radioButton1,  radioButton2,
                    radioButton3,  radioButton4,  radioButton5,
                    radioButton6);
	}

	private void textField1KeyTyped(final KeyEvent e) {
		// TODO add your code here
    newReference.addTextFieldListener(textField1, button1);
	}

	private void button2ActionPerformed(final ActionEvent e) {
		// TODO add your code here
		dispose();
	}

	private void toggleButton1ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setToggleBtn1Visibility();
	}

	private void toggleButton2ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setToggleBtn2Visibility();
	}

	private void button1ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newReference.createClassIcon(textField1.getText());
		dispose();
	}

	private void radioButton1ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn1Visibility();
	}

	private void radioButton2ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn2Visibility();
	}

	private void radioButton3ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn3Visibility();
	}

	private void radioButton4ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn4Visibility();
	}

	private void radioButton5ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn5Visibility();
	}

	private void radioButton6ActionPerformed(final ActionEvent e) {
		// TODO add your code here
    newClassVisibility.setRadioBtn6Visibility();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Paul
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		toggleButton1 = new JToggleButton();
		toggleButton2 = new JToggleButton();
		label3 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		radioButton3 = new JRadioButton();
		radioButton4 = new JRadioButton();
		radioButton5 = new JRadioButton();
		radioButton6 = new JRadioButton();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setResizable(false);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("Class Name:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label1);
		label1.setBounds(25, 20, label1.getPreferredSize().width, 25);

		//---- textField1 ----
		textField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textField1KeyTyped(e);
			}
		});
		contentPane.add(textField1);
		textField1.setBounds(115, 25, 130, 20);

		//---- label2 ----
		label2.setText("Class Language:");
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label2);
		label2.setBounds(new Rectangle(new Point(25, 70), label2.getPreferredSize()));

		//---- toggleButton1 ----
		toggleButton1.setText("Java");
		toggleButton1.setSelected(true);
		toggleButton1.addActionListener(e -> toggleButton1ActionPerformed(e));
		contentPane.add(toggleButton1);
		toggleButton1.setBounds(new Rectangle(new Point(130, 65), toggleButton1.getPreferredSize()));

		//---- toggleButton2 ----
		toggleButton2.setText("Stride");
		toggleButton2.addActionListener(e -> toggleButton2ActionPerformed(e));
		contentPane.add(toggleButton2);
		toggleButton2.setBounds(new Rectangle(new Point(180, 65), toggleButton2.getPreferredSize()));

		//---- label3 ----
		label3.setText("Class Type");
		label3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label3);
		label3.setBounds(new Rectangle(new Point(30, 120), label3.getPreferredSize()));

		//---- radioButton1 ----
		radioButton1.setText("Java");
		radioButton1.setSelected(true);
		radioButton1.addActionListener(e -> radioButton1ActionPerformed(e));
		contentPane.add(radioButton1);
		radioButton1.setBounds(new Rectangle(new Point(75, 150), radioButton1.getPreferredSize()));

		//---- radioButton2 ----
		radioButton2.setText("Abstract Class");
		radioButton2.addActionListener(e -> radioButton2ActionPerformed(e));
		contentPane.add(radioButton2);
		radioButton2.setBounds(new Rectangle(new Point(75, 175), radioButton2.getPreferredSize()));

		//---- radioButton3 ----
		radioButton3.setText("Interface");
		radioButton3.addActionListener(e -> radioButton3ActionPerformed(e));
		contentPane.add(radioButton3);
		radioButton3.setBounds(new Rectangle(new Point(75, 200), radioButton3.getPreferredSize()));

		//---- radioButton4 ----
		radioButton4.setText("Unit Test");
		radioButton4.addActionListener(e -> radioButton4ActionPerformed(e));
		contentPane.add(radioButton4);
		radioButton4.setBounds(new Rectangle(new Point(75, 225), radioButton4.getPreferredSize()));

		//---- radioButton5 ----
		radioButton5.setText("Enum");
		radioButton5.addActionListener(e -> radioButton5ActionPerformed(e));
		contentPane.add(radioButton5);
		radioButton5.setBounds(new Rectangle(new Point(75, 250), radioButton5.getPreferredSize()));

		//---- radioButton6 ----
		radioButton6.setText("JavaFX Class");
		radioButton6.addActionListener(e -> radioButton6ActionPerformed(e));
		contentPane.add(radioButton6);
		radioButton6.setBounds(new Rectangle(new Point(75, 275), radioButton6.getPreferredSize()));

		//---- button1 ----
		button1.setText("OK");
		button1.setEnabled(false);
		button1.addActionListener(e -> button1ActionPerformed(e));
		contentPane.add(button1);
		button1.setBounds(125, 335, 75, button1.getPreferredSize().height);

		//---- button2 ----
		button2.setText("Cancel");
		button2.addActionListener(e -> button2ActionPerformed(e));
		contentPane.add(button2);
		button2.setBounds(new Rectangle(new Point(205, 335), button2.getPreferredSize()));

		contentPane.setPreferredSize(new Dimension(280, 400));
		setSize(280, 400);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Paul
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JToggleButton toggleButton1;
	private JToggleButton toggleButton2;
	private JLabel label3;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton5;
	private JRadioButton radioButton6;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

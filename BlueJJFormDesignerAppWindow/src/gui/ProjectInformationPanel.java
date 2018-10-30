/*
 * Created by JFormDesigner on Mon Apr 16 19:20:06 EEST 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import codewritten.BlueJJFormDesignerMyCode;

/**
 * @author Paul Chris
 */
public class ProjectInformationPanel extends JPanel {
	
  BlueJJFormDesignerMyCode newReference;
	
	public ProjectInformationPanel(int index, BlueJJFormDesignerMyCode newReference) {
		this.newReference = newReference;
		initComponents();
	}

	private void button6ActionPerformed(final ActionEvent e) {
		//TODO add your code here
    newReference.closeTab("README.TXT");
	}

	private void button1ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void button2ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void button3ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void button4ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void button5ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void button7ActionPerformed(final ActionEvent e) {
		//TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Paul
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		comboBox1 = new JComboBox();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		panel2 = new JPanel();
		separator1 = new JSeparator();
		textArea1 = new JTextArea();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(null);

		//======== panel1 ========
		{
			panel1.setBackground(new Color(102, 102, 102));
			panel1.setLayout(null);

			//---- button1 ----
			button1.setText("Compile");
			button1.setEnabled(false);
			button1.addActionListener(e -> button1ActionPerformed(e));
			panel1.add(button1);
			button1.setBounds(new Rectangle(new Point(10, 10), button1.getPreferredSize()));

			//---- button2 ----
			button2.setText("Undo");
			button2.setEnabled(false);
			button2.addActionListener(e -> button2ActionPerformed(e));
			panel1.add(button2);
			button2.setBounds(new Rectangle(new Point(85, 10), button2.getPreferredSize()));

			//---- button3 ----
			button3.setText("Cut");
			button3.addActionListener(e -> button3ActionPerformed(e));
			panel1.add(button3);
			button3.setBounds(new Rectangle(new Point(150, 10), button3.getPreferredSize()));

			//---- comboBox1 ----
			comboBox1.setEnabled(false);
			panel1.add(comboBox1);
			comboBox1.setBounds(700, 10, 95, comboBox1.getPreferredSize().height);

			//---- button4 ----
			button4.setText("Copy");
			button4.addActionListener(e -> button4ActionPerformed(e));
			panel1.add(button4);
			button4.setBounds(new Rectangle(new Point(205, 10), button4.getPreferredSize()));

			//---- button5 ----
			button5.setText("Paste");
			button5.addActionListener(e -> button5ActionPerformed(e));
			panel1.add(button5);
			button5.setBounds(new Rectangle(new Point(270, 10), button5.getPreferredSize()));

			//---- button6 ----
			button6.setText("Close");
			button6.addActionListener(e -> button6ActionPerformed(e));
			panel1.add(button6);
			button6.setBounds(new Rectangle(new Point(405, 10), button6.getPreferredSize()));

			//---- button7 ----
			button7.setText("Find...");
			button7.addActionListener(e -> button7ActionPerformed(e));
			panel1.add(button7);
			button7.setBounds(new Rectangle(new Point(335, 10), button7.getPreferredSize()));
		}
		add(panel1);
		panel1.setBounds(0, 0, 815, 45);

		//======== panel2 ========
		{
			panel2.setBackground(Color.white);
			panel2.setLayout(null);

			//---- separator1 ----
			separator1.setOrientation(SwingConstants.VERTICAL);
			separator1.setBackground(Color.black);
			panel2.add(separator1);
			separator1.setBounds(50, 0, 5, 260);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel2.getComponentCount(); i++) {
					Rectangle bounds = panel2.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel2.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel2.setMinimumSize(preferredSize);
				panel2.setPreferredSize(preferredSize);
			}
		}
		add(panel2);
		panel2.setBounds(0, 45, 55, 605);

		//---- textArea1 ----
		textArea1.setText("------------------------------------------------------------------------\nThis is the project README file. Here, you should describe your project.\nTell the reader (someone who does not know anything about this project)\nall he/she needs to know. The comments should usually include at least:\n------------------------------------------------------------------------\n\nPROJECT TITLE:\nPURPOSE OF PROJECT:\nVERSION or DATE:\nHOW TO START THIS PROJECT:\nAUTHORS:\nUSER INSTRUCTIONS:");
		textArea1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		add(textArea1);
		textArea1.setBounds(55, 45, 760, 598);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < getComponentCount(); i++) {
				Rectangle bounds = getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			setMinimumSize(preferredSize);
			setPreferredSize(preferredSize);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Paul
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JComboBox comboBox1;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JPanel panel2;
	private JSeparator separator1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

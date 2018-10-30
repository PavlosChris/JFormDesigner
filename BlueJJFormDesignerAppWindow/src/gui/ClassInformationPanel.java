/*
 * Created by JFormDesigner on Mon Apr 16 19:45:16 EEST 2018
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import codewritten.BlueJJFormDesignerMyCode;

/**
 * @author Paul Chris
 */
public class ClassInformationPanel extends JPanel {

  String tabName;
  BlueJJFormDesignerMyCode newReference;

	public ClassInformationPanel(String tabName, BlueJJFormDesignerMyCode newReference) {
    this.newReference = newReference;
    this.tabName = tabName;
		initComponents();
	}

	private void button7ActionPerformed(final ActionEvent e) {
		//TODO add your code here
    newReference.closeTab(tabName);
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

	private void button6ActionPerformed(final ActionEvent e) {
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
		panel3 = new JPanel();
		scrollPane1 = new JScrollPane();
		panel2 = new JPanel();
		panel4 = new JPanel();
		textArea1 = new JTextArea();
		textArea2 = new JTextArea();
		panel5 = new JPanel();
		textArea3 = new JTextArea();
		panel6 = new JPanel();
		textArea4 = new JTextArea();
		textArea5 = new JTextArea();
		textArea6 = new JTextArea();
		panel7 = new JPanel();
		textArea7 = new JTextArea();
		textArea8 = new JTextArea();

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
			panel1.add(comboBox1);
			comboBox1.setBounds(675, 15, 120, comboBox1.getPreferredSize().height);

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
			button6.setText("Find...");
			button6.addActionListener(e -> button6ActionPerformed(e));
			panel1.add(button6);
			button6.setBounds(new Rectangle(new Point(340, 10), button6.getPreferredSize()));

			//---- button7 ----
			button7.setText("Close");
			button7.addActionListener(e -> button7ActionPerformed(e));
			panel1.add(button7);
			button7.setBounds(new Rectangle(new Point(415, 10), button7.getPreferredSize()));
		}
		add(panel1);
		panel1.setBounds(0, 0, 815, 45);

		//======== panel3 ========
		{
			panel3.setBackground(new Color(204, 204, 204));
			panel3.setLayout(new FlowLayout());
		}
		add(panel3);
		panel3.setBounds(0, 45, 60, 585);

		//======== scrollPane1 ========
		{

			//======== panel2 ========
			{
				panel2.setBackground(Color.white);

				//======== panel4 ========
				{
					panel4.setBackground(new Color(204, 255, 204));

					//---- textArea1 ----
					textArea1.setBackground(new Color(204, 255, 204));
					textArea1.setText("/**\n * Write a description of class FirstClass here.\n *\n * @author (your name)\n * @version (a version number or a date)\n */\npublic class FirstClass\n{");
					textArea1.setFont(new Font("Monospaced", Font.PLAIN, 12));

					//---- textArea2 ----
					textArea2.setText("// instance variables - replace the example below with your own\n    private int x;");
					textArea2.setFont(new Font("Monospaced", Font.PLAIN, 12));

					//======== panel5 ========
					{
						panel5.setBackground(Color.white);

						//---- textArea3 ----
						textArea3.setBackground(new Color(255, 255, 204));
						textArea3.setText("/**\n     * Constructor for objects of class FirstClass\n     */\n    public FirstClass()\n    {");
						textArea3.setFont(new Font("Monospaced", Font.PLAIN, 12));

						//======== panel6 ========
						{
							panel6.setBackground(new Color(255, 255, 204));

							//---- textArea4 ----
							textArea4.setText("// initialise instance variables\nx = 0;");
							textArea4.setFont(new Font("Monospaced", Font.PLAIN, 12));

							//---- textArea5 ----
							textArea5.setBackground(new Color(255, 255, 204));
							textArea5.setText("}");
							textArea5.setFont(new Font("Monospaced", Font.PLAIN, 12));

							GroupLayout panel6Layout = new GroupLayout(panel6);
							panel6.setLayout(panel6Layout);
							panel6Layout.setHorizontalGroup(
								panel6Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
										.addGap(49, 49, 49)
										.addComponent(textArea4)
										.addContainerGap())
									.addGroup(panel6Layout.createSequentialGroup()
										.addGap(30, 30, 30)
										.addComponent(textArea5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel6Layout.setVerticalGroup(
								panel6Layout.createParallelGroup()
									.addGroup(panel6Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(textArea4)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(textArea5)
										.addContainerGap())
							);
						}

						//---- textArea6 ----
						textArea6.setBackground(new Color(255, 255, 204));
						textArea6.setText("/**\n     * An example of a method - replace this comment with your own\n     *\n     * @param  y  a sample parameter for a method\n     * @return    the sum of x and y\n     */\n    public int sampleMethod(int y)\n    {");
						textArea6.setFont(new Font("Monospaced", Font.PLAIN, 12));

						//======== panel7 ========
						{
							panel7.setBackground(new Color(255, 255, 204));

							//---- textArea7 ----
							textArea7.setText("// put your code here\n return x + y;");
							textArea7.setFont(new Font("Monospaced", Font.PLAIN, 12));

							//---- textArea8 ----
							textArea8.setBackground(new Color(255, 255, 204));
							textArea8.setText("}");
							textArea8.setFont(new Font("Monospaced", Font.PLAIN, 12));

							GroupLayout panel7Layout = new GroupLayout(panel7);
							panel7.setLayout(panel7Layout);
							panel7Layout.setHorizontalGroup(
								panel7Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
										.addGap(45, 45, 45)
										.addComponent(textArea7)
										.addContainerGap())
									.addGroup(panel7Layout.createSequentialGroup()
										.addGap(31, 31, 31)
										.addComponent(textArea8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							);
							panel7Layout.setVerticalGroup(
								panel7Layout.createParallelGroup()
									.addGroup(panel7Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(textArea7, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
										.addComponent(textArea8))
							);
						}

						GroupLayout panel5Layout = new GroupLayout(panel5);
						panel5.setLayout(panel5Layout);
						panel5Layout.setHorizontalGroup(
							panel5Layout.createParallelGroup()
								.addGroup(panel5Layout.createSequentialGroup()
									.addContainerGap()
									.addGroup(panel5Layout.createParallelGroup()
										.addComponent(textArea3)
										.addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textArea6, GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
										.addComponent(panel7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addContainerGap())
						);
						panel5Layout.setVerticalGroup(
							panel5Layout.createParallelGroup()
								.addGroup(panel5Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(textArea3)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(textArea6, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addContainerGap(21, Short.MAX_VALUE))
						);
					}

					GroupLayout panel4Layout = new GroupLayout(panel4);
					panel4.setLayout(panel4Layout);
					panel4Layout.setHorizontalGroup(
						panel4Layout.createParallelGroup()
							.addGroup(panel4Layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addGroup(panel4Layout.createParallelGroup()
									.addGroup(panel4Layout.createSequentialGroup()
										.addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 591, GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
									.addGroup(panel4Layout.createSequentialGroup()
										.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
											.addComponent(panel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textArea2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
										.addContainerGap(23, Short.MAX_VALUE))))
					);
					panel4Layout.setVerticalGroup(
						panel4Layout.createParallelGroup()
							.addGroup(panel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(textArea1)
								.addGap(3, 3, 3)
								.addComponent(textArea2, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(61, Short.MAX_VALUE))
					);
				}

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
			}
			scrollPane1.setViewportView(panel2);
		}
		add(scrollPane1);
		scrollPane1.setBounds(60, 45, 755, 580);

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

		comboBox1.insertItemAt("Source Code", 0);
		comboBox1.insertItemAt("Documentation", 1);
		comboBox1.setSelectedIndex(0);
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
	private JPanel panel3;
	private JScrollPane scrollPane1;
	private JPanel panel2;
	private JPanel panel4;
	private JTextArea textArea1;
	private JTextArea textArea2;
	private JPanel panel5;
	private JTextArea textArea3;
	private JPanel panel6;
	private JTextArea textArea4;
	private JTextArea textArea5;
	private JTextArea textArea6;
	private JPanel panel7;
	private JTextArea textArea7;
	private JTextArea textArea8;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

package codewritten;

import java.awt.GridLayout;
import javax.swing.*;


public class MainFrameVisibility {

	private JButton button4, button5, button6, button7, button8,
		button10, button12, button13, button14;
	private JLabel label1, label2, label4;
	private JRadioButton radioButton1;
	private JPanel panel2;

	public MainFrameVisibility(final JButton button4, final JButton button5, final JButton button6,
			final JButton button7, final JButton button8, final JButton button10,
			final JButton button13, final JButton button14, final JLabel label1, 
			final JLabel label2, final JRadioButton radioButton1,
			final JPanel panel2, final JButton button12, final JLabel label4) {
		this.button4 = button4; this.button5 = button5; this.button6 = button6;
		this.button7 = button7; this.button8 = button8; this.button10 = button10;
		this.button13 = button13; this.button14 = button14; this.label1 = label1;
		this.label2 = label2; this.radioButton1 = radioButton1;
		this.panel2 = panel2; this.button12 = button12; this.label4 = label4;
		addLblToBtn12();
	}

	public final void addLblToBtn12() {
		button12.setLayout(new GridLayout(2, 1));
		button12.add(label4);
	}

	public final void changeVisibilityUpArrow() {
		changeVisibilityUpDownArrow(true);
	}

	public final void changeVisibilityDownArrow() {
		changeVisibilityUpDownArrow(false);
	}

	private void changeVisibilityUpDownArrow(final boolean visibilityValue) {
		label1.setVisible(visibilityValue);
		button8.setVisible(visibilityValue);
		button5.setVisible(visibilityValue);
		button4.setVisible(visibilityValue);
		label2.setVisible(visibilityValue);
		button7.setVisible(visibilityValue);
		button6.setVisible(visibilityValue);
		radioButton1.setVisible(visibilityValue);
		button10.setVisible(!visibilityValue);
	}

	public final void changeVisibilityLeftArrow() {
		changeVisibilityLeftRightArrow(true);
	}

	public final void changeVisibilityRightArrow() {
		changeVisibilityLeftRightArrow(false);
	}

	private void changeVisibilityLeftRightArrow(final boolean visibilityValue) {
		panel2.setVisible(visibilityValue);
		button14.setVisible(visibilityValue);
		button13.setVisible(!visibilityValue);
	}
}

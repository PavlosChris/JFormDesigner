package codewritten;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class NewClassWindowVisibility {

	private JToggleButton toggleButton1;
	private JToggleButton toggleButton2;
	private JRadioButton radioButton1, radioButton2, radioButton3,
				radioButton4, radioButton5, radioButton6;
	private JRadioButton[] radioButtons;

	public NewClassWindowVisibility(final JToggleButton toggleButton1, final JToggleButton toggleButton2,
			final JRadioButton radioButton1, final JRadioButton radioButton2, final JRadioButton radioButton3,
			final JRadioButton radioButton4, final JRadioButton radioButton5, final JRadioButton radioButton6) {
		this.toggleButton1 = toggleButton1;
		this.toggleButton2 = toggleButton2;
		this.radioButton1 = radioButton1;
		this.radioButton2 = radioButton2;
		this.radioButton3 = radioButton3;
		this.radioButton4 = radioButton4;
		this.radioButton5 = radioButton5;
		this.radioButton6 = radioButton6;
		radioButtons = new JRadioButton[]{radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6};
	}

	public final void setToggleBtn1Visibility() {
		if (toggleButton1.isSelected()) {
			toggleButton2.setSelected(false);
		}
		setToggleBtnVisibility(true);
	}

	public final void setToggleBtn2Visibility() {
		if (toggleButton2.isSelected()) {
			toggleButton1.setSelected(false);
		}
		setToggleBtnVisibility(false);
	}

	private void setToggleBtnVisibility(final boolean visibilityValue) {
		radioButton4.setVisible(visibilityValue);
		radioButton5.setVisible(visibilityValue);
		radioButton6.setVisible(visibilityValue);
	}

	public final void setRadioBtn1Visibility() {
		setRdButtonSelected(radioButton1);
	}

	public final void setRadioBtn2Visibility() {
		setRdButtonSelected(radioButton2);
	}

	public final void setRadioBtn3Visibility() {
		setRdButtonSelected(radioButton3);
	}

	public final void setRadioBtn4Visibility() {
		setRdButtonSelected(radioButton4);
	}

	public final void setRadioBtn5Visibility() {
		setRdButtonSelected(radioButton5);
	}

	public final void setRadioBtn6Visibility() {
		setRdButtonSelected(radioButton6);
	}

	private void setRdButtonSelected(final JRadioButton buttonSelected) {
		for (int i = 0; i < 6; i++) {
			if (buttonSelected != radioButtons[i]) {
				radioButtons[i].setSelected(false);
			}
		}
	}
}

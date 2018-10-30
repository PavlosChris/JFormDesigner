package codewritten;

import javax.swing.ImageIcon;

public class ClassWidget {

	private String name;
	private int windowX;
	private int windowY;
	private ImageIcon img;
	private boolean dragged;

	public ClassWidget(final String name, final ImageIcon img,
			final BlueJJFormDesignerMyCode newReference) {
		this.name = name;
		this.img = img;
		dragged = false;
	}

    public final void setDragged(final boolean dragged) {
		this.dragged = dragged;
	}

	public final boolean getDragged() {
		return dragged;
	}

	public final void setWindowX(final int winX) {
		windowX = winX;
	}

	public final void setWindowY(final int winY) {
		windowY = winY;
	}

	public final String getName() {
		return name;
	}

	public final int getWindowX() {
		return windowX;
	}

	public final int getWindowY() {
		return windowY;
	}

	public final ImageIcon getImageIcon() {
		return img;
	}

}

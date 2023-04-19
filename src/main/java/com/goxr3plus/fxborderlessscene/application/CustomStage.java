package com.goxr3plus.fxborderlessscene.application;

import com.goxr3plus.fxborderlessscene.borderless.BorderlessScene;

import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomStage extends Stage {
	public CustomStage() {}
	
	public CustomStage(StageStyle style) {
		super(style);
	}
	
	public BorderlessScene craftBorderlessScene(Parent sceneRoot) {
		return new BorderlessScene(this, getStyle(), sceneRoot);
	}
	
	public void showAndAdjust() {
		if(isShowing())
			return;
		show();
		makeMinimizableOnIconClick();
	}

	private void makeMinimizableOnIconClick() {
		/*
		 * long lhwnd = com.sun.glass.ui.Window.getWindows().get(0).getNativeWindow();
		 * Pointer lpVoid = new Pointer(lhwnd); WinDef.HWND hwnd = new
		 * WinDef.HWND(lpVoid); final User32 user32 = User32.INSTANCE; int oldStyle =
		 * user32.GetWindowLong(hwnd, WinUser.GWL_STYLE); int newStyle = oldStyle |
		 * 0x00020000;//WS_MINIMIZEBOX user32.SetWindowLong(hwnd, WinUser.GWL_STYLE,
		 * newStyle);
		 */
		throw new UnsupportedOperationException("Doesn't work cleanly with modules, is not cross platform. Re-implement.");
	}
}

module com.goxr3plus.fxborderlessscene {
	requires transitive javafx.controls;
	requires transitive javafx.fxml;
	requires java.logging;
	exports com.goxr3plus.fxborderlessscene.borderless;
	exports com.goxr3plus.fxborderlessscene.window;
	opens com.goxr3plus.fxborderlessscene.borderless;
	opens com.goxr3plus.fxborderlessscene.window;
}
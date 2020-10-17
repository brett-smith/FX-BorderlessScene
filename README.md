 
---

<h3 align="center" > FX-BorderlessScene ( Library )</h3>
<p align="center"> 
💠 
</p>
<p align="center"> 
<sup>
<b> Undecorated JavaFX Scene with implemented move, resize, minimise, maximise, close and Windows Aero Snap controls. </b>
<b> Implement any style you want for your JavaFX application using custom css or default . <b>
</sup>
</p>

--- 

## About This Fork

This fork of (https://github.com/goxr3plus/FX-BorderlessScene)[FX-BorderlessScene] was created to :-
 
  * Be compatible with Java 9 and the module system.
  * Fix a couple of bugs.
  * Get it into Maven central.

## Features
- **Done ✔️**
  - Implemented drag and move
  - resize, minimise, maximise, close
  - Windows Aero Snap controls.
  - Styling Aero Snap window
  - Styling Main window
- **TODO 🚧**
  - Multiple Screens Support
  - Fix lagging on resizing

### Use it with Maven , Gradle etc ... with 

This library is in Maven Central, so just add the dependency : 
  
``` XML
<dependency>
  <groupId>uk.co.bithatch</groupId>
  <artifactId>FX-BorderlessScene</artifactId>
  <version>5.0.0-SNAPSHOT</version>
</dependency>
```

### > Advanced example (styling AeroSnap Window , spying window maximize status etc ) with ready code for you to run 

Main Window -> [here](https://github.com/goxr3plus/FX-BorderlessScene/blob/master/src/main/java/com/goxr3plus/fxborderlessscene/application/Main.java)

Main Window Controller -> [here](https://github.com/goxr3plus/FX-BorderlessScene/blob/master/src/main/java/com/goxr3plus/fxborderlessscene/application/MainWindowController.java)

###  Simple example

``` JAVA
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import com.goxr3plus.fxborderlessscene.borderless.BorderlessScene;

/**
 * Testing the application to see if it works
 * 
 * @author GOXR3PLUS
 *
 */
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//BorderPane
		BorderPane borderPane = new BorderPane();
		
		//Create a Top Label
		Label topLabel = new Label("Drag Me :)");
		topLabel.setMinHeight(50);
		topLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		topLabel.setStyle("-fx-background-color:#303030; -fx-text-fill:white; -fx-font-weight:bold;");
		topLabel.setAlignment(Pos.CENTER);
		borderPane.setTop(topLabel);
		
		//Close Button
		Button closeButton = new Button("Exit");
		closeButton.setOnAction(a -> primaryStage.close());
		
		// Constructor using your primary stage and the root Parent of your content.
		BorderlessScene scene = new BorderlessScene(primaryStage, StageStyle.UNDECORATED, borderPane, 250, 250);
		primaryStage.setScene(scene); // Set the scene to your stage and you're done!
		
		//Close Button
		Button removeDefaultCSS = new Button("Remove Default Corners CSS");
		removeDefaultCSS.setOnAction(a -> scene.removeDefaultCSS());
		
		//BorderPane
		HBox hbox = new HBox(removeDefaultCSS,closeButton);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(15);
		borderPane.setCenter(hbox);
		
		//remove the default css style
		//scene.removeDefaultCSS();
		
		// Maximise (on/off) and minimise the application:
		//scene.maximizeStage();
		//scene.minimizeStage();
		
		// To move the window around by pressing a node:
		scene.setMoveControl(topLabel);
		
		// To disable resize:
		//scene.setResizable(false);
		
		// To switch the content during runtime:
		//scene.setContent(yourNewParent);
		
		// Check if maximised:
		//Boolean bool = scene.isMaximised();
		
		// Get windowed* size and position:
		//scene.getWindowedSize();
		//scene.getWindowedPosition();
		
		//Show
		primaryStage.setTitle("Draggable and Undecorated JavaFX Window");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}

```

### [XR3Player](https://github.com/goxr3plus/XR3Player) is using the original version of Library 
| Video|
|:-:|
| [![First](https://user-images.githubusercontent.com/20374208/48313813-34fdc180-e5ca-11e8-9da7-c6148dc0cbe5.png)](https://www.youtube.com/watch?v=7Hai7cavmUY)  |
---

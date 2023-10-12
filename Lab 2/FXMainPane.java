import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	 HBox H_1;
	 HBox H_2;
	TextField t1;
	Button Hello, Howdy, Chinese, Clear, Exit;
	
	DataManager datamanager;
	
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		H_1 = new HBox();
		H_2 = new HBox();
		Hello = new Button("Hello");
		Chinese = new Button("Chinese");
		Howdy = new Button("Howdy");
		Clear = new Button("Clear");
	    Exit = new Button("Exit");
		
		Label l1 = new Label("Feedback");
		 t1 = new TextField();
		
		//student Task #4:
	//  instantiate the DataManager instance
		datamanager  = new DataManager();	
		H_1.setAlignment(Pos.CENTER);
		H_2.setAlignment(Pos.CENTER);

		
		//  set margins and set alignment of the components
		VBox.setMargin(H_2, new Insets(10, 10, 10, 10)); 
		
		
				//student Task #3:
			H_1.getChildren().addAll(Hello,Chinese,Howdy,Clear,Exit);
			H_2.getChildren().addAll(l1,t1);
			getChildren().addAll(H_1,H_2);
			
			HBox.setMargin(Hello, new Insets(5));
	        HBox.setMargin(Howdy, new Insets(5));
	        HBox.setMargin(Chinese, new Insets(5));
	        HBox.setMargin(Clear, new Insets(5));
	        HBox.setMargin(Exit, new Insets(5));
			
			Hello.setOnAction(new ButtonHandler());
			Howdy.setOnAction(new ButtonHandler());
			Chinese.setOnAction(new ButtonHandler());
			Clear.setOnAction(new ButtonHandler());
			Exit.setOnAction(new ButtonHandler());
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
	}	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent>{
		
		
		public void handle(ActionEvent event) {
			if(event.getTarget() == Hello) {
				t1.setText(datamanager.getHello());	
			}
			else if(event.getTarget() == Howdy) {
				t1.setText(datamanager.getHowdy());		
		}
			else if(event.getTarget() == Chinese) {
				t1.setText(datamanager.getChinese());
			}
			
			else if(event.getTarget() == Clear) {
				t1.setText("");
			}
			else if(event.getTarget()==Exit) {
				Platform.exit();
				System.exit(0);
			}
		}
	}
}
	
package mafia;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MarfiaMain  extends Application{
	public static void main(String[] args) {
	       launch(args);
	}
	
	void initialCenter(FlowPane center){
		Label label1 = new Label("NumberOfTotalCards:");
		TextField textField = new TextField ();
		
		Label label2 = new Label("NumberOfTotalMarfia:");
		TextField textField2 = new TextField ();
		
		Label label3 = new Label("NumberOfTotalSeer:");
		TextField textField3 = new TextField ();
		
		Label label4 = new Label("NumberOfTotalWizard:");
		TextField textField4 = new TextField ();
		
		Label label5 = new Label("NumberOfTotalHunter:");
		TextField textField5 = new TextField ();
		
		Label label6 = new Label("NumberOfTotalIdiot:");
		TextField textField6 = new TextField ();
		
		
		
		center.getChildren().addAll(label1,textField,label2,textField2,label3,textField3,label4,textField4);
		center.getChildren().addAll(label5,textField5,label6,textField6);
		
		textField.setText("14");
		
		textField2.setText("4");
		
		textField3.setText("1");
		
		textField4.setText("1");
		
		textField5.setText("1");
		
		textField6.setText("1");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane borderPane=new BorderPane();
		HBox hbox = new HBox();
		VBox vBox=new VBox();
		FlowPane flow = new FlowPane();
		borderPane.setTop(hbox);
		borderPane.setLeft(vBox);
		borderPane.setCenter(flow);
		flow.setPadding(new Insets(5, 0, 5, 0));
	    flow.setVgap(4);
	    flow.setHgap(4);
	    flow.setPrefWrapLength(170); // preferred width allows for two columns
	    flow.setStyle("-fx-background-color: DAE6F3;");
	    initialCenter(flow);
	    
	    
	    
		Scene scene =new Scene(borderPane, 640, 640);
		primaryStage.setTitle("MarSim");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    
	}
}

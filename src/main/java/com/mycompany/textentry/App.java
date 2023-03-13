package com.mycompany.textentry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import java.io.IOException;


public class App extends Application {

	Stage window;
	Scene scene1;
	
	public static void main(String[] args) {
		launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
		
		window = primaryStage;
		
		Label fName = new Label("First Name: ");
		Label lName = new Label("Last Name: ");
		Label studentID = new Label("Student  ID: ");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		
		GridPane.setConstraints(fName, 0, 0);
		grid.getChildren().add(fName);
		GridPane.setConstraints(lName, 0, 1);
		grid.getChildren().add(lName);
		GridPane.setConstraints(studentID, 0, 2);
		grid.getChildren().add(studentID);
		
		final TextField firstName = new TextField();
		firstName.setPromptText("Enter the first name");
		firstName.setPrefColumnCount(10);
		//firstName.getText();
		GridPane.setConstraints(firstName, 1, 0);
		grid.getChildren().add(firstName);
		//System.out.println(firstName.getText());
		
		final TextField lastName = new TextField();
		lastName.setPromptText("Enter the last name");
		GridPane.setConstraints(lastName, 1, 1);
		grid.getChildren().add(lastName);
		
		final TextField id = new TextField();
		id.setPromptText("Enter student ID");
		id.setPrefColumnCount(10);
		//id.getText();
		GridPane.setConstraints(id, 1, 2);
		grid.getChildren().add(id);
		
		Button button1 = new Button("Create Account");
		button1.setOnAction(e -> {
			Account test = new Account(firstName.getText(), 
					lastName.getText(), id.getText());
			System.out.println(test);
		});
		
		GridPane.setConstraints(button1, 2, 0);
		grid.getChildren().add(button1);
		
		scene1 = new Scene(grid, 400, 150);
		
		window.setScene(scene1);
		window.setTitle("Create Account");
		window.show();
			
    }
}
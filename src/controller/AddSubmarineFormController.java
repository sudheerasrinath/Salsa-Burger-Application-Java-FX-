package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddSubmarineFormController {

    public TextField txtSubmarineName;
    public TextField txtPrice;
    public AnchorPane MainContext;

    public void btnAddSubmarineOnAction(ActionEvent actionEvent) {
    }



    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealManagementForm");
    }
    private void setUi(String URI) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + URI + ".fxml"))));

    }
}

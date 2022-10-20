package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewSupplierFormController {

    public TextField txtSupplierName;
    public TextField txtTelephone;
    public TextField txtAddress;
    public TextField txtSupplierID;
    public AnchorPane MainContext;

    public void btnAddSupplierOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SupplierManagementForm");
    }

    private void setUi(String URI) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + URI + ".fxml"))));

    }
}

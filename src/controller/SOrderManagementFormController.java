package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class SOrderManagementFormController {

    public AnchorPane MainContext;

    public void btnMealManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealManagementForm");
    }

    public void btnSupplierOrderManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SOrderManagementForm");
    }

    public void btnSupplierManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SupplierManagementForm");
    }

    public void btnIncomeDetailsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MonthlyIncomeDetailsForm");
    }

    public void BtnAddNEwSupplierOrderOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AddNewSOrderForm");
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("OrderManagementForm");

    }

    private void setUi(String URI) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + URI + ".fxml"))));
    }
}

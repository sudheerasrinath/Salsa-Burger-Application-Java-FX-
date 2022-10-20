package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class OrderManagementFormController {
    public Label lblReceipt;
    public TextField txtTelephone;
    public TextField txtSubmarineQty;
    public TextField txtBurgerQty;
    public TextArea txtAddress;
    public TextField txtCustomerName;
    public TextField txtCostOfBurgers;
    public TextField txtCostOfSubmarines;
    public TextField txtDeliveryCharges;
    public ComboBox cmbSelectSubmarine;
    public ComboBox cmbSelectBurger;
    public AnchorPane MainContext;


    public void cbHomeDeliveryOnAction(ActionEvent actionEvent) {
    }

    public void btnTotalOnAction(ActionEvent actionEvent) {
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
    }

    public void btnReceiptOnAction(ActionEvent actionEvent) {
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
    }

    public void btnAddBurgerOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void btnMealManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealManagementForm");
    }

    public void btnSupplierOrderManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SOrderManagementForm");
    }

    public void btnSupplierManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SupplierManagementForm");
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));

        stage.centerOnScreen();

    }

    public void btnIncomeDetailsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MonthlyIncomeDetailsForm");
    }

    public void btnAddSubmarineOnAction(ActionEvent actionEvent) {

    }
    private void setUi(String URI) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+URI+".fxml"))));
    }
}

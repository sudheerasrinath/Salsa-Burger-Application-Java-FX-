package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LogInFormController {

    public TextField txtUsername;
    public PasswordField pwdPassword;
    public AnchorPane MainContext;


    int attempts = 0;

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        attempts++;
        if (attempts <= 3) {
            if (txtUsername.getText().equals("admin") && pwdPassword.getText().equals("1234")) {
                new Alert(Alert.AlertType.CONFIRMATION, "Success!").showAndWait();
                    Stage stage = (Stage) MainContext.getScene().getWindow();
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OrderManagementForm.fxml"))));

                    stage.centerOnScreen();


            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again!").show();
            }
        } else {
            txtUsername.setEditable(false);
            pwdPassword.setEditable(false);
        }
    }


    public void btnCancelOnAction(ActionEvent actionEvent) throws IOException {

    }

    private void setUi(String URI) throws IOException {
        Stage stage = (Stage) MainContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+URI+".fxml"))));
    }


}

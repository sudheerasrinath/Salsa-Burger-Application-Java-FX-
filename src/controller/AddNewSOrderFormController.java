package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewSOrderFormController {
   ;
   public TextField txtIngredient;
   public TextField txtQuantity;
   public TextField txtPrice;
   public TextField txtSOrderID;
   public AnchorPane MainContext;

   public void btnAddSOrderIDOnAction(ActionEvent actionEvent) {
   }

   public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
      setUi("SOrderManagementForm");
   }

   private void setUi(String URI) throws IOException {
      Stage stage = (Stage) MainContext.getScene().getWindow();
      stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/" + URI + ".fxml"))));
   }
}

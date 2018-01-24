package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    private Text animalName;

    @FXML
    private Button Dog;

    @FXML
    private Button Cat;

    @FXML
    private Button Fish;

public void clickedTheDogButton(ActionEvent actionEvent){
           animalName.setText("Woof");
     }
    public void clickedTheCatButton(ActionEvent actionEvent) {
        animalName.setText("Meow");
    }
        public void clickedTheFishButton(ActionEvent actionEvent) {
            animalName.setText("Bubble");
        }
}
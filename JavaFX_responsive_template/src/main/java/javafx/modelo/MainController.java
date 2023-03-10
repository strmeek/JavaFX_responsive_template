package javafx.modelo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    /* you don't NEED(you can, as shown in the
    * library site: https://guigarage.com/2014/11/responsive-design-javafx/)
    * to create the javafx object on the java application,
    * you can create on the fxml(scenebuilder) and once you declared the
    * object on the controller he'll work with the responsive fx
    * that means you will do more coding on the css file(example on style.css) using
    * responsivefx library, which is really great and keep all
    * organized in the controller */

    /* FXML VARIABLES MADE BY SCENEBUILDER for example:*/
    @FXML
    private Button bt_add_menu;

    @FXML
    private Button bt_config_menu;

    @FXML
    private Button bt_filters_tasks;

    @FXML
    private Button bt_home_menu;

    @FXML
    private Button bt_otherdate_left_tasks;

    @FXML
    private Button bt_otherdate_right_tasks;

    @FXML
    private Button bt_search_tasks;

    @FXML
    private Button bt_tasks_menu;

    @FXML
    private Button bt_today_tasks;

    @FXML
    private Button bt_tomorrow_tasks;

    @FXML
    private Button bt_yesterday_tasks;

    @FXML
    private Pane pane_add;

    @FXML
    private Pane pane_config;

    @FXML
    private Pane pane_home;

    @FXML
    private Pane pane_tasks;

    @FXML
    private Pane pane_filter;

    @FXML
    private TextField txtfield_search_tasks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /* SIMPLE MENU BUTTONS */
        bt_add_menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pane_add.toFront();
            }
        });
        bt_config_menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pane_config.toFront();
            }
        });
        bt_tasks_menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pane_tasks.toFront();
            }
        });
        bt_home_menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pane_home.toFront();
            }
        });
    }
    /* Hover effect on the filter button
    * used in both filter button and filter pane(filter tab) */

    @FXML
    public void btFilterMouseEntered(){
        pane_filter.toFront();
    }
    @FXML
    public void btFilterMouseExited(){
        pane_filter.toBack();
    }


}
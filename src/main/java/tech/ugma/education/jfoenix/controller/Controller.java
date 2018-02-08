package tech.ugma.education.jfoenix.controller;

import com.jfoenix.controls.JFXTreeView;
import com.jfoenix.controls.RecursiveTreeItem;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import tech.ugma.education.jfoenix.model.Item;

public class Controller {


    @FXML
    TableView<Item> tableView;

    @FXML
    TableColumn<Item, Integer> itemNumberColumn;

    @FXML
    TableColumn<Item, String> skuColumn;



    @FXML
    public void initialize() {
        System.out.println(tableView.getUserAgentStylesheet());
        itemNumberColumn.setCellValueFactory(cellData -> cellData.getValue().itemNumberProperty().asObject());
        skuColumn.setCellValueFactory(cellData -> cellData.getValue().skuProperty());

        tableView.getItems().addAll(
                new Item(1234, "Red"),
                new Item (9876, "Blue")
        );

        // TODO: 2/7/2018 Fill JFXTreeTableView with sample data
    }
}

package tech.ugma.education.jfoenixtableview.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import tech.ugma.education.jfoenixtableview.launcher.Launcher;
import tech.ugma.education.jfoenixtableview.model.Item;

public class Controller {


    @FXML
    TableView<Item> tableViewMatchingJFXTreeTableView;

    @FXML
    TableColumn<Item, Integer> jfxItemNumberColumn;

    @FXML
    TableColumn<Item, String> jfxSkuColumn;


    @FXML
    TableView<Item> tableViewMatchingMaterialDesign;

    @FXML
    TableColumn<Item, Integer> materialDesignItemNumberColumn;

    @FXML
    TableColumn<Item, String> materialDesignSkuColumn;


    private ObservableList<Item> sampleList;



    @FXML
    public void initialize() {
        System.out.println(tableViewMatchingJFXTreeTableView.getUserAgentStylesheet());

        prepareSampleList();

        initTableViewMatchingJFXTreeTableView();

        initTableViewMatchingMaterialDesign();


        // TODO: 2/7/2018 Fill JFXTreeTableView with sample data
    }

    private void prepareSampleList() {
        sampleList = FXCollections.observableArrayList(
                new Item(1234, "Red"),
                new Item(9876, "Blue")
        );
    }

    private void initTableViewMatchingMaterialDesign() {
        materialDesignItemNumberColumn.setCellValueFactory(cellData -> cellData.getValue().itemNumberProperty().asObject());
        materialDesignSkuColumn.setCellValueFactory(cellData -> cellData.getValue().skuProperty());

        tableViewMatchingMaterialDesign.getItems().setAll(sampleList);

    }

    private void initTableViewMatchingJFXTreeTableView() {
        jfxItemNumberColumn.setCellValueFactory(cellData -> cellData.getValue().itemNumberProperty().asObject());
        jfxSkuColumn.setCellValueFactory(cellData -> cellData.getValue().skuProperty());

        tableViewMatchingJFXTreeTableView.getItems().setAll(sampleList);

    }

    @FXML
    public void linkToMaterialDesignGuidelines() {
        Launcher.hostServices.showDocument("https://material.io/design/components/data-tables.html#usage");
    }
}

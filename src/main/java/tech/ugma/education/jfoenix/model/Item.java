package tech.ugma.education.jfoenix.model;

import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.util.Callback;

public class Item extends RecursiveTreeObject<Item> {
    IntegerProperty itemNumber = new SimpleIntegerProperty();
    StringProperty sku = new SimpleStringProperty();

    public Item(Integer itemNumber, String sku) {
        this.itemNumber = new SimpleIntegerProperty(itemNumber);
        this.sku = new SimpleStringProperty(sku);
    }

    public int getItemNumber() {
        return itemNumber.get();
    }

    public IntegerProperty itemNumberProperty() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber.set(itemNumber);
    }

    public String getSku() {
        return sku.get();
    }

    public StringProperty skuProperty() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku.set(sku);
    }
}

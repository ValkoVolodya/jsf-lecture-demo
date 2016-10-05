package entity;

import javax.faces.bean.ManagedBean;

/**
 * Created by insomniac on 10/5/16.
 */
@ManagedBean(name="car")
public class Car {
    private int id;
    private String model;
    private String manufacturer;
    private String license;

    public Car(int id, String manufacturer, String model, String license) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}

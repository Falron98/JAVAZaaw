package pl.pjatk.barkry;

import org.springframework.http.ResponseEntity;

public class Car {

    private String model;
    private int id;

    public Car (String model){
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
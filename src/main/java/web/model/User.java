package web.model;


import org.springframework.stereotype.Component;

@Component
public class User {

    private String model;
    private String color;
    private int series;


    public User() {
    }

    public User(String model, String color, int series) {
        this.color = color;
        this.series = series;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}

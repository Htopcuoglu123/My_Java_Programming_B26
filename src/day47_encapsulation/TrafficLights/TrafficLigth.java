package day47_encapsulation.TrafficLights;

public class TrafficLigth {
    private String color;

    public TrafficLigth(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch(color.toLowerCase()){
            case "red":
            case "yellow":
            case "green":
                this.color=color;
        }
    }
}

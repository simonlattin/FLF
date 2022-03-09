package Lights;

public class LED {
    private Color color;

    public LED(Color color){

    }

    private boolean isOn;

    public LED(){
        this.isOn = false;
    }

    public void On(){
        this.isOn = true;
    }

    public void Off(){
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void setColor(Color newColor){
        color = newColor;
    }

    public Color getColor(){
        return color;
    }

}

package Lights;

public class BlueLight {

    private LED led01;
    private LED led02;
    private LED led03;
    private LED led04;
    private final Position position;

    public BlueLight(Size size, Position position){

        this.position = position;

        switch (size) {
            case GROSS -> {
                this.led01 = new LED();
                this.led02 = new LED();
                this.led03 = new LED();
                this.led04 = new LED();
            }
            case MITTEL -> {
                this.led01 = new LED();
                this.led02 = new LED();
            }
            case KLEIN -> this.led01 = new LED();
        }
    }

    public void On(){
        led01.On();
        if(led02 != null) {
            led02.On();
        }
        if(led03 != null) {
            led03.On();
            led04.On();
        }
    }

    public void Off(){
        led01.Off();
        if(led02 != null) {
            led02.Off();
        }
        if(led03 != null) {
            led03.Off();
            led04.Off();
        }
    }
}

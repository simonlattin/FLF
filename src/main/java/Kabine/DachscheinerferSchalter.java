package Kabine;

import Lichter.Scheinwerfer;

public class DachscheinerferSchalter extends Schalter{
    private Scheinwerfer topLeft1;
    private Scheinwerfer topLeft2;
    private Scheinwerfer topRight1;
    private Scheinwerfer topRight2;

    public void flip() {
        if (state) {
            state = false;
            topLeft1.Off();
            topLeft2.Off();
            topRight1.Off();
            topRight2.Off();
        } else {
            state = true;
            topLeft1.On();
            topLeft2.On();
            topRight1.On();
            topRight2.On();
        }
    }
}

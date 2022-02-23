package Cabin;

import Lights.Spotlight;

public class RoofHeadlights extends Lever {
    private Spotlight topLeft1;
    private Spotlight topLeft2;
    private Spotlight topRight1;
    private Spotlight topRight2;

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

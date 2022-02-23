package Extinguisher;

public class Segment {

    private int length;
    private int angle;
    private boolean isExtended;
    private Segment partSegment1;
    private Segment partSegment2;
    private Segment partSegment3;

    public Segment(int length, boolean horizontallyAdjustable, boolean hasPartSegments){
        if (horizontallyAdjustable){
            this.angle = 0;
        } else if (hasPartSegments){
            this.partSegment1 = new Segment(6, false, false);
            this.partSegment2 = new Segment(6, false, false);
            this.partSegment3 = new Segment(5, false, false);
        } else {
            this.length = length;
        }
        this.isExtended = false;
    }

    public int getLength() {
        return length;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void extend() {
        isExtended = true;
    }

    public void retract() {
        isExtended = false;
    }

    public Segment getPartSegment1() {
        return partSegment1;
    }

    public Segment getPartSegment2() {
        return partSegment2;
    }

    public Segment getPartSegment3() {
        return partSegment3;
    }

    public boolean isExtended() {
        return isExtended;
    }
}

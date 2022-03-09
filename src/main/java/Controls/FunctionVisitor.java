package Controls;

import Extinguisher.FloorSprayNozzle;
import Extinguisher.FrontExtinguisher;
import Extinguisher.RoofExtinguisher;

public class FunctionVisitor implements IFunctionVisitor{

    public FunctionVisitor(){
    }

    public boolean visit(RoofExtinguisher roof) {
        return roof.acceptVisitor(this);
    }

    public boolean visit(FloorSprayNozzle nozzle1,FloorSprayNozzle nozzle2,FloorSprayNozzle nozzle3,FloorSprayNozzle nozzle4,FloorSprayNozzle nozzle5,FloorSprayNozzle nozzle6,FloorSprayNozzle nozzle7) {
        boolean isWorking = false;
        isWorking = nozzle1.acceptVisitor(this);
        isWorking = nozzle2.acceptVisitor(this);
        isWorking = nozzle3.acceptVisitor(this);
        isWorking = nozzle4.acceptVisitor(this);
        isWorking = nozzle5.acceptVisitor(this);
        isWorking = nozzle6.acceptVisitor(this);
        isWorking = nozzle7.acceptVisitor(this);
        return isWorking;
    }

    public boolean visit(FrontExtinguisher front) {
        return front.acceptVisitor(this);
    }
}

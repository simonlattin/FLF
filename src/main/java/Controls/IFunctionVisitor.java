package Controls;

import Extinguisher.FloorSprayNozzle;
import Extinguisher.FrontExtinguisher;
import Extinguisher.RoofExtinguisher;

public interface IFunctionVisitor {

    boolean visit(FloorSprayNozzle nozzle1,FloorSprayNozzle nozzle2,FloorSprayNozzle nozzle3,FloorSprayNozzle nozzle4,FloorSprayNozzle nozzle5,FloorSprayNozzle nozzle6,FloorSprayNozzle nozzle7);

    boolean visit(FrontExtinguisher front);

    boolean visit(RoofExtinguisher roof);
}

import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class buildComplete {

    private FLF flf = new FLF.Builder().build();

    @Test
    public void testBuilder(){
        Assertions.assertNotNull(flf.getSpotlight01());
        Assertions.assertNotNull(flf.getSpotlight02());
        Assertions.assertNotNull(flf.getSpotlight03());
        Assertions.assertNotNull(flf.getSpotlight04());
        Assertions.assertNotNull(flf.getSpotlight05());
        Assertions.assertNotNull(flf.getSpotlight06());
        Assertions.assertNotNull(flf.getSpotlight07());
        Assertions.assertNotNull(flf.getSpotlight08());
        Assertions.assertNotNull(flf.getSpotlight09());
        Assertions.assertNotNull(flf.getSpotlight10());
        Assertions.assertNotNull(flf.getIndicator01());
        Assertions.assertNotNull(flf.getIndicator02());
        Assertions.assertNotNull(flf.getIndicator03());
        Assertions.assertNotNull(flf.getIndicator04());
        Assertions.assertNotNull(flf.getBreakLight01());
        Assertions.assertNotNull(flf.getBreakLight02());
        Assertions.assertNotNull(flf.getBlueLight01());
        Assertions.assertNotNull(flf.getBlueLight02());
        Assertions.assertNotNull(flf.getBlueLight03());
        Assertions.assertNotNull(flf.getBlueLight04());
        Assertions.assertNotNull(flf.getBlueLight05());
        Assertions.assertNotNull(flf.getBlueLight06());
        Assertions.assertNotNull(flf.getBlueLight07());
        Assertions.assertNotNull(flf.getBlueLight08());
        Assertions.assertNotNull(flf.getBlueLight09());
        Assertions.assertNotNull(flf.getBlueLight10());
        Assertions.assertNotNull(flf.getWarningLight());
        Assertions.assertNotNull(flf.getCabin());
        Assertions.assertNotNull(flf.getAxis01());
        Assertions.assertNotNull(flf.getAxis02());
        Assertions.assertNotNull(flf.getAxis03());
        Assertions.assertNotNull(flf.getAxis04());
        Assertions.assertNotNull(flf.getRightSide1());
        Assertions.assertNotNull(flf.getRightSide2());
        Assertions.assertNotNull(flf.getRightSide3());
        Assertions.assertNotNull(flf.getRightSide4());
        Assertions.assertNotNull(flf.getRightSide5());
        Assertions.assertNotNull(flf.getLeftSide1());
        Assertions.assertNotNull(flf.getLeftSide2());
        Assertions.assertNotNull(flf.getLeftSide3());
        Assertions.assertNotNull(flf.getLeftSide4());
        Assertions.assertNotNull(flf.getLeftSide5());
        Assertions.assertNotNull(flf.getMotor01());
        Assertions.assertNotNull(flf.getMotor02());
        Assertions.assertNotNull(flf.getCentralUnit());
        Assertions.assertNotNull(flf.getWaterTank());
        Assertions.assertNotNull(flf.getFoamTank());
        Assertions.assertNotNull(flf.getMixingUnit());
        Assertions.assertNotNull(flf.getFrontExtinguisher());
        Assertions.assertNotNull(flf.getRoofExtinguisher());
        Assertions.assertNotNull(flf.getFloorSprayNozzle1());
        Assertions.assertNotNull(flf.getFloorSprayNozzle2());
        Assertions.assertNotNull(flf.getFloorSprayNozzle3());
        Assertions.assertNotNull(flf.getFloorSprayNozzle4());
        Assertions.assertNotNull(flf.getFloorSprayNozzle5());
        Assertions.assertNotNull(flf.getFloorSprayNozzle6());
        Assertions.assertNotNull(flf.getFloorSprayNozzle7());
        Assertions.assertNotNull(flf.getCabin().getDoorLeft());
        Assertions.assertNotNull(flf.getCabin().getDoorRight());
        Assertions.assertNotNull(flf.getCabin().getSeat01());
        Assertions.assertNotNull(flf.getCabin().getSeat02());
        Assertions.assertNotNull(flf.getCabin().getSeat03());
        Assertions.assertNotNull(flf.getCabin().getSeat04());
        Assertions.assertNotNull(flf.getCabin().getjoystickFront());
        Assertions.assertNotNull(flf.getCabin().getjoystickRoof());
        Assertions.assertNotNull(flf.getCabin().getControlPanel());
        Assertions.assertNotNull(flf.getCabin().getSteeringWheel());
        Assertions.assertNotNull(flf.getCabin().getEnergyDisplay());
        Assertions.assertNotNull(flf.getCabin().getSpeedDisplay());
        Assertions.assertNotNull(flf.getCabin().getBreakPedal());
        Assertions.assertNotNull(flf.getCabin().getGaspedal());
        Assertions.assertNotNull(flf.getCabin().getInnerLeft());
        Assertions.assertNotNull(flf.getCabin().getInnerRight());
        Assertions.assertNotNull(flf.getCabin().getOuterLeft());
        Assertions.assertNotNull(flf.getCabin().getOuterRight());
    }
}

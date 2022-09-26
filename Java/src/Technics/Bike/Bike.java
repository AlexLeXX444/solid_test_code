package Technics.Bike;

import Interfaces.TechnicsString;
import Technics.Technics;

public class Bike extends Technics implements TechnicsString {
    /**
     * rearWheelDriveType - Тип привеода заднего колеса.
     * luggageCompartment - Наличие багажного отсека.
     * attachmentSidecar - Наличие крепления для коляски.
     */
    private final String rearWheelDriveType;
    private final boolean luggageCompartment;
    private final boolean attachmentSidecar;

    public Bike(String technicMark, String technicModel, int technicSerialNumber,
                int passengersNum,
                String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
                double massMinimum, double massMaximum, double massLoadCapacity,
                String rearWheelDriveType, boolean luggageCompartment, boolean attachmentSidecar
    ) {
        super("Bike",
                technicMark, technicModel, technicSerialNumber,
                passengersNum,
                powerPlant, powerPlantSerialNumber, powerPlantRangeReserve,
                massMinimum, massMaximum, massLoadCapacity);
        this.rearWheelDriveType = rearWheelDriveType;
        this.luggageCompartment = luggageCompartment;
        this.attachmentSidecar = attachmentSidecar;
    }

    @Override
    public String toString() {
        String strOut = String.format("Мотоцикл марки %s модель %s", super.technicMark, super.technicModel);
        strOut += String.format("имеющий %s привод", rearWheelDriveType);
        if (this.luggageCompartment && this.attachmentSidecar) {
            return strOut + String.format(" с багажником и креплением для коляски.");
        }
        else if (this.luggageCompartment) {
            return strOut + String.format(" с багажником.");
        }
        else if (this.attachmentSidecar) {
            return strOut + String.format(" с креплением для коляски.");
        }
        return strOut + ".";
    }
}

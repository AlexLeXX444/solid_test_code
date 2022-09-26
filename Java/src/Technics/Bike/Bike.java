package Technics.Bike;

import Technics.Technics;

public class Bike extends Technics {
    /**
     * rearWheelDriveType - Тип привеода заднего колеса.
     * luggageCompartment - Наличие багажного отсека.
     * attachmentSidecar - Наличие крепления для коляски.
     */
    protected String rearWheelDriveType;
    protected boolean luggageCompartment;
    protected boolean attachmentSidecar;

    public Bike(String kindOfTechnic, String technicMark, String technicModel, int technicSerialNumber, int passengersNum, String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve, double massMinimum, double massMaximum, double massLoadCapacity) {
        super(kindOfTechnic, technicMark, technicModel, technicSerialNumber, passengersNum, powerPlant, powerPlantSerialNumber, powerPlantRangeReserve, massMinimum, massMaximum, massLoadCapacity);
    }
}

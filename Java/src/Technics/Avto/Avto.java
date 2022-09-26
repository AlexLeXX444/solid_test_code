package Technics.Avto;

import Technics.Technics;

public class Avto extends Technics implements Interfaces.TechnicsString{
    /**
     * chassisType - тип шасси.
     * bodyType - тип кузова.
     */
    protected String chassisType;
    protected String bodyType;

    public Avto(String technicMark, String technicModel, int technicSerialNumber,
                int passengersNum,
                String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
                double massMinimum, double massMaximum, double massLoadCapacity,
                String chassisType, String bodyType
    ) {
        super("Automobile",
                technicMark, technicModel, technicSerialNumber,
                passengersNum,
                powerPlant, powerPlantSerialNumber, powerPlantRangeReserve,
                massMinimum, massMaximum, massLoadCapacity);
        this.chassisType = chassisType;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        String strOut = String.format("Автомобиль марки %s модель %s ", super.technicMark, super.technicModel);
        return strOut + String.format("%s %s.", chassisType, bodyType);
    }
}

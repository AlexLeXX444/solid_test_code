package Technics.Helicopter;

import Interfaces.TechnicsString;
import Technics.Technics;

public class Helicopter extends Technics implements TechnicsString {
    /**
     * chassisMaterial - Материал шасси.
     * housingMaterial - Материал корпуса.
     * maxFlightAltitude - Максимальная высота полета.
     */
    protected String chassisMaterial; // Материал шасси
    protected String housingMaterial; // Материал корпуса
    protected double maxFlightAltitude; // Максимальная высота полета

    public Helicopter(String technicMark, String technicModel, int technicSerialNumber,
                      int passengersNum,
                      String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
                      double massMinimum, double massMaximum, double massLoadCapacity,
                      String chassisMaterial, String housingMaterial, double maxFlightAltitude
    ) {
        super("Helicopter",
                technicMark, technicModel, technicSerialNumber,
                passengersNum,
                powerPlant, powerPlantSerialNumber, powerPlantRangeReserve,
                massMinimum, massMaximum, massLoadCapacity);
        this.chassisMaterial = chassisMaterial;
        this.housingMaterial = housingMaterial;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public String toString() {
        String strOut = String.format("Ветролет марки %s модель %s", super.technicMark, super.technicModel);
        return strOut + String.format(", материал шасси %s, материал корпуса %s, максимальная высота полета %s", chassisMaterial, housingMaterial, maxFlightAltitude);
    }
}

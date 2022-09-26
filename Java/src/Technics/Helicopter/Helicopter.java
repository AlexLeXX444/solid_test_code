package Technics.Helicopter;

import Technics.Technics;

public class Helicopter extends Technics {
    /**
     * chassisMaterial - Материал шасси.
     * housingMaterial - Материал корпуса.
     * maxFlightAltitude - Максимальная высота полета.
     */
    protected String chassisMaterial; // Материал шасси
    protected String housingMaterial; // Материал корпуса
    protected boolean maxFlightAltitude; // Максимальная высота полета

    public Helicopter(String kindOfTechnic, String technicMark, String technicModel, int technicSerialNumber, int passengersNum, String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve, double massMinimum, double massMaximum, double massLoadCapacity) {
        super(kindOfTechnic, technicMark, technicModel, technicSerialNumber, passengersNum, powerPlant, powerPlantSerialNumber, powerPlantRangeReserve, massMinimum, massMaximum, massLoadCapacity);
    }
}

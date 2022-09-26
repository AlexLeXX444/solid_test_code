package Technics.Jetski;

import Technics.Technics;

public class Jetski extends Technics {
    /**
     * housingMaterial - Материал корпуса.
     * displacement - Водоизмещение.
     * seatAvailability - Наличие сиденья.
     */
    protected String housingMaterial;
    protected int displacement;
    protected boolean seatAvailability;

    public Jetski(String kindOfTechnic, String technicMark, String technicModel, int technicSerialNumber, int passengersNum, String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve, double massMinimum, double massMaximum, double massLoadCapacity) {
        super(kindOfTechnic, technicMark, technicModel, technicSerialNumber, passengersNum, powerPlant, powerPlantSerialNumber, powerPlantRangeReserve, massMinimum, massMaximum, massLoadCapacity);
    }
}

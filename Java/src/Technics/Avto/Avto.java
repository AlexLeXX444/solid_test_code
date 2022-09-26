package Technics.Avto;

import Technics.Technics;

public class Avto extends Technics {
    /**
     * chassisType - тип шасси.
     * bodyType - тип кузова.
     */
    protected String chassisType;
    protected String bodyType;

    public Avto(String kindOfTechnic, String technicMark, String technicModel, int technicSerialNumber, int passengersNum, String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve, double massMinimum, double massMaximum, double massLoadCapacity) {
        super(kindOfTechnic, technicMark, technicModel, technicSerialNumber, passengersNum, powerPlant, powerPlantSerialNumber, powerPlantRangeReserve, massMinimum, massMaximum, massLoadCapacity);
    }
}

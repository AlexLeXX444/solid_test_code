package Technics.Jetski;

import Interfaces.TechnicsString;
import Technics.Technics;

public class Jetski extends Technics implements TechnicsString {
    /**
     * housingMaterial - Материал корпуса.
     * displacement - Водоизмещение.
     * seatAvailability - Наличие сиденья.
     */
    private final String housingMaterial;
    private final int displacement;
    private final boolean seatAvailability;

    public Jetski(String technicMark, String technicModel, int technicSerialNumber,
                  int passengersNum,
                  String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
                  double massMinimum, double massMaximum, double massLoadCapacity,
                  String housingMaterial, int displacement, boolean seatAvailability
    ) {
        super("Jet-ski",
                technicMark, technicModel, technicSerialNumber,
                passengersNum,
                powerPlant, powerPlantSerialNumber, powerPlantRangeReserve,
                massMinimum, massMaximum, massLoadCapacity);
        this.housingMaterial = housingMaterial;
        this.displacement = displacement;
        this.seatAvailability = seatAvailability;
    }

    @Override
    public String toString() {
        String strOut = String.format("Гидроцикл марки %s модель %s", super.technicMark, super.technicModel);
        strOut += String.format(", материал корпуса %s, водоизмещение %s", this.housingMaterial, this.displacement);
        if (seatAvailability) {
            return strOut + ", имеет сиденье.";
        }
        return strOut + ".";
    }
}

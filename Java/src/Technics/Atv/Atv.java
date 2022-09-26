package Technics.Atv;

import Technics.Technics;

public class Atv extends Technics implements Interfaces.TechnicsOut {
    /**
     * driveType - Тип привода.
     * rearTrunk - Наличие переднего багажника.
     * frontTrunk - Наличие заднего багажника.
     */
    protected String driveType;
    protected boolean rearTrunk;
    protected boolean frontTrunk;

    public Atv(
            String technicMark, String technicModel, int technicSerialNumber,
            int passengersNum,
            String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
            double massMinimum, double massMaximum, double massLoadCapacity,
            String driveType, boolean rearTrunk, boolean frontTrunk
    ) {
        super("ATV",
                technicMark, technicModel, technicSerialNumber,
                passengersNum,
                powerPlant, powerPlantSerialNumber, powerPlantRangeReserve,
                massMinimum, massMaximum, massLoadCapacity);
        this.driveType = driveType;
        this.rearTrunk = rearTrunk;
        this.frontTrunk = frontTrunk;
    }

    @Override
    public String getInfoTechnics() {
        return String.format("Основная информация : %s ::: %s ::: %d", super.technicMark, super.technicModel, super.technicSerialNumber);
    }

    @Override
    public String getInfoPowerPlant() {
        return String.format("Силовая установка : %s ::: %s ::: %d", super.powerPlant, super.powerPlantSerialNumber, super.powerPlantRangeReserve);
    }

    @Override
    public String getInfoMass() {
        return String.format("Масса и нагрузка : %s ::: %s ::: %s", super.massMinimum, super.massMaximum, super.massLoadCapacity);
    }

    @Override
    public String toString() {
        String strOut = String.format("Квадроцикл марки %s модель %s ", super.technicMark, super.technicModel);
        if (rearTrunk && frontTrunk) {
            return strOut + "имеющий заднее и переднее багажные отделения.";
        }
        if (rearTrunk) {
            return strOut + "имеющий заднее багажное отделения.";
        }
        if (frontTrunk) {
            return strOut + "имеющий переднее багажное отделения.";
        }
        return strOut;
    }
}

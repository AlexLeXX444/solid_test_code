package Technics;

public abstract class Technics {
    /**+
     * kindOfTechnic - разновидность техники.
     * technicMark - Марка агрегата.
     * technicModel - модель агрегата.
     * technicSerialNumber - серийный номер шасси или кузова агрегата.
     * passengersNum - максимальное кол-во пассажиров.
     * powerPlant - тип силовой установки.
     * powerPlantSerialNumber - серийный номер силовой .
     * powerPlantRangeReserve - дальность хода на одной заправке/заряде.
     * massMinimum - минимальная масса без снарядения и груза.
     * massMaximum - максимальная масса со всеми пассажирами и грузом.
     * massLoadCapacity - максимальная грузоподъемность помимо пассажиров.
     */
    protected String kindOfTechnic;
    protected String technicMark;
    protected String technicModel;
    protected int technicSerialNumber;

    protected int passengersNum;

    protected String powerPlant;
    protected int powerPlantSerialNumber;
    protected int powerPlantRangeReserve;

    protected double massMinimum;
    protected double massMaximum;
    protected double massLoadCapacity;

    public Technics(String kindOfTechnic, String technicMark, String technicModel, int technicSerialNumber,
                    int passengersNum,
                    String powerPlant, int powerPlantSerialNumber, int powerPlantRangeReserve,
                    double massMinimum, double massMaximum, double massLoadCapacity) {
        this.kindOfTechnic = kindOfTechnic;
        this.technicMark = technicMark;
        this.technicModel = technicModel;
        this.technicSerialNumber = technicSerialNumber;
        this.passengersNum = passengersNum;
        this.powerPlant = powerPlant;
        this.powerPlantSerialNumber = powerPlantSerialNumber;
        this.powerPlantRangeReserve = powerPlantRangeReserve;
        this.massMinimum = massMinimum;
        this.massMaximum = massMaximum;
        this.massLoadCapacity = massLoadCapacity;
    }
}

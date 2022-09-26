package Interfaces;

public interface TechnicsOut {
    /**
     * getInfoTechnics - возвращает марку, модели и серийный номер одной строкой.
     * getInfoPowerPlant - наименование, серийный номер и запас хода силовой установки одной строкой.
     * getInfoMass - возвращает массу техники, максимально сняряженную массу и грузоподъемность одной строкой.
     * toString - переопределяем метод и выводит "красивую" строку с описанием техники.
     */
    String getInfoTechnics();
    String getInfoPowerPlant();
    String getInfoMass();
    String toString();
}

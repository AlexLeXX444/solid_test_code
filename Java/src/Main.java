import Technics.Technics;
import Technics.Atv.*;
import Technics.Avto.*;
import Technics.Bike.*;
import Technics.Helicopter.*;
import Technics.Jetski.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Technics> technics = new ArrayList<>();

        technics.add(new Atv(
                "Honda",
                "Honda Talon 1000X",
                123456789,
                0,
                "атмосферный двигатель",
                1234566789,
                80,
                240,
                350,
                0,
                "цепной",
                false,
                false
        ));

        technics.add(new Avto(
                "Ford",
                "Ford Fiesta",
                1234567891,
                3,
                "атмосферный двигатель",
                123456-456789,
                1600,
                940,
                1550,
                75,
                "переднеприводный",
                "универсал"
        ));

        technics.add(new Bike(
                "KAWASAKI",
                "KAWASAKI NINJA 400",
                1234567891,
                1,
                "атмосферный двигатель",
                1234456789,
                750,
                160,
                240,
                0,
                "цепной",
                false,
                false
        ));

        technics.add(new Helicopter(
                "AirScooter Corporation",
                "Air Scooter 2",
                1234567891,
                0,
                "атмосферный двигатель",
                1234456789,
                500,
                140,
                290,
                0,
                "сталь",
                "углепластик",
                3000
        ));

        technics.add(new Jetski(
                "YAMAHA",
                "YAMAHA FX CRUISER SVHO",
                1234567891,
                2,
                "атмосферный двигатель",
                1234456789,
                300,
                397,
                550,
                0,
                "углепластик",
                2,
                true
        ));

        for (int i = 0; i < technics.size(); i++) {
            System.out.println(technics.get(i));
            System.out.println("\t\t" + technics.get(i).getInfoTechnics());
            System.out.println("\t\t" + technics.get(i).getInfoMass());
            System.out.println("\t\t" + technics.get(i).getInfoPowerPlant());
            System.out.println();
        }
    }
}
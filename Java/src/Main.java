import Technics.Technics;
import Technics.Atv.*;
import Technics.Avto.*;
import Technics.Bike.*;
import Technics.Helicopter.*;

public class Main {
    public static void main(String[] args) {
        Technics n1;
        n1 = new Helicopter(
                "BMV",
                "n1",
                123,
                0,
                "atm",
                123,
                321,
                100,
                156,
                26,
                "123",
                "124",
                18.5
        );
        System.out.println(n1);
    }
}
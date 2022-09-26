import Technics.Technics;
import Technics.Atv.*;
import Technics.Avto.*;
import Technics.Bike.*;

public class Main {
    public static void main(String[] args) {
        Technics n1;
        n1 = new Bike(
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
                "цепной",
                false,
                true
        );
        System.out.println(n1);
    }
}
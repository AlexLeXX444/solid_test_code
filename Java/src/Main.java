import Technics.Technics;
import Technics.Atv.*;
import Technics.Avto.*;

public class Main {
    public static void main(String[] args) {
        Technics n1;
        n1 = new Avto(
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
                "переднеприводный",
                "седан"
        );
        System.out.println(n1);
    }
}
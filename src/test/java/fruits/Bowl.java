package fruits;

import java.util.ArrayList;
import java.util.List;

public class Bowl {
    List<Fruit> fruits;

    public Bowl()
    {
        fruits = new ArrayList<>();
    }

    public void addFruits(Fruit... addfruit) {
        for (Fruit f : addfruit) {
            this.fruits.add(f);
        }
    }

    public Bowl getAllApples() {
        Bowl appleBowl = new Bowl();
        for (Fruit f : fruits) {
            if (f instanceof Apple) {
                appleBowl.addFruits(f);
            }
        }
        return appleBowl;
    }

    public Bowl getAllOranges() {
        Bowl orangeBowl = new Bowl();
        for (Fruit f : fruits) {
            if (f instanceof Orange) {
                orangeBowl.addFruits(f);
            }
        }
        return orangeBowl;
    }

    public Bowl getAllBanana() {
        Bowl bananaBowl = new Bowl();
        for (Fruit f : fruits) {
            if (f instanceof Banana) {
                bananaBowl.addFruits(f);
            }
        }
        return bananaBowl;
    }
}

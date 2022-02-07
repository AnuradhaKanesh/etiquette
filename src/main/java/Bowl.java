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

    public int getFruitCount()
    {
        return fruits.size();
    }
}

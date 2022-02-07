import java.util.List;

public interface FruitExtractor {

    List<? extends Fruit> extractFruit(List<Fruit> fruitList);

}

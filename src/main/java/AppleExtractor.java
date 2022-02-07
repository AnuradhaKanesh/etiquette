import java.util.List;
import java.util.stream.Collectors;

public class AppleExtractor implements FruitExtractor{

    @Override
    public List<? extends Fruit> extractFruit(List<Fruit> fruitList)
    {
       return fruitList.stream().parallel().filter(fruit -> fruit instanceof Apple).collect(Collectors.toList());
    }
}

package fruits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FriutBowlTests {

    @Test
    public void segregateFruit()
    {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Orange orange1 = new Orange();
        Orange oragne2 = new Orange();
        Orange oragne3 = new Orange();

        Bowl bowl = new Bowl();
        bowl.addFruits(apple1,apple2,banana1,banana2,orange1,oragne2,oragne3);

        Assert.assertEquals(bowl.getAllApples().fruits.size(), 2);
        Assert.assertEquals(bowl.getAllBanana().fruits.size(),2);
        Assert.assertEquals(bowl.getAllOranges().fruits.size(),3);


    }
}

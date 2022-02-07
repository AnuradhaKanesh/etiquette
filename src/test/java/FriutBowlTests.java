import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;
import java.util.List;

public class FriutBowlTests {

    FruitExtractor appleExtractor = new AppleExtractor();
    FruitExtractor bananaExtractor = new BananaExtractor();
    FruitExtractor orangeExtractor = new OrangeExtractor();
    Bowl bowl = new Bowl();
    Apple apple = new Apple();
    Banana banana = new Banana();
    Orange orange = new Orange();

    @BeforeTest
    public void addFruits()
    {
        bowl.addFruits(new Apple(), new Apple(), new Apple(), new Banana(), new Banana(), new Orange(), new Orange(), new Orange());
    }

    @Test
    public void Test001_Verify_Fruits_Count() {
        Assert.assertEquals(bowl.getFruitCount(), 8);
        Reporter.log("Count of fruits in Fruit bowl is 8",true);
    }
    @Test
    public void Test002_Verify_Apples_In_AppleBowl() {
        Assert.assertTrue(appleExtractor.extractFruit(bowl.fruits).toString().contains("Apple")
        && !appleExtractor.extractFruit(bowl.fruits).toString().contains("Banana")
        && !appleExtractor.extractFruit(bowl.fruits).toString().contains("Orange"));

        Reporter.log("Apple Bowl contains only Apple",true);
    }
    @Test
    public void Test001_Verify_Banana_In_BananaBowl() {
        Assert.assertTrue(bananaExtractor.extractFruit(bowl.fruits).toString().contains("Banana")
                && !bananaExtractor.extractFruit(bowl.fruits).toString().contains("Apple")
                && !bananaExtractor.extractFruit(bowl.fruits).toString().contains("Orange"));

        Reporter.log("Banana Bowl contains only Banana",true);
    }
    @Test
    public void Test001_Verify_Orange_In_OrangeBowl() {
        Assert.assertTrue(orangeExtractor.extractFruit(bowl.fruits).toString().contains("Orange")
                && !orangeExtractor.extractFruit(bowl.fruits).toString().contains("Apple")
                && !orangeExtractor.extractFruit(bowl.fruits).toString().contains("Banana"));

        Reporter.log("Orange Bowl contains only Banana",true);
    }

    @Test
    public void Test005_Verify_Apple_Count_In_AppleBowl()
    {
        Assert.assertEquals(appleExtractor.extractFruit(bowl.fruits).size(),4);
        Reporter.log("Count of Apples in apple bowl are 4",true);
    }

    @Test
    public void Test006_Verify_Banana_Count_In_BananaBowl()
    {
        Assert.assertEquals(bananaExtractor.extractFruit(bowl.fruits).size(),2);
        Reporter.log("Count of Bananas in banana bowl are 2",true);
    }

    @Test
    public void Test007_Verify_Orange_Count_In_OrangeBowl()
    {
        Assert.assertEquals(orangeExtractor.extractFruit(bowl.fruits).size(),3);
        Reporter.log("Count of Oranges in orange bowl are 3",true);
    }

    @Test
    public void Test008_Verify_Apple_Colour()
    {
        Assert.assertEquals(apple.getColor(),"red");
        Reporter.log("Colour of Apple is red",true);
    }

    @Test
    public void Test009_Verify_Banana_Colour()
    {
        Assert.assertEquals(banana.getColor(),"yellow");
        Reporter.log("Colour of Banana is yellow",true);
    }

    @Test
    public void Test010_Verify_Orange_Colour()
    {
        Assert.assertEquals(orange.getColor(),"orange");
        Reporter.log("Colour of Orange is orange",true);
    }



}

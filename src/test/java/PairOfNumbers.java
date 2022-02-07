
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PairOfNumbers {
    @Test
    public void pairOfNumber() {

        Integer[] intArr = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};
        int key = 4;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(intArr));
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {

                if(arr.get(i)+arr.get(j) == key)
                    result.add(arr.get(i).toString() +" , "+arr.get(j).toString());
                else if(arr.get(i)-arr.get(j) == key || arr.get(j)-arr.get(i) == key)
                    result.add(arr.get(i).toString() +" , "+arr.get(j).toString());
                else if(arr.get(i)*arr.get(j) == key)
                    result.add(arr.get(i).toString() +" , "+arr.get(j).toString());
                else if((arr.get(i)>arr.get(j) && !(arr.get(j)==0))) {
                    if (arr.get(i) / arr.get(j) == key)
                        result.add(arr.get(i).toString() +" , "+arr.get(j).toString());
                }
                else if((arr.get(j)>arr.get(i) && !(arr.get(i)==0))) {
                    if (arr.get(j) / arr.get(i) == key)
                        result.add(arr.get(i).toString() +" , "+arr.get(j).toString());
                }
            }
        }
        for(String str :result)
        {
            System.out.println(str);
        }

        String[] requiredResult ={"1 , 4","1 , 5","2 , -2","-1 , 5","4 , 0","10 , 40"};

        ArrayList<Integer> requiredResultArr = new ArrayList(Arrays.asList(requiredResult));


        Assert.assertEquals(result,requiredResultArr);


    }


}

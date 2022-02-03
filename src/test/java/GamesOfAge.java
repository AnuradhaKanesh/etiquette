import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GamesOfAge {

    @Test
    public void gamesOfAge() {

        Integer[] intArr = {18, 20, 21, 21, 23};


        String[] requiredResult ={" 18 20"," 21 21 23"};
        ArrayList<String> result = new ArrayList(Arrays.asList(requiredResult));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(intArr));
        Collections.sort(arr);
        int next = 0;
        String grp;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) continue;
            grp = new String();

            grp +=" "+arr.get(i).toString();

            for (int j = i + 1; j < arr.size(); j++) {

                if ((arr.get(j) - arr.get(i)) <= 2) {
                    grp+=" "+arr.get(j).toString();
                    arr.set(j,0);
                }
            }

            Assert.assertEquals(grp,result.get(next));

            next++;

        }
    }
}

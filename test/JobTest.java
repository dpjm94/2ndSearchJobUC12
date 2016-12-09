import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.omg.CORBA.Object;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by donalmaher on 09/12/2016.
 */
public class JobTest {
    @Test
    public void getCategoryNo() throws Exception {

        Inventory inventory = new Inventory();
        Map properties = new HashMap();
        JobSpec jobSpec;
        jobSpec = new JobSpec(properties);
        List matchingJobs = inventory.search(jobSpec);


        int[] numbers = {12,4,3,1};
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout=100)
    public void testSort_Performance(){
        int array[] = {12,23,4};
        for(int i=1;i<1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }

    @Parameterized.Parameters
    public static Collection testConditions(){
        String expectedOutputs[][] = {{"Accounting","Architecture"},
        {"Accounting","Architecture"}};
        return Arrays.asList(expectedOutputs);
    }


}
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

        inventory.addJob("01",34-50,jobSpec);
        inventory.addJob("02",20-30,jobSpec);
        Job result = inventory.getJob("01");
        Job expResult = inventory.getJob("01");
        assertEquals(expResult,result);

        //jobs is not empty
        boolean re = matchingJobs.isEmpty();
        boolean expRes = false;

        matchingJobs.clear();

        re = matchingJobs.isEmpty();
        expRes = true;


        inventory.addJob("01",34-50,jobSpec);
        inventory.addJob("02",20-30,jobSpec);
        inventory.addJob("03",20-30,jobSpec);

        re = matchingJobs.contains("01");
        expRes = true;

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
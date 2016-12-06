import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindCategoryTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);


        Map properties = new HashMap();

        properties.put("location",Location.KERRY);
        JobSpec jobSpec;
        jobSpec = new JobSpec(properties);

        List matchingJobs = inventory.search(jobSpec);

        if (matchingJobs != null) {
            System.out.println("User, you might be interested these ");

            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                JobSpec spec = job.getSpec();
                System.out.println("\n We have a " + spec.getProperty("employType") +
                        "with the following jobs: ");
                for(Iterator p = spec.getProperties().keySet().iterator();
                        p.hasNext();){
                    String propertyName = (String) p.next();
                    if(propertyName.equals("employType"))
                        continue;
                    System.out.println("  " + propertyName + ": " +
                    spec.getProperty(propertyName));
                }
                //+ " \n Available Status Job: " + spec.isJobStatus());
            }
        } else {
            System.out.println("Sorry User, we have nothing for you!!!");
        }

    }
    private static void dataInventory(Inventory inventory){

        Map properties = new HashMap();
        properties.put("category", Category.ACCOUNTING);
        properties.put("location", Location.KERRY);
        properties.put("employType", EmployType.PERMANENT);
        inventory.addJob("01",23-40, new JobSpec(properties));


        properties.put("location",Location.KERRY);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("02",20-40, new JobSpec(properties));

        properties.put("location",Location.DUBLIN);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("03",30-35,new JobSpec(properties));
    }

}


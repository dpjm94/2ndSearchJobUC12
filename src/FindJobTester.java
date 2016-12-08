import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindJobTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);


        Map properties = new HashMap();

        //User is looking for Permanent Accounting job in Kerry.

        JOptionPane.showMessageDialog(null,"Welcome");

        properties.put("category",Category.ACCOUNTING);

        JobSpec jobSpec;
        jobSpec = new JobSpec(properties);

        List matchingJobs = inventory.search(jobSpec);

        if (matchingJobs != null) {
            System.out.println("User, you might be interested these ");

            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                JobSpec spec = job.getSpec();
                System.out.println("\n"+spec.getProperty("employType") + " Job" +
                        " with the following properties: ");
                for(Iterator p = spec.getProperties().keySet().iterator();
                        p.hasNext();){
                    String propertyName = (String) p.next();
                    if(propertyName.equals("employType"))
                        continue;
                    System.out.println("  " + propertyName + ": " +
                    spec.getProperty(propertyName));
                }
                System.out.println(" \nIf you are interest taking this "
                                + spec.getProperty("category") + " Job\n" +
                 " Apply to " + spec.getProperty("contact") + " at " + spec.getProperty("email") + " ASAP " +
                                "but before on " + spec.getProperty("Expire Date"));

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
        properties.put("ageType",AgeType.ADULT);
        properties.put("Expire Date","16th of December 2016");
        properties.put("email","johnP@hotmail.com");
        properties.put("company","Fexco");
        properties.put("contact","John Cronin");
        inventory.addJob("01",30-40, new JobSpec(properties));


        properties.put("category", Category.ARCHITECTURE);
        properties.put("location",Location.KERRY);
        properties.put("employType",EmployType.PARTTIME);
        properties.put("ageType",AgeType.ADULT);
        properties.put("email","maryMp@hotmail.com");
        properties.put("Expire Date","10th of December 2016");
        properties.put("company","Cpl Finance");
        properties.put("contact","Mary Murphy");
        inventory.addJob("02",30-40, new JobSpec(properties));

        properties.put("category", Category.ACCOUNTING);
        properties.put("location",Location.DUBLIN);
        properties.put("employType",EmployType.PARTTIME);
        properties.put("ageType",AgeType.STUDENT);
        properties.put("Expire Date","12th of December 2016");
        properties.put("email","JohnD@hotmail.com");
        properties.put("company","O'Donoghue");
        properties.put("contact","John O'Donoghue");
        inventory.addJob("03",20-25,new JobSpec(properties));
    }

}


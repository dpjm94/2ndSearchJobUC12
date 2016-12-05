import java.util.Iterator;
import java.util.List;

public class FindCategoryTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);

        CategorySpec whatUserWants = new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true);


        List matchingJobs = inventory.search(whatUserWants);

        if (matchingJobs != null) {
            System.out.println("User, you might be interested these ");

            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Category category = (Category)i.next();
                JobSpec spec = category.getSpec();
                System.out.println("\n We have a " + spec.getJobType() + " in " +
                        spec.getLocation() + " and \n Employee Type of the job is : " + spec.getEmployType() + "\n Age type they are looking for: "
                        + spec.getAgeType());

                //+ " \n Available Status Job: " + spec.isJobStatus());
            }
        } else {
            System.out.println("Sorry User, we have nothing for you!!!");
        }

    }
    private static void dataInventory(Inventory inventory){

        inventory.addJob("001",32-35,
                new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true));
        inventory.addJob("002",30-40,
                new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.DUBLIN, true));
        inventory.addJob("003",22-26,
                new CategorySpec(AgeType.STUDENT, EmployType.PERMANENT, JobType.ARCHITECTURE,Location.DUBLIN, true));
    }

}


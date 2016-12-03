import java.util.Iterator;
import java.util.List;

public class FindCategoryTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);

        CategorySpec whatUserWants = new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true);

        List matchingCategorys = inventory.search(whatUserWants);


        if (matchingCategorys != null) {
            System.out.println("User, you might be interested these ");

            for(Iterator i = matchingCategorys.iterator(); i.hasNext();){
                Category category = (Category)i.next();
                CategorySpec spec = category.getSpec();
                System.out.println("\n We have a " + spec.getJobType() + " in " +
                        spec.getLocation() + " and \n Employee Type of the job is : " + spec.getEmployType() + "\n Age type looking for: "
                        + spec.getAgeType() + " \n Available Status Job: " + spec.isJobStatus());
            }
        } else {
            System.out.println("Sorry User, we have nothing for you!!!");
        }

    }
    private static void dataInventory(Inventory inventory){

        inventory.addCategory("001",32-35,
                new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true));
        inventory.addCategory("002",30-40,
                new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.DUBLIN, true));
        inventory.addCategory("003",22-26,
                new CategorySpec(AgeType.STUDENT, EmployType.PERMANENT, JobType.ARCHITECTURE,Location.DUBLIN, true));
    }

}


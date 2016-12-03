import java.util.Iterator;
import java.util.List;

public class FindCategoryTester {

    public static void main(String[]args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);

        CategorySpec whatUserWants = new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true);

        List matchingCategorys = inventory.search(whatUserWants);


        if (matchingCategorys != null) {
            System.out.println("User, you might be interested these ");

            for(Iterator i = matchingCategorys.iterator(); i.hasNext();){
                Category category = (Category)i.next();
                CategorySpec spec = category.getSpec();
                System.out.println(" We have a " + spec.getJobType() + " in " +
                        spec.getLocation() + " You must:\n " + spec.getEmployType() + " "
                        + spec.getAgeType() + " Status Job: " + spec.isJobStatus());
            }
        } else {
            System.out.println("Sorry User, we have nothing for you!!!");
        }

    }
    private static void dataInventory(Inventory inventory){

        inventory.addCategory("001",32,
                new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true));
    }

}



public class FindCategoryTester {

    public static void main(String[]args) {


        Inventory inventory = new Inventory();
        dataInventory(inventory);

        CategorySpec whatUserWants = new CategorySpec(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true);

        Category category = inventory.search(whatUserWants);

        if (category != null) {
            System.out.println("User, you might interested these " +
                    category.getAge() + " " + category.getAgeType() + " " +
                    category.getEmployType() + " " + category.getJobType() + " "
                    + category.getLocation() + " " + category.isJobStatus());
        } else {
            System.out.println("Sorry User, we have nothing!!!");
        }

    }
    private static void dataInventory(Inventory inventory){

        inventory.addCategory(AgeType.ADULT, EmployType.PARTTIME, JobType.ACCOUNTING,Location.ANTRIM, true);
    }

}


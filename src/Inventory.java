import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 03/12/2016.
 */
public class Inventory {

    private List categorys;

    public Inventory(){
        categorys = new LinkedList();
    }

    public void addCategory(String categoryNo, double age, AgeType ageType, EmployType employType, JobType jobType, Location location, boolean jobStatus){
        Category category = new Category(categoryNo, age, ageType, employType,jobType,location,jobStatus);
        categorys.add(category);
    }

    public Category getCategory(String categoryNo){
        for(Iterator i = categorys.iterator(); i.hasNext();){
            Category category = (Category)i.next();
            if(category.getCategoryNo().equals(categoryNo)){
               return category;
            }
        }
        return null;
    }

    public Category search(Category searchCategory){
        for(Iterator i = categorys.iterator(); i.hasNext();){
            Category category = (Category)i.next();

            AgeType ageType = searchCategory.getAgeType();
            if((ageType != null) &&
                    (!ageType.equals(category.getAgeType())))
                continue;

            EmployType employType = searchCategory.getEmployType();
            if((employType != null) &&
                    (!employType.equals(category.getEmployType())))
                continue;

            JobType jobType = searchCategory.getJobType();
            if((jobType != null) &&
                    (!jobType.equals(category.getJobType())))
                continue;

            Location location = searchCategory.getLocation();
            if((location != null) &&
                    (!location.equals(category.getLocation())))
                continue;

            Boolean jobStatus = searchCategory.isJobStatus();
            if((jobStatus != null) &&
                    (!jobStatus.equals(category.isJobStatus())))
                continue;
        }

        return null;

    }
}

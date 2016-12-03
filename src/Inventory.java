import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 03/12/2016.
 */
public class Inventory {

    private final List categorys;

    public Inventory(List<Category>categorys){
        this.categorys = categorys;

        //category = new LinkedList();
    }

    public void addCategory(String categoryNo, double age, CategorySpec spec){
        Category category = new Category(categoryNo, age, spec);
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

    public Category search(CategorySpec searchCategory){
        for(Iterator i = categorys.iterator(); i.hasNext();){
            Category category = (Category)i.next();
            CategorySpec categorySpec = category.getSpec();

            if(searchCategory.getAgeType() != categorySpec.getAgeType())
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

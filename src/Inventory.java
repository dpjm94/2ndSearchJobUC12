import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 03/12/2016.
 */
public class Inventory {

    private final List categorys;

    public Inventory(){

        categorys = new LinkedList();
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

    public List search(CategorySpec searchSpec){
        List matchingCategorys = new LinkedList();
        for(Iterator i = categorys.iterator(); i.hasNext();){
            Category category = (Category)i.next();
            CategorySpec categorySpec = category.getSpec();

            if(searchSpec.getAgeType() != categorySpec.getAgeType())
                continue;

            if(searchSpec.getJobType() != categorySpec.getJobType())
                continue;

            if(searchSpec.getEmployType() != categorySpec.getEmployType())
                continue;

            if(searchSpec.getLocation() != categorySpec.getLocation())
                continue;

            Boolean jobStatus = searchSpec.isJobStatus();
            if((jobStatus != null) && (!jobStatus.equals("")) &&
                    (!jobStatus.equals(categorySpec.isJobStatus())))
            continue;
            matchingCategorys.add(category);
        }

        return matchingCategorys;

    }
}

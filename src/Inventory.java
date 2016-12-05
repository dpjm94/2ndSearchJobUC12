import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 03/12/2016.
 */
public class Inventory {

    private final List jobs;

    public Inventory(){

        jobs = new LinkedList();
    }

    public void addJob(String categoryNo, double age, JobSpec spec){
        Job job = null;
        if(spec instanceof CategorySpec){
            job = new Category(categoryNo,age,(CategorySpec)spec);
        }
        jobs.add(job);
    }

    public Job getJob(String categoryNo){
        for(Iterator i = jobs.iterator(); i.hasNext();){
            Job job = (Job)i.next();
            if(job.getCategoryNo().equals(categoryNo)){
               return job;
            }
        }
        return null;
    }

    public List search(CategorySpec searchSpec){
        List matchingCategorys = new LinkedList();
        for(Iterator i = jobs.iterator(); i.hasNext();){
            Category category = (Category)i.next();
            if(category.getSpec().matches(searchSpec))
            matchingCategorys.add(category);
        }

        return matchingCategorys;

    }
}

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 03/12/2016.
 */
public class Inventory {

    private final List inventory;

    public Inventory(){

        inventory = new LinkedList();
    }

    public void addJob(String categoryNo, double age,
                       JobSpec spec){
        Job job = new Job(categoryNo,age,spec);
        inventory.add(job);
    }

    public Job getJob(String categoryNo){
        for(Iterator i = inventory.iterator(); i.hasNext();){
            Job job = (Job)i.next();
            if(job.getCategoryNo().equals(categoryNo)){
               return job;
            }
        }
        return null;
    }

    public List search(JobSpec searchSpec){
        List matchingJobs = new LinkedList();
        for(Iterator i = inventory.iterator(); i.hasNext();){
            Job job = (Job)i.next();
            if(job.getSpec().matches(searchSpec))
            matchingJobs.add(job);
        }

        return matchingJobs;

    }
}

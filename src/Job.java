/**
 * Created by donalmaher on 04/12/2016.
 */
public abstract class Job {
    private final String categoryNo;
    private final double age;
    private final JobSpec spec;


    public Job(String categoryNo, double age, JobSpec spec) {
        this.categoryNo = categoryNo;
        this.age = age;
        this.spec = spec;
    }


    public String getCategoryNo() {
        return categoryNo;
    }


    public double getAge() {
        return age;
    }


    public JobSpec getSpec(){
        return spec;
    }

}

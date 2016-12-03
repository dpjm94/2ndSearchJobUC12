
public class Category {
    private final String categoryNo;
    private final AgeType ageType;
    private final double age;
    private final EmployType employType;
    private final JobType jobType;
    private final Location Location;
    private final boolean jobStatus;


    public Category(String categoryNo, double age, AgeType ageType, EmployType employType, JobType jobType, Location location, boolean jobStatus) {
        this.categoryNo = categoryNo;
        this.ageType = ageType;
        this.age = age;
        this.employType = employType;
        this.jobType = jobType;
        Location = location;
        this.jobStatus = jobStatus;

    }


    public String getCategoryNo() {
        return categoryNo;
    }

    public AgeType getAgeType() {
        return ageType;
    }

    public double getAge() {
        return age;
    }

   /* public void setAge(double age) {
        this.age = age;
    }*/


    public EmployType getEmployType() {
        return employType;
    }

    public JobType getJobType() {
        return jobType;
    }

    public Location getLocation() {
        return Location;
    }

    public boolean isJobStatus() {
        return jobStatus;
    }
}

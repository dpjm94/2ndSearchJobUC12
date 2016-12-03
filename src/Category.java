
public class Category {
    private String categoryNo;
    private AgeType ageType;
    private double age;
    private EmployType employType;
    private JobType jobType;
    private Location Location;
    private boolean jobStatus;


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

    public void setAge(double age) {
        this.age = age;
    }


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

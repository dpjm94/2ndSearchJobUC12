
public class Category {
    private String categoryNo;
    private String ageType;
    private double age;
    private String employType;
    private String jobType;
    private String Location;
    private boolean jobStatus;


    public Category(String categoryNo, double age, String ageType,String employType, String jobType, String location, boolean jobStatus) {
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

    public String getAgeType() {
        return ageType;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public String getEmployType() {
        return employType;
    }

    public String getJobType() {
        return jobType;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isJobStatus() {
        return jobStatus;
    }
}

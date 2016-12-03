
public class CategorySpec {
    private final AgeType ageType;
    private final EmployType employType;
    private final JobType jobType;
    private final Location Location;
    private final boolean jobStatus;


    public CategorySpec(AgeType ageType, EmployType employType, JobType jobType, Location location, boolean jobStatus) {
        this.ageType = ageType;
        this.employType = employType;
        this.jobType = jobType;
        Location = location;
        this.jobStatus = jobStatus;
    }

    public AgeType getAgeType() {
        return ageType;
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

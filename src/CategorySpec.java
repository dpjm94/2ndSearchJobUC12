
public class CategorySpec extends JobSpec {
    private final AgeType ageType;
    private final EmployType employType;
    private final JobType jobType;
    private final Location location;
    private final boolean jobStatus;


    public CategorySpec(AgeType ageType, EmployType employType, JobType jobType, Location location, boolean jobStatus) {
        this.ageType = ageType;
        this.employType = employType;
        this.jobType = jobType;
        this.location = location;
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
        return location;
    }

    public boolean isJobStatus() {
        return jobStatus;
    }

    public boolean matches(CategorySpec otherSpec) {
        if (jobType != otherSpec.jobType)
            return false;
        if (employType != otherSpec.employType)
            return false;
        if (location != otherSpec.location)
            return false;
        if (ageType != otherSpec.ageType)
            return false;
        if (jobStatus!= otherSpec.jobStatus)
            return false;
        return true;
    }
}

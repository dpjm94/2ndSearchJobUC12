/**
 * Created by donalmaher on 04/12/2016.
 */
public abstract class JobSpec {
    private final AgeType ageType;
    private final EmployType employType;
    private final JobType jobType;
    private final Location location;


    public JobSpec(AgeType ageType, EmployType employType, JobType jobType, Location location) {
        this.ageType = ageType;
        this.employType = employType;
        this.jobType = jobType;
        this.location = location;

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


    public boolean matches(JobSpec otherSpec) {
        if (jobType != otherSpec.jobType)
            return false;
        if (employType != otherSpec.employType)
            return false;
        if (location != otherSpec.location)
            return false;
        if (ageType != otherSpec.ageType)
            return false;
        return true;
    }
}

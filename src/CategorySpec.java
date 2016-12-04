
public class CategorySpec extends JobSpec {

    private final boolean jobStatus;


    public CategorySpec(AgeType ageType, EmployType employType, JobType jobType, Location location, boolean jobStatus) {
        super(ageType,employType,jobType,location);
        this.jobStatus = jobStatus;
    }

    public boolean isJobStatus() {
        return jobStatus;
    }

    public boolean matches(JobSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof CategorySpec))
            return false;
        CategorySpec spec = (CategorySpec)otherSpec;
        if (jobStatus != spec.jobStatus)
            return false;
        if (jobStatus!= spec.jobStatus)
            return false;
        return true;
    }
}

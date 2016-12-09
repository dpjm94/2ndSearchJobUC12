public enum EmployType {

    CONTRACT,JOBSHARE,PARTTIME,PERMANENT,
    SEASONAL,TEMPORARY;

    public String toString() {
        switch(this) {
            case CONTRACT:   return "Contract";
            case JOBSHARE:   return "Job share";
            case SEASONAL:   return "Seasonal";
            case TEMPORARY:  return "Temporary";
            case PARTTIME:   return "Part-time";
            case PERMANENT:  return "Permanent";
            default:         return "invalid employee type";
        }
    }
}



public enum AgeType {

    ADULT,STUDENT;

    public String toString() {
        switch(this) {
            case ADULT:   return "Adult";
            case STUDENT:   return "Student";
            default:         return "invalid value";
        }
    }
}

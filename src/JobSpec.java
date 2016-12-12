import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by donalmaher on 04/12/2016.
 */
public class JobSpec {
    private Map interests;

    public JobSpec(Map interests){
        if(interests == null){
            this.interests = new HashMap();
        }else{
            this.interests = new HashMap(interests);
        }
    }

    public Object getInterest(String interestName){
        return interests.get(interestName);
    }

    public Map getInterests(){
        return interests;
    }


    public boolean matches(JobSpec otherSpec) {
        for(Iterator i = otherSpec.getInterests().keySet().iterator();
            i.hasNext();) {
            String InterestName = (String)i.next();
            if(!interests.get(InterestName).equals(
                    otherSpec.getInterest(InterestName))){
                return false;
            }
        }
        return true;
    }
}

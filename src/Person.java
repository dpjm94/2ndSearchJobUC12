/**
 * Created by donalmaher on 09/12/2016.
 */
public class Person {

    private String name;
    private String town;
    private String age;


    public Person(String name, String town, String age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getAge() {
        return age;
    }
}

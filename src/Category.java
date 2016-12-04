
public class Category extends Job {
    private final String categoryNo;
    private final double age;
    private final CategorySpec spec;


    public Category(String categoryNo, double age, CategorySpec spec) {
        this.categoryNo = categoryNo;
        this.age = age;
        this.spec = spec;
    }


    public String getCategoryNo() {
        return categoryNo;
    }


    public double getAge() {
        return age;
    }

   /* public void setAge(double age) {
        this.age = age;
    }*/

   public CategorySpec getSpec(){
       return spec;
   }
}

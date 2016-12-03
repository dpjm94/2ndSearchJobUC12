
public class Category {
    private final String categoryNo;
    private final double age;
    private CategorySpec spec;


    public Category(String categoryNo, double age, CategorySpec spec) {
        this.categoryNo = categoryNo;
        this.age = age;
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

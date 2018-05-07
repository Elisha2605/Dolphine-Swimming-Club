public class Member{

   private String name;
   private int age;
   private String sex;
   private String activity;
   private String ageCategory;
   private String swimmingCategory;
   private String swimmingDiscipline; //(alt)

   public Member(String name, int age, String sex, String activity, 
                      String ageCategory, String swimmingCategory, 
                      String swimmingDiscipline){
                      
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.activity = activity;
      this.ageCategory = ageCategory;
      this.swimmingCategory = swimmingCategory;
      this.swimmingDiscipline = swimmingDiscipline;
   
   }
 
 
   public void setAge(int age){
      this.age = age;
   }
   
   public void setAgeCategory(String ageCategory){
      this.ageCategory = ageCategory;
   }
 
   public void setSwimmingCategory(String swimmingCategory){
      this.swimmingCategory = swimmingCategory;
   }
 
   public void setSwimmingDiscipline(String swimmingDiscipline){
      this.swimmingDiscipline = swimmingDiscipline;
   }
 
   public String getActivity(){
      return activity;
   }
 
   public String getAgeCategory(){
      return swimmingCategory;
   }
   
   public String toString(){
       String minString = "";
       minString += "Name: " + name + "\n";
       minString += "Age: " + Integer.toString(age) + "\n";
       minString += "Sex: " + sex + "\n";
       minString += "Activity: " + activity + "\n";
       minString += "Age category: " + ageCategory + "\n";
       minString += "Swimming category: " + swimmingCategory + "\n";
       minString += "Swimming discipline: " + swimmingDiscipline + "\n"; 
       return minString;  
   }
   public String hey(){
   return "HEY";
   }
}
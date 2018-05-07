public class Trainer{

   private String time;
   private String date;
   
   public Trainer(String time, String date){
      this.time = time;
      this.date = date;
   }
   
   public String getBestTime(){
      return time;
   }

}
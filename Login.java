import java.util.*;

public class Login{

   Scanner scan = new Scanner(System.in);
   String[] staf = new String[3];
   int[] StafPass = new int[3];
   
   
   
   
   
   public void startMenuPrompt(){
      Scanner scanInput = new Scanner(System.in);
      int input = 0;
      boolean s = true;
      String pass;
      
      while(s){
         System.out.println("******* Welcome to Delphine Swimming Club ******* " + "\n");
         System.out.println("You are about to login, please identify yourself:");
         System.out.println("1 : Chairman");
         System.out.println("2 : Trainer");
         System.out.println("3 : Accountant");
         
         input = scanInput.nextInt();
         staf[0] = scanInput.nextLine();
         if(input == 1){
            System.out.println("Hey mister chairman, please login \n ");
            System.out.println("Username: " + staf[1]);
              
             
         }else if(!scanInput.hasNextLine()){
            System.out.println("Yeeees");
         } 
         s = false;        
      }
     
   }
   
   
   public int switchChairman(){
   
      
      int input = 1;
      input = scan.nextInt();   
      switch(input){
         
         case 1:
            System.out.println("Username: ");
            //scan.nextInt();
            break;
         
         case 2:
            System.out.println("Password: ");
            break;         
      }
      return input;   
   }
   
   public int getInt(String prompt){
      Scanner scanInt = new Scanner(System.in);
      System.out.print(prompt);
      //antiJarl scanInt.hasNextInt()
      while (!scanInt.hasNextInt()){
         //smid det næste væk, når det ikke er en int
         scanInt.next();
         //vejled brugeren
         System.out.print(prompt);
      }
      
      return scanInt.nextInt();
   }
}
   

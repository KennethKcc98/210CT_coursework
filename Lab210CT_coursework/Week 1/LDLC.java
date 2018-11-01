import java.util.*;
public class LDLC{
    public static void main(String []args){
        double tc=0;
        double hdlc=0;
        double tg=0;
        double ldlc = 0;
        
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("please input Total Cholesterol (TC): ");
            tc= scanner.nextDouble();

            System.out.println("please input HDL cholesterol (HDLC): ");
            hdlc= scanner.nextDouble();

            System.out.println("please input Triglyceride (TG): ");
            tg= scanner.nextDouble();

            ldlc = tc-hdlc-(tg/5);
            System.out.println("LDL cholesterol (LDLC) : "+ldlc);
            /*reference: https://www.medicalnewstoday.com/articles/315900.php
                         https://www.mayoclinic.org/tests-procedures/cholesterol-test/about/pac-20384601
            */
            if(ldlc >= 100 && ldlc <= 129){
                System.out.println("Near optimal if there is no heart disease. High if there is heart disease.");
            }else if(ldlc >= 130 && ldlc <= 159){
                System.out.println("Borderline high if there is no heart disease. High if there is heart disease.");
            }else if(ldlc >= 160 && ldlc <= 189){
                System.out.println("High if there is no heart disease. Very high if there is heart disease.");
            }else if(ldlc >= 190){
                System.out.println("It is very high!");
            }else if(ldlc <0){
                System.out.println("Please check your data is input correct or not!");
            }
            else{
                System.out.println("Best for people who have heart disease or diabetes.");
            }
            
        }catch(InputMismatchException ex){
            /*InputMismatchException is mean thrown by a Scanner 
            to indicate that the token retrieved does not match 
            the pattern for the expected type, or that the token 
            is out of range for the expected type.
            reference: https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html*/
            System.out.println("Please input number!!");
        }  
        
            scanner.close();    
    }
}
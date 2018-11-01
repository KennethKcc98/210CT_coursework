import java.util.*;
public class FatCoefficient{
    public static void main(String [] args){
        double weight = 0; //define weight
        double height = 0; //define height

        Scanner s = new Scanner(System.in);//define scanner

        System.out.println("Fat Coefficient (FC) = weight / (height * height)");
        try{
            System.out.println("Your weight(kg): ");
            weight = s.nextDouble();//input weight
            System.out.println("Your height(m): ");
            height = s.nextDouble();//input height
            double fc = weight / (height * height);
            System.out.println("Your Fat Coefficient is: "+ fc);
            if (fc > 25){
                    //Fat Coefficient is large than 25
					System.out.println("Too Fat, need to keep fit!") ;
				}else if (fc < 15){
                    //Fat Coefficient is less than 15
                    System.out.println("Too Thin, need to keep fat!") ;
                }else if(fc <0){
                    System.out.println("Please check your data is input correct or not!");
                }
                else{
                    //Fat Coefficient is normal
                    System.out.println("Just fit, keep on!") ;
                }
        }catch(InputMismatchException ex){
            /*InputMismatchException is mean thrown by a Scanner 
            to indicate that the token retrieved does not match 
            the pattern for the expected type, or that the token 
            is out of range for the expected type.
            reference: https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html*/
            //if user input other data type(like String),it will print statment
            System.out.println("Please input number!!");
        }
        scanner.close();    
    }
}
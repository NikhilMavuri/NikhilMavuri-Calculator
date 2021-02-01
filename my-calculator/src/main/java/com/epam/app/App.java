package com.epam.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	initializing variables
    	int option,num1,num2;
    	Scanner s=new Scanner(System.in);
    	while(true) {
//      choosing option for calculator
        System.out.print("----Calculator----\n"+"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.exit\n");
        System.out.println("Enter your option: ");
        option=s.nextInt();
         if(option==5)
        {
        	 System.out.println("Thanks and Bye...");
        	break;
        }
         else if(option>5) {
        	 System.out.println("You are selected incorrect option\nPlease choose value from the given options");
        	 continue;
        	 
         }
//      taking inputs from command line  
        System.out.println("Enter num1 value: ");
        num1 = s.nextInt();
        System.out.println("Enter num2 value: ");
        num2 = s.nextInt();
//     object initialization
        Operations op=new Operations();
        if(option==1)
        {
        	System.out.println("Addition is: "+op.add(num1, num2));
        	
        }
        else if(option==2)
        {
        	System.out.println("Subtraction is: "+op.sub(num1, num2));
        	
        }
        else if(option==3)
        {
        	System.out.println("Multiplication is: "+op.mul(num1, num2));
        	
        }
        else if(option==4)
        {
        	float res=op.div(num1, num2);
        	if(res==-1) {
        		System.out.println("Divison not takesplace!!!!");
        	}
        	else
        	System.out.println("Divison is: "+res);
        	
        }
        
        
        System.out.println("Do you want to contiue (Y/N): ");
        char c = s.next().charAt(0);
        if(c=='N' || c=='n') {
        	System.out.println("Thanks......Bye!");
        	break;
        }
        	
        
    }
        
    }
}

package day17_stringpool_whileloop;
import java.util.*;
public class TIPCALCBOJAN {

	    public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        boolean split;
	        int people;
	        double totalPay, tip = 0, tipPerPerson=0, payPerPerson= 0;
	        String answer,  quality;
	        
	    
	        System.out.println("Split:");
	        answer = scan.next();
	        if(answer.equalsIgnoreCase("yes")){
	            split = true;
	        }else {
	            split = false;
	            
	        }
	        
	        System.out.println("Number of people:");
	        people = scan.nextInt();
	        
	        System.out.println("Check amount:");
	        totalPay = scan.nextDouble();
	        
	        System.out.println("Service Quality:");
	        quality = scan.next();
	        
	    if (quality.equalsIgnoreCase("poor")){tip=totalPay*0.05;}else
	        if (quality.equalsIgnoreCase("fair")){tip=totalPay*0.1;}else
	        if (quality.equalsIgnoreCase("good")){tip=totalPay*0.15;}else
	        if (quality.equalsIgnoreCase("great")){tip=totalPay*0.2;}else
	        if (quality.equalsIgnoreCase("excellent")){tip=totalPay*0.25;}
	        
	        if(answer.equalsIgnoreCase("yes")) {
	            if(people == 1) {
	                payPerPerson = totalPay + tip;
	            }else if(people == 2) {
	                payPerPerson = (totalPay + tip)/2;
	            }else if(people == 3) {
	                payPerPerson = (totalPay + tip)/3;
	            }else if(people == 4) {
	                payPerPerson = (totalPay + tip)/4;
	            }else if(people == 5) {
	                payPerPerson = (totalPay + tip)/5;
	            }else if(people == 6) {
	                payPerPerson = (totalPay + tip)/6;
	            }else if(people == 7) {
	                payPerPerson = (totalPay + tip)/7;
	            }else if(people == 8) {
	                payPerPerson = (totalPay + tip)/8;
	            }else if(people == 9) {
	                payPerPerson = (totalPay + tip)/9;
	            }else if(people == 10) {
	                payPerPerson = (totalPay + tip)/10;
	                
	            }else if(people > 10) {
	                payPerPerson = (totalPay + tip)/10;
	            }else if(people == 0) {
	                payPerPerson = totalPay + tip;
	            }
	        
	    
	}
	    if(answer.equalsIgnoreCase("yes")) {
	        
	        switch(people) {
	        case 1:
	            tipPerPerson = tip;
	        break;
	        
	        case 2:
	            tipPerPerson = tip / 2;
	        break;
	        
	        case 3:
	            tipPerPerson = tip / 3;
	        break;
	        
	        case 4:
	            tipPerPerson = tip / 4;
	        break;
	        
	        case 5:
	            tipPerPerson = tip / 5;
	        break;
	        
	        case 6:
	            tipPerPerson = tip / 6;
	        break;
	        
	        case 7:
	            tipPerPerson = tip / 7;
	        break;
	        
	        case 8:
	            tipPerPerson = tip / 8;
	        break;
	        
	        case 9:
	            tipPerPerson = tip / 9;
	        break;
	        
	        case 10:
	            tipPerPerson = tip / 10;
	        break;
	        
	        case 0:
	            tipPerPerson = tip;
	        break;
	        }
	        

	}else {
	    tipPerPerson = tip;
	}
	        
	    switch(people) {
	    case 0:
	        System.out.println("Number of people entered: &");
	    break;
	    
	    case 1:
	        System.out.println("Number of people entered: &");
	    break;
	    
	    case 2:
	        System.out.println("Number of people entered: &&");
	    break;
	    
	    case 3:
	        System.out.println("Number of people entered: &&&");
	    break;
	    
	    case 4:
	        System.out.println("Number of people entered: &&&&");
	    break;
	    
	    case 5:
	        System.out.println("Number of people entered: &&&&&");
	    break;
	    
	    case 6:
	        System.out.println("Number of people entered: &&&&&&");
	    break;
	    
	    case 7:
	        System.out.println("Number of people entered: &&&&&&&");
	    break;
	    
	    case 8:
	        System.out.println("Number of people entered: &&&&&&&&");
	    break;
	    
	    case 9:
	        System.out.println("Number of people entered: &&&&&&&&&");
	    break;
	    
	    case 10:
	        System.out.println("Number of people entered: &&&&&&&&&&");
	    break;
	    
	        default:System.out.println("Number of people entered: &&&&&&&&&&");
	        
	    }
	System.out.println("Total to pay: " + (totalPay + tip));
	    
	    System.out.println("Total tip: " + tip);
	        
	    System.out.println("Total per person: "+ payPerPerson);
	        
	    System.out.println("Tip per person: "+ tipPerPerson);

	    }    

	}



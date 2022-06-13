package Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteEligibility {
	
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of joining in dd/MM/yyyy formate");
		try {
			String date=sc.next();
	
	        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate ld=LocalDate.parse(date,dtf);
			
			LocalDate ld1=LocalDate.now() ;
			
			Period p=Period.between(ld,ld1);
			
			if(p.getYears()<18 && p.getYears()>=1 ) {
				System.out.println("You are not eligible for vote.");
			}
			
			else if(p.getYears()>=18) {
				
				if(p.getMonths()==0 && p.getDays()==0) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
				}
				else {
					
				    System.out.println("You are eligible to cast your vote.");
				}
			}
			else if(p.getYears()<1 && p.getMonths()<0 && p.getDays()<0){
				System.out.println("Date should not be in future");
				
			}
		}
		
		catch(Exception e) {
			System.out.println("please pass the date in the proper format");
			
		}
	
	}

}

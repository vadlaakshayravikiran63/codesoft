import java.util.Scanner;
public class Student_Grade_Calculator
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Student grade calculator");
		System.out.println("enter no of subjects");
		int nS=sc.nextInt();
		int total=0;
		for(int i=0;i<nS;i++){
		    System.out.println("enter marks obtain in "+(i+1)+": ");
		    int marks=sc.nextInt();
		    total+=marks;
		}
		double averP=(double)total/nS;
		char Grade;
		if(averP>=90){
		    Grade='O';
		}
		else if(averP>=80){
		    Grade='A';
		}
		else if(averP>=70){
		    Grade='B';
		}
		else if(averP>=60){
		    Grade='C';
		}
		else if(averP>=50){
		    Grade='D';
		}
		else if(averP>=40){
		    Grade='E';
		}
		else{
		    Grade='F';
		}
			System.out.println("Total Marks Scored is :"+total);
				System.out.println("Average percentage is:"+averP+"%");
			    	System.out.println("Grade:"+Grade);
			    	    	
	}
}

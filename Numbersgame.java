import java.util.Scanner;
public class NumberGame
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int chances=8;
	int finals=0;
	boolean playAgain=true;
		System.out.println("welcome buddy!");
			System.out.println("hey buddy you have about "+chances+"chances to win the game");
	 while(playAgain){
	     int rand=getrandN(1,100);
	     boolean guess=false;
	     for (int i=0;i<chances;i++){
	         	System.out.println("chances"+(i+1)+" enter your guuess");
	         	int user=sc.nextInt();
	         	if (user==rand){
	         	    guess=true;
	         	    finals+=1;
	         	    	System.out.println("you won it.");
	         	    	break;
	         	}
	         	else if(user>rand){
	         	    	System.out.println("too high");
	         	    	
	         	}
	         	else{
	         	    	System.out.println("too low");
	         	}
	     }
	     if(guess==false){
	         	System.out.println("Sorry buddy.you lost the chances.the number is "+rand);
	     }
	     	System.out.println("do you want play again(y/n)");
	     	String pA=sc.next();
	     	playAgain=pA.equalsIgnoreCase("y");
	 }   
	 	System.out.println("that's it Buddy,Hope you enjoyed it.");
	 		System.out.println("here your Score: "+finals);
	}
	public static int getrandN(int min,int max){
	    return(int)(Math.random()*(max-min+1)+min);
	}
}

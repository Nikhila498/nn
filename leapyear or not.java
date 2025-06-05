//check wheather the is leap year or not
import java.util.scanner;
class Main{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println("enter the range");
	 if(int i%4==0 && i%100!=0){
	    System.out.println("is a leap year");
	 }else{
	   System.out.println("is not a leap year");
	  }
	  sc.close();
  }
}
     
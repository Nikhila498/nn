public class Main{
 static int sumNaturalnumbers(int n){
     if(n==1){
         return 1;
     }else{
         return+sumNaturalnumbers(n-1);
     }
 }
	public static void main(String[] args){
	    int number=10;
	    int result=sumNaturalnumbers(number);
	   System.out.println("sum of first"+number+"natural number is"+result);
	}
}

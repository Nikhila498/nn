public class Main
{
    public static void SolveHanoi(int n,char source,char auxiliary,char destination){
        if(n==1){
            System.out.println("move disk 1 from" +source+ "to"+ destination);
            return;
        }
        SolveHanoi(n-1,source,destination,auxiliary);
        System.out.println("move disk" +n+ "from" +source+ "to"+ destination);
        SolveHanoi(n-1,auxiliary,source,destination);
    }
	public static void main(String[] args) {
	    int numDisk=4;
		System.out.println("Towers of Hanoi solution for" +numDisk+ "disks:");
		SolveHanoi(numDisk, 'A' , 'B' , 'C');
	}
}
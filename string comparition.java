import java.util.Scanner;

public class Solution {
public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0,k);
    String largest = s.substring(0,k);
    String str;
    int size = s.length()-k+1;
    for(int i=0;i<size;++i){
        str = s.substring(i,i+k);
        if(smallest.compareTo(str) > 0)
        smallest =str;
        if(largest.compareTo(str)<0)
        largest = str;           
    }
    return smallest + "\n" + largest;
}
   


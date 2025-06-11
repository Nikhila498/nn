public class Main {
    public static int linearSearch(int[] arr,int target) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers={4, 2, 7, 1, 9};
        int target=7;
        int result=linearSearch(numbers, target);

        if (result!=-1) {
            System.out.println("Target"+target+"found at index:"+result);
        } else {
            System.out.println("Target"+target+"not found in the array.");
        }
    }
}
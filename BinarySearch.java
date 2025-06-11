public class Main {
    public static int binarySearch(int[] arr, int target) {
        int low =0;
        int high=arr.length-1;

        while (low <= high) {
            int mid=low+(high-low)/2;  

            if (arr[mid]==target) {
                return mid;
            } else if(arr[mid]<target) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers={1, 3, 5, 7, 9, 11};
        int target=7;
        int result=binarySearch(numbers,target);
        
        if (result==-1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
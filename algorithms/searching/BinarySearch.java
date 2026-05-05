public class BinarySearch {
    public static int binarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target) 
                start = mid + 1;
            else 
                end = mid -1;
        }
        return -1;
    }

 public static void main(String[] args) {
        int[] arr = {1,4,7,9,12,13,15,19,20,21,25};
        int target = 19;

        
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found at Index " + result);
        }
    }
}

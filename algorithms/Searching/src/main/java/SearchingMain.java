public class SearchingMain {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,12,13,15,19,20,21,25};
        int target = 19;
        int result =  LinearSearch.linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found at Index " + result);
        }
    }
}
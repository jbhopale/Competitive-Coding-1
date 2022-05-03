/*
Time: O(log(n)) where n is the size of input arr since we are reducing search spacce by half in each iteration
Space: O(1) no auxilary space used in method
*/
public class Problem1{
    private static int fingMissing(int[] arr){
        int ans = -1;
        int low = 0, high = arr.length-1;

        while(low < high){
            int mid = low+(high-low)/2;
            if(arr[mid+1] - arr[mid] > 1) return arr[mid]+1;
            if(arr[mid] - arr[mid-1] > 1) return arr[mid]-1;
            if(high-mid == arr[high]-arr[mid]) high = mid-1;
            else if (mid-low == arr[mid]-arr[low]) low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,5,6,7};
        System.out.println(fingMissing(input));
    }
}
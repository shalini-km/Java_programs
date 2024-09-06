public class BinarySearch {
    public static int binarySearch(int arr[], int left, int right, int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                left=mid+1;
            else if(target<arr[mid])
                right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,11,12,23};
        int target=1;
        int n=arr.length;
        int result=binarySearch(arr,0,n-1,target);
        System.out.println(result);
    }
}

public class Kadane {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int sum=0,actualSum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            actualSum=Math.max(sum,actualSum);
        }
        System.out.println(actualSum);
    }
}

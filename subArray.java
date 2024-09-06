public class subArray {
    public static void subarr(int[] arr,int left,int right){
        if(right== arr.length){
            return;
        }
        else if(left>right){
            subarr(arr,0,right+1);
        }
        else{
            for(int i=left;i<=right;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            subarr(arr,left+1,right);
        }
    }
    public static void main(String[] args) {
        int[] arr={7,3,5,6};
        subarr(arr,0,0);
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                for(int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//        }

    }
}

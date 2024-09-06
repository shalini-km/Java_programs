import java.util.ArrayList;

public class subSequence {
    public static void subSequences(int i,int[] arr,ArrayList<Integer> list,int n){
      if(i>=n){
          System.out.println(list);
          return;
      }
//      pick case
      list.add(arr[i]);
      subSequences(i+1,arr,list,n);

//      not pick case
        list.remove(list.size()-1);
        subSequences(i+1,arr,list,n);
    }
    public static void main(String[] args) {
        int[] arr={4,5,6};
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int i=0;
        subSequences(i,arr,list,n);
    }
}

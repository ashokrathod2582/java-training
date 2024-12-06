package dsa;

public class LinearSearch {

    public static int linearSearch(int[] a, int target){
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int target = 8;
        int result = linearSearch(a,target);
        System.out.println("result: "+result);
    }
}

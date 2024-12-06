package dsa;

public class BinarySearch {

    public int binarySearch(int[] a, int t){
        int left = 0;
        int right = a.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == t){
                return mid;
            }else if(a[mid]<t){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] a = {1,2,3,4,5,6,7,8,9};
        int t = 3;
        int result = binarySearch.binarySearch(a,t);
        System.out.println("result: "+result);
    }
}

package dsa.array;

public class SearchElement {

    static int searchElement(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        int key = 5;
        int n = 4;
        System.out.println("Element found at  "+searchElement(arr,n,key));
    }
}

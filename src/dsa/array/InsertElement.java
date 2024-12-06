package dsa.array;

public class InsertElement {

    // Function to insert a given key in
    // the array. This function returns n+1
    // if insertion is successful, else n.
    static int insertSorted(int[] arr, int n, int key, int capacity){
        // Cannot insert more elements if n
        // is already more than or equal to
        // capacity
        if(n>=capacity){
            return n;
        }

        arr[n] = key;

        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        int key = 5;
        int n = 4;
        int capacity = 20;
        System.out.println(insertSorted(arr,n,key,capacity));
    }
}

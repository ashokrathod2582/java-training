package practice.collectionFramework;

import java.util.HashMap;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,3,4,4,4};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<array.length; i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }else{
                hashMap.put(array[i], 1);
            }
        }

        for(HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }
    }
}

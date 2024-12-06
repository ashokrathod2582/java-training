package java8;

public class Armstrong {

    public static boolean isArmstrong(int num){
        int temp=num, rem, result=0;
        while(num > 0){
            rem = num % 10;
            result = result + rem * rem * rem;
            num = num / 10;
        }
        if(result ==  temp){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(154));
        System.out.println(isArmstrong(370));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(372));
    }
}

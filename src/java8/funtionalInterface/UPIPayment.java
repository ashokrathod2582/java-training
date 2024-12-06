package java8.funtionalInterface;

@FunctionalInterface
public interface UPIPayment {

    String doPayment();

    default String getScratchCard(){
        return "Scratch Card";
    }
}

package designPatterns.creational.factoryDesign;

public class FactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Close");
        obj.spec();
    }
}

package practice;

public class Prac {

    public String getName(String name){
        if(name != null){
            if(name.equals("Ashok")){
                return name;
            }else{
                return getName("Ashok");
            }
        }
        return name;
    }

    public static void main(String[] args) {
        Prac prac = new Prac();
        String name = prac.getName("Rathod");
        System.out.println(name);
    }
}

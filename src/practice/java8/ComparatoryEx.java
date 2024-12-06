package practice.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ComparatoryEx {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Ashok",23));
        personList.add(new Person("Rahul",30));
        personList.add(new Person("Sachin",28));

        System.out.println("Before sort: ");
        for(Person person: personList){
            System.out.println(person.getName()+" : "+ person.getAge());
        }

        System.out.println("After sort: ");
        //sort by Age
//        personList.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //lambda expresssion
//        personList.sort((a, b)-> a.getAge() - b.getAge());

        //method reference
        personList.sort(Comparator.comparingInt(Person::getAge));

        for(Person person : personList){
            System.out.println(person.name+" : "+person.age);
        }
    }
}

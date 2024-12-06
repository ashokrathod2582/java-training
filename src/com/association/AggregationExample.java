package com.association;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class Student
{
    String name;
    int enrol;
    String course;

    Student(String name, int enrol, String course)
    {

        this.name = name;
        this.enrol = enrol;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrol=" + enrol +
                ", course='" + course + '\'' +
                '}';
    }
}

// Course class having a list of students.
class Course
{

    String name;
    private List<Student> students;
    Course(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> studentsData()
    {
        return students;
    }
}

/* College class having a list of Courses*/
class College
{

    String collegeName;
    private final List<Course> courses;

    College(String collegeName, List<Course> courses)
    {
        this.collegeName = collegeName;
        this.courses = courses;
    }

    // Returning number of students available in all courses in a given college
    public int countStudents()
    {
        int studentsInCollege = 0;
        List<Student> students;
        for(Course course : courses)
        {
            students = course.studentsData();
            for(Student s : students)
            {
                studentsInCollege++;
            }
        }
        return studentsInCollege;
    }

}

// main method
class AggregationExample
{
    private static final Logger logger = Logger.getLogger(String.valueOf(AggregationExample.class));
    public static void main (String[] args)
    {
        Student std1 = new Student("Emma", 1801, "MCA");
        Student std2 = new Student("Adele", 1802, "BSC-CS");
        Student std3 = new Student("Aria", 1803, "Poly");
        Student std4 = new Student("Ally", 1804, "MCA");
        Student std5 = new Student("Paul", 1805, "Poly");

        // Constructing list of MCA Students.
        List <Student> mcaStudents = new ArrayList<>();
        mcaStudents.add(std1);
        mcaStudents.add(std4);

        //Constructing list of BSC-CS Students.
        List <Student> bscCSStudents = new ArrayList<>();
        bscCSStudents.add(std2);

        //Constructing list of Poly Students.
        List <Student> polyStudents = new ArrayList<>();
        polyStudents.add(std3);
        polyStudents.add(std5);

        Course mca = new Course("MCA", mcaStudents);
        Course bscCS = new Course("BSC-CS", bscCSStudents);
        Course poly = new Course("Poly", polyStudents);

        List <Course> courses = new ArrayList<>();
        courses.add(mca);
        courses.add(bscCS);
        courses.add(poly);

        // creating object of College.
        College college = new College("`SARHAD College`", courses);

        for(Course course: courses){
            System.out.print(course.getName() + "  =>  ");
            for (Student student : course.getStudents()){
                System.out.print(student.toString()+", ");
            }
            System.out.println();
        }

        System.out.println("Total number of students in the  "+ college.collegeName +" is "+ college.countStudents());
    }
}

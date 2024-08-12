import java.util.Comparator;
import java.io.*;
import java.util.*;

class Student{
    int rollNo;
    String name, address;
    public Student(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    //To print student details
    public String toString(){
        return this.rollNo + " " + this.name + " " + this.address;
    }
}


//class 2 implement comparator interface - by rollNo
class sortByRoll implements Comparator<Student>{
    //Method sorting in ascending order
    public int compare(Student a, Student b){
        return a.rollNo - b.rollNo;
    }
}

//class 3 implements comparator interface - by name
class sortByName implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        ///adding entry in thne list

        array.add(new Student(11,"Harish","pune"));
        array.add(new Student(13,"Yash","Dhule"));
        array.add(new Student(9,"Sunny","Nashik"));
        array.add(new Student(1,"Jay","Nagpur"));

        System.out.println("Unsorted list of student ");
        System.out.println(array);

        //Sorteing student entries by rollNo
        Collections.sort(array, new sortByRoll());
        //Display the list after sorting by the rollNo
        System.out.println("Sorted list by rollNo");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }


        //sorting student entries by name
        Collections.sort(array, new sortByName());
        //display the list after sorting by the name
        System.out.println("Sorted list by name");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
class Person{   //this is the Bass class of the program
    String name;
    int age;

    public Person(String name, int age ){
        this.name = name;
        this.age = name;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
// Subclass Inherit from the person to student
class Student extends Person { //extend is the inherit functions
    // this is the field
    String studentID;
    String course;
    int units;
    final int feePerunit = 1000; //annual fee for the unit

    //constructor of the class Student
    public Student(String name, int age, String studentID, String course, int units){
        super(name, age); //parent class constructors
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    // this is the method to calculate the total fee
    public double calculateFees(){
        return units * feePerUnit;
    }

    //override info
    @override
    public void displayInfo(){
        super.displayInfo(); //baseclass displayInfo() callout 
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee:" + calculateFees());
    }
}
// Subclass inherit fromt the person to Instructor
class Instructor extends Person{
    //this is the field
    String employeeID;
    String department;
    double salary;

    //constructor
    public Instructor(String name, int age, String employeeID, String department, double salary){
        super(name, age); // calll the parent class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    } 
    @override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}


//main class to promt or display the program.
public class UniversistyEnrollmentSystem{
    public static void printDetails(Person p){
        p.displayInfo(); // call out appropriate displyinfo() of the student and instructors.
    }
    
    public static void main(String[] args){
        //two students
        Student student1 = new Student("Vince Juanillas", 22, "221001002", "Computer Engineering", 20);
        Student student2 = new Student("Ferdie Estallo", 28, "C92100101", "Computer Engineering", 18);

        Instructor instructor1 = new Instructor("Engr. Tanya", 22, "E991002", "CEA", 10000);
        Instructor instructor2 = new Instructor("Engr. Vince", 22, "100C91002", "CEA", 9000);

        //printDetails() method to print the following main students anD instructors
        System.out.println("Student 1 Details");
        printDetails(student1);
        System.out.println();

        System.out.println("Student 2 Details");
        printDetails(student2);
        System.out.println();


        System.out.println("Instructor 1 Details");
        printDetails(instructor1);
        System.out.println();

        System.out.println("Instructor 2 Details");
        printDetails(instructor2);
        System.out.println();

    }
}   
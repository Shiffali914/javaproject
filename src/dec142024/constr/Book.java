package dec142024.constr;

public class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public Book(String title, String author)
    {
    this.title = title;
    this.author = author;
    }

    public void displayDetail(String title, String author, double price){
        System.out.println( title);
        System.out.println( author);
        System.out.println( price);
    }
    public void displayDetail(String title, String author){
        System.out.println(title);
        System.out.println(author);
    }
}











/* Constructor-------> which initializes the object
1 it has the same name as the class name
2 it does not have a return type,not even void
3 looks similar to method

rules
1. default const is present for all the classes by default
2. if there is a parameterized constr, jvm will not create a default constr
3. if we need a default constr then you have to create in case of


types of constructor
a default constructor  - no parameter
b parameter constructor - have parameter

compiler
student.java-----> Student.class[byte code] //JVM
Step 1
javac Student.java

Step 2 run the code
java student

*/
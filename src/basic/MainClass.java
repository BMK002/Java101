package basic;

public class MainClass {//main class
    static String text="test";

    void printText(){
        System.out.println(text);
    }

    public static void main(String[] args) {
        text="Text from main class";
        System.out.println(text);

        TestClass ob1=new TestClass("Hello");//instantiated TestClass through parameterized constructor
        ob1.printText();

        TestClass ob2=new TestClass();//instantiated TestClass using explicit constructor
        //data-driven
        ob2.setText("Welcome!");
        System.out.println(ob2.getText());

        ob2.setText("Hai...");
        System.out.println(ob2.getText());

        //accessing TestClass's local attribute from outside using one of the instance created
        ob2.text="test";
        ob2.printText();

        //overloaded constructor
        new TestClass("Java","Basics");
    }
}

class TestClass {
    String text;//default access specified local attribute of TestClass

    TestClass(){System.out.println("explicit c2 constructor invoked!");} //explicit TestClass default constructor

    TestClass(String txt){//parameterized c2 constructor
        text=txt;//assigning the received text as TestClass's local attribute value
    }

    TestClass(String t1, String t2){//constructor overloading
        System.out.println("Text1: "+t1);
        System.out.println("Text2: "+t2);
        System.out.println("runtime concat: "+t1.concat(t2));
        System.out.println("runtime concat: "+t1+t2);
        System.out.println("After runtime concat Text1: "+t1);
        System.out.println("After runtime concat Text2: "+t2);
        t1=t2.concat(t1);
        System.out.println("compile time concat: "+t1);
        System.out.println("After runtime concat Text1: "+t1);
        System.out.println("After runtime concat Text2: "+t2);
    }

    //getters and setters
    void setText(String t){ text=t;}
    String getText(){ return text; }

    //TestClass's method to print the local attribute's value
    void printText(){
        System.out.println(text);
    }

}

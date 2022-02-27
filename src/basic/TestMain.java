package basic;

public class TestMain {
    public static void main(String[] args) {
        MainClass mcObj = new MainClass();
        mcObj.printText();


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

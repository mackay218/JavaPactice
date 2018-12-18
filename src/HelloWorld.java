public class HelloWorld {
    public static void main(String[] args) {

        helloWorldMethod();
        myNameIs();
    }

    public static void helloWorldMethod(){
        System.out.println("Hello World");
    }

    public static void myNameIs(){
        String myName = "Dan";
        System.out.println("My name is " + myName);
    }
 }
package DesignPatterns.Singleton;

public class SingleObject {

    //create an object of SingleObject
//    Early initialization approach
//    private static SingleObject instance = new SingleObject();

//    Lazy approach
    private static SingleObject instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        if (instance == null) {
            return new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

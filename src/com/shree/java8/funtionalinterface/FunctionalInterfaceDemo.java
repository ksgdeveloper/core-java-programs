package com.shree.java8.funtionalinterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        ChildInterface childInterface = childrenHello();
        childInterface.hello();

    }

    private static ChildInterface childrenHello(){
        return () -> System.out.println("Hello from ChildInterface");
    }

    private static ParentInterface parentHello(){
        return () -> System.out.println("Hello from ChildInterface");
    }
}

//FunctionalInterface can extend another functionalInterface
@FunctionalInterface
interface ChildInterface extends ParentInterface{
    public void hello();

    default public void sayHello() {
        System.out.println("from ParentInterface");
    }
}

@FunctionalInterface
interface ParentInterface {
    public void hello();

    default public void sayHello() {
        System.out.println("from ParentInterface");
    }
}

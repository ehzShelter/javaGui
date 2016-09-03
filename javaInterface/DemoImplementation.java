import java.lang.*;

interface DemoInterface {
    public void doSomeWork();

    // default method
    default public void doSomeOtherWork() {
        System.out.println("doSomeOtherWork() implementation in the interface as a default implementation");
    }
}

class DemoImplementation implements DemoInterface {
    @Override
    public void doSomeWork() {
        System.out.println("doSomework() implemented in the class");
    }

    // YOU CAN OVERWRITE doSomeOtherWork() implementation
    @Override
    public void doSomeOtherWork() {
        System.out.println("Now this will overwrite doSomeOtherWork() default implementation");
    }

    public static void main(String[] args) {
        DemoImplementation obj = new DemoImplementation();
        obj.doSomeWork();
        obj.doSomeOtherWork();
    }
}

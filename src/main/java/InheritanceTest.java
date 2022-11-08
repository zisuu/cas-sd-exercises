
public class InheritanceTest {
    public static void main(String[] args) {
        B x = new A();
        x.foo();
        x.bar();
    }
}

class B {
    public B() {
        System.out.print("1");
    }
    public void foo() {
        System.out.print("2");
    }
    public void bar() {
        System.out.print("3");
    }
}

class A extends B {
    public A() {
        System.out.print("4");
    }
    public void bar() {
        System.out.print("5");
    }
}
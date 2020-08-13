package democonstructor;

class A {
    A(){
        System.out.println("Constructor class A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor class B");
    }
}

class C extends B{
    C(){
        System.out.println("Constructor class C");
    }
}

class OrderOfConstructor{
    public static void main(String[] args) {
        C c = new C();
    }
}

class Parent{
    void name()
    {
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    Child()
    {
        System.out.println("This is child class");
    }
}
class Main6{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}
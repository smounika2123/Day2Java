abstract class Parent{
    abstract void loan();
    void printing(){
        System.out.println("Welcome To Rbi");
    }
}
class Child extends Parent{
    void loan(){
        System.out.println("Loan Accepted");
    }
}
class Main10 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.loan();
        ch.printing();
        
    }
}

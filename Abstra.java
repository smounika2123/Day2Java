abstract class Bank{
    abstract void money();
    void balance()
    {
        System.out.println("Bank Balance");

    }
}
class Sbi extends Bank{
    void  money()
    {
        System.out.println("Money");
    }
}
class Abstra {
    public static void main(String[] args) {
        Sbi s= new Sbi();
        s.money();
        s.balance();
    }
    
}

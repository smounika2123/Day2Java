class Rbi{
    void loan()
    {
        System.out.println("This is Parent Rbi");
    }
}
class Sbi extends Rbi{
        Sbi()
        {
            System.out.println("This is Child1 Sbi");
         }
        }
class Hdfc extends Rbi{
    Hdfc()
    {
        System.out.println("This is Child2 Hdfc");
    }
}
class Simple {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.loan();
        Hdfc hd = new Hdfc();
        hd.loan();
    }
}

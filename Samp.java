class Rbi{
    void loan()
    {
        System.out.println("This is parent class");
    }
}
class Sbi extends Rbi{
    Sbi()
    {
        System.out.println("This is child class");
    }
}
class Samp
 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.loan();
    }
    
}

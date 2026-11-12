class Hdfc{
    void loan(){
        System.out.println("Grand parent Hdfc");
    }
}
class Sbi extends Hdfc{
    Sbi()
    {
        System.out.println("Parent sbi");
    }
}
class Rbi extends Sbi{
    Rbi()
    {
        System.out.println("Child RBI");
    }
}
class Simple1 {
    public static void main(String[] args) {
        Rbi r= new Rbi();
        r.loan();
        
    }
    
}

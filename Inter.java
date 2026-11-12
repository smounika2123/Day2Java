interface RBI{
    void amount();
}
class SBI implements RBI{
    public void amount(){
        System.out.println("Amount is Nill");
    }
}
class Inter {
    public static void main(String[] args)
    {
     SBI sb= new SBI();
     sb.amount();   
    }
}

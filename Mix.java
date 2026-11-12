abstract  class Animal{
    abstract void sound();
    abstract void behaviour();
    void color(){
        System.out.println("White");
    }
    }
class Dog extends Animal{
    Dog(){
        System.out.println("Dog");
    }
    void sound(){
        System.out.println("Bow Bow");
    }
    void behaviour(){
        System.out.println("Loyal");
    }
    void color()
    {
        System.out.println("black");
        super.color();
        
    }
}
class Mix {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.behaviour();
        d.color();
    }
    
}

class GrandParent{
    void name(){
        System.out.println("Grand parent");
    }
}
class Parent extends GrandParent{
    Parent()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child()
    {
        System.out.println("Child");
    }
}
class Multi {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
    
}

public class Dog extends Animal{
    private boolean walked;
    private boolean bark;
    public Dog(String name,String color, int age, boolean vaccinated,boolean walked,boolean bark){
        super(name, color, age, vaccinated);
        this.walked = walked;
        this.bark = bark;
    }
    public boolean hasBeenWalked(){
        return walked;
    }
    public void walk(){
        System.out.println("Time for a walk");
    }
    public boolean isBarking(){
        return walked;
    }
    public void bark(){
        System.out.println("I am barking");
    }
}

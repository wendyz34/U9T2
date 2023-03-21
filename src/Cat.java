public class Cat extends Animal {
    private boolean played;
    private boolean hide;

    public Cat(String name,String color, int age, boolean vaccinated, boolean played,boolean hide) {
        super(name, color,age, vaccinated);
        this.played = played;
        this.hide = hide;
    }
    public void play(){
        System.out.println("Time to play");
    }
    public boolean hasPlayedWith(){
        return played;
    }
    public void hide(){
        System.out.println("I am hiding");
    }
    public boolean isHiding(){
        return hide;
    }
}


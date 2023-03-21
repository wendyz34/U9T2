public class season {
    private int month;
    private boolean cold;
    public season(int month, boolean cold){
        this.month = month;
        this.cold= cold;
    }
    public int getMonth(){
        return month;
    }
    public void month(){
        System.out.println("It is " + month);
    }
    public boolean isCold(){
        return cold;
    }
    public void cold(){
        System.out.println("Is it cold?: " + cold);
    }
    public void scenery(){
        System.out.println("The view outside is pretty");
    }

}

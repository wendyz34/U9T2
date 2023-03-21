public class winter extends season {
    private boolean snow;
    public winter(int month, boolean isCold, boolean snow){
        super(month, isCold);
        this.snow = snow;
    }
    public boolean snow(){
        return snow;
    }
    public void getSnow(){
        System.out.println("It is snowing out");
    }
    public void hasHeater(){
        System.out.println("The heater is on");
    }
}

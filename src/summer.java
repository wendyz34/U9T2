public class summer extends season{
    private int degree;
    public summer(int month, boolean isCold, int degree){
        super(month, isCold);
        this.degree = degree;
    }
    public int getDegree(){
        return degree;
    }
    public void degree(){
        System.out.println("It is "+ degree + " outside");
    }
    public void hadAC(){
        System.out.println("The ac is on");
    }
}

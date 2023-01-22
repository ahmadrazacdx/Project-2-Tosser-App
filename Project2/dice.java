package Project2;
public class dice {
    public static void main(String[] args) {
        int dice;
        dice dc=new dice();
        dice = (int) (Math.random() * 2);
        if(dice==0) System.out.println("Head");
        if(dice==1)System.out.println("Tail");
    }
}

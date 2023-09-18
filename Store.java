import java.util.Scanner;

public class Store{
    public void buyphase()
    {
        int lemon = 0;
        int ice = 0;
        int cup = 0;
        int sugar = 0;
        double money = 100.00;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many lemons?");
        if(money - 0.29*lemon>0){
        lemon = lemon + scan.nextInt();
        money = String.format(money - 0.29*lemon);
        System.out.println("Lemon:"+lemon+" $:"+money);
        }

        System.out.println("How much ice?");
        ice = ice + scan.nextInt();
        money = money - 0.09*ice;
        System.out.println("Ice:"+ice+" $:"+money);

        System.out.println("How many cups?");
        cup = cup + scan.nextInt();
        money = money - 0.49*cup;
        System.out.println("Cups:"+cup+" $:"+money);

        System.out.println("How much sugar?");
        sugar = sugar + scan.nextInt();
        money = money - 0.19*sugar;
        System.out.println("Sugar:"+sugar+" $:"+money);
    }
}
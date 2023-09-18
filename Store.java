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
        System.out.print("How many lemons?");
        lemon = scan.nextInt();
        money = money - 0.19*lemon;
        System.out.println("Lemon:"+lemon+" $:"+money);
    }
}
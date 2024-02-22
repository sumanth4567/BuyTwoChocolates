import java.util.Arrays;
import java.util.*;
public class BuyTwoChocolate {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(money-(prices[0]+prices[1])>=0){
            return money-(prices[0]+prices[1]);
        }
        return money;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,money;
        BuyTwoChocolate btc=new BuyTwoChocolate();
        System.out.println("Enter the number of chocolate prices in array:");
        n=sc.nextInt();
        System.out.println("Enter the money you have:");
        money=sc.nextInt();
        int prices[]=new int[n];   
        System.out.println("Enter the prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        } 
        int x=btc.buyChoco(prices,money);
        if(x==money){
            System.out.println("We were not able to buy two chocolates without falling in debt");
        }
        else{
            System.out.println("The remaining money left after buying two chocolates is "+x);
        }
    }
}

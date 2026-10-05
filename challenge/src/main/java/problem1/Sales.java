package problem1;
import java.util.Scanner;
public class Sales
{

    public static void main(String[] args)
    {
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int salespeople = scan.nextInt();
        int[] sales = new int[salespeople];

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSale=sales[0];
        int maxId=0;
        int minSale=sales[0];
        int minId=0;

        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i]>maxSale){
                maxSale=sales[i];
                maxId=i;
            }
            if (sales[i]<minSale){
                minSale=sales[i];
                minId=i;
            }

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\n Average is: "+(double) sum/5);
        System.out.println("\n Salesperson "+(maxId+1)+" had the highest sale with $"+ maxSale);
        System.out.println("\n Salesperson "+(minId+1)+" had the lowest sale with $"+ minSale);

        System.out.print(" Enter a value: ");
        int value= scan.nextInt();
        int exceedCount=0;
        for (int i=0; i<sales.length; i++){
            if (sales[i]>value){
                System.out.println("\nSalesman "+(i+1)+" exceeded the value "+ value+" with the sale: "+sales[i]);
                exceedCount+=1;
            }
        }
        System.out.println(" The total number of salespeople whose sales exceeded the value is: "+exceedCount);

    }
}
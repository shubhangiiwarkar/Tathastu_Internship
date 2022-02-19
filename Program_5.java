//Write a java program to calculate permutation and combination of two numbers
/
import java.util.Scanner;
 
public class PermutationCombinationMain
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
public static void main(String args[]){
        int n, r;
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        r = scanner.nextInt();
 
        System.out.print("Permutation is  " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("Combination is " +(fact(n)/(fact(n-r))));
    }
}

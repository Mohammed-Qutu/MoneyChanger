/*
Mohammed Qutu 1/28/2024
This program will break change intp correct coins
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/
import java.util.Scanner;
public class MoneyChanger 
{
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner(System.in);
        
        System.out.println("Enter total cents: ");
        int answer = keyBoard.nextInt();
        
        int cents,centsLeft,dollars,quarters,dimes,nickels,pennies;
        
        cents=answer;
        
        dollars= cents/100;// gives a quotent o 3
        centsLeft=cents%100; //gets the remainder of 3.93 when divided to 93
        quarters=centsLeft/25;// gives a quotent of 3 and remainder 72
        centsLeft=centsLeft%25;// gets the remainder 18
        dimes=centsLeft/10;//leaves the quotent 1
        centsLeft=centsLeft%10;// gets the remainder 8
        nickels=centsLeft/5;//leaves the quotent 1
        centsLeft=centsLeft%5;//gets the remainder 3
        pennies=centsLeft;//remainder is left as it = pinnes which is 3
        
        //remainder calculator= number/quantitynumber = quotentnumber.number 
        //quotentnumber = quotent. remainder = .number * quantitynumber.
        
        System.out.println("Total Cents: " + cents
                        +   "\nDollars: " + dollars
                        +   "\nQuarters: " + quarters
                        +   "\nDimes: " + dimes
                        +   "\nNickels: " + nickels
                        +   "\nPennies: " + pennies);
    }
}

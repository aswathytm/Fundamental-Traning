import java.util.*;
public class Main{
    public static void main(String[]args){
        int multiplicationTable[]=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=in.nextInt();
        for(int i=0;i<10;i++){
            multiplicationTable[i]=number*(i+1);
        }
        for(int j=0;j<10;j++)
        {
            System.out.println(j+1 + " * " + number + " = " + multiplicationTable[j]);
        }
    }
}

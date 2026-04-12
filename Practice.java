import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputArr = scanner.nextInt();
        int a = inputArr/10000;
        inputArr= inputArr%10000;
        int b = inputArr/1000;
        inputArr = inputArr%1000;
        int c = inputArr/100;
        inputArr = inputArr%100;
        int d = inputArr/10;
        int e = inputArr%10;
        System.out.println(a +""+b+""+c+""+d +""+e );


    }
}

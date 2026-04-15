import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
       //정수 배열 arr이 주어졌다.
        // 배열에 들어있는 값 중 가장 큰 값을 구하는 알고리즘을 작성하시오.

        Scanner scanner = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int max = arr[0];
        for(int i = 1; i<arr.length;i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(max);



    }
}

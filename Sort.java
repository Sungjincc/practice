import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i <arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        shakerSortAsc(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void selectSortAsc(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j]) minIndex = j;
            }
            Swap(arr,minIndex,i);
        }
    }
    public static void insertSortAsc(int[] arr)
    {
      for(int i = 1; i<arr.length; i++)
      {
          int target = arr[i];
          int prev = i-1;
          while(prev >=0 && arr[prev] > target)
          {
              arr[prev+1] = arr[prev];
              prev--;
          }
          arr[prev+1] = target;
      }
    }
    public static void bubbleSortAsc(int[] arr)
    {
        boolean isEnd = false;
        int lastIndex = 1;
        while(isEnd ==false)
        {
            boolean loop = false;
            for(int i = 0 ;i<arr.length-lastIndex;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    Swap(arr,i,i+1);
                    loop = true;
                }
            }
            if(loop == false) isEnd = true;
            lastIndex++;
        }
    }
    public static void shakerSortAsc(int[] arr)
    {
        int left = 0;
        int right = arr.length -1;
        int lastIndex = left;
        while(left<right)
        {
            boolean loop = false;
            for(int i = left; i<right;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    Swap(arr,i,i+1);
                    loop = true;
                    lastIndex = i;
                }
            }
            if(loop == false) break;
            right = lastIndex;
            for(int i = right; i>left;i--)
            {
                if(arr[i]<arr[i-1])
                {
                    Swap(arr,i,i-1);
                    loop = true;
                    lastIndex = i;
                }
            }
            if(loop == false) break;
            left = lastIndex;
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }


        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println("Even numbers are:");
                System.out.println(num);
            }
     
        }

        sc.close();
    }
}

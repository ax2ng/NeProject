import java.util.Arrays;
import java.util.Scanner;
public class array51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массивов");

        int N = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Введите значение для массива: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Начало ввода во второй массив");
        for (int i = 0; i < N; i++) {
            System.out.println("Введите значение для массива: ");
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++){
            int temp_a = a[i];
            int temp_b = b[i];
            a[i] = temp_b;
            b[i] = temp_a;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

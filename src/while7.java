import java.util.Scanner;

public class while7 {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN_BACK = "\u001B[42m";
    public static final String ANSI_RED_BACK = "\u001B[41m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z;
        int v;
        System.out.println("Выберите цвет текста:\n1)Фиолетовый\n2)Синий");

        z = scanner.nextInt();
        System.out.println("Выберите цвет фона:\n1 )Зеленый \n2)Красный");
        v = scanner.nextInt();
        switch (z){
            case 1:
                System.out.println(ANSI_PURPLE);
                break;
            case 2:
                System.out.println(ANSI_BLUE);
                break;
        }
        switch (v){
            case 1:
                System.out.println(ANSI_GREEN_BACK);
                break;
            case 2:
                System.out.println(ANSI_RED_BACK);
                break;
        }
        System.out.println("Введите число: ");
        float N = scanner.nextInt();
        int K = 1;
        while (K*K<=N){
            K+=1;
        }
        System.out.println(ANSI_PURPLE + "Результат: " + K);
    }
}
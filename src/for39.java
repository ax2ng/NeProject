import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class for39 {

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


        int a,b;
        System.out.print("A: ");
        a = scanner.nextInt();
        System.out.print("B: ");
        b = scanner.nextInt();
        for (int i = a; i <= b; ++i){
            for (int i2 = 1; i2 <= i; ++i2)
                System.out.print(ANSI_PURPLE+ i + " ");
            System.out.println();
        }
    }
}
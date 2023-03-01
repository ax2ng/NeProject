package practice4;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sm = 0;
        System.out.println(" Для нового заказа нажмите 1");
        System.out.println(" Для выхода нажмите 0");
        int raz = scanner.nextInt();
        Shaurma shaurma1 = new Shaurma("Маленькая", "300г", 200);
        Shaurma shaurma2 = new Shaurma("Среняя", "200г", 100);
        Shaurma shaurma3 = new Shaurma("Большая", "100г", 50);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ArrayList<Shaurma> shaurmas = new ArrayList<>();
        Ingredient ing1 = new Ingredient("Помидоры", 20);
        Ingredient ing2 = new Ingredient("Сыр", 30);
        Ingredient ing3 = new Ingredient("Картошка", 80);
        Ingredient ing4 = new Ingredient("Капуста", 130);
        Ingredient ing5 = new Ingredient("Жаренный лук", 30);
        while (raz !=0) {
            shaurmas.clear();
            System.out.println("Выберете размер шаурмы:");
            System.out.println(" 1.Маленькая 100г 50 рублей");
            System.out.println(" 2.Средняя 200г 100 рублей");
            System.out.println(" 3.Большая 300г 200 рублей");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(" Вы выбрали маленькую шаурму, 300г, цена 200 рублей");
                    shaurmas.add(shaurma1);
                    sm += shaurma1.getBasePrise();
                    break;
                case 2:
                    System.out.println(" Вы выбрали среднюю шаурму, 200г, цена 100 рублей");
                    sm += shaurma2.getBasePrise();
                    shaurmas.add(shaurma2);
                    break;
                case 3:
                    System.out.println(" Вы выбрали маленькую шаурму, 100г, цена 50 рублей");
                    sm += shaurma3.getBasePrise();
                    shaurmas.add(shaurma3);
                    break;
                default: System.out.println("invalid size");
                System.exit(0);
            }
            System.out.println("Выберете дополнительные ингредиенты");
            System.out.println(" 1.Помидоры");
            System.out.println(" 2.Сыр");
            System.out.println(" 3.Картошка");
            System.out.println(" 4.Капуста");
            System.out.println(" 5.Лук");
            System.out.println(" 6.Выход");
            int b = scanner.nextInt();
            ingredients.clear();
            while (b != 6) {
                switch (b) {
                    case 1:
                        System.out.println("Вы выбрали ингридиент: помидоры, 20 рублей");
                        ingredients.add(ing1);
                        sm += ing1.getPrice();
                        break;
                    case 2:
                        System.out.println("Вы выбрали ингридиент: сыр, 30 рублей");
                        ingredients.add(ing2);
                        sm += ing2.getPrice();
                        break;
                    case 3:
                        System.out.println("Вы выбрали ингридиент: картошка, 80 рублей");
                        ingredients.add(ing3);
                        sm += ing3.getPrice();
                        break;
                    case 4:
                        System.out.println("Вы выбрали ингридиент: капуста, 130 рублей");
                        ingredients.add(ing4);
                        sm += ing4.getPrice();
                        break;
                    case 5:
                        System.out.println("Вы выбрали ингридиент: лук, 30 рублей");
                        ingredients.add(ing5);
                        sm += ing5.getPrice();
                        break;
                    default: System.out.println("invalid ingridient");
                        System.exit(0);
                }
                System.out.println("Выберете дополнительные ингредиенты: ");
                System.out.println(" 1.Помидоры");
                System.out.println(" 2.Сыр");
                System.out.println(" 3.Картошка");
                System.out.println(" 4.Капуста");
                System.out.println(" 5.Лук");
                System.out.println(" 6.Выход");
                b = scanner.nextInt();
            }
            System.out.println("Ваша шаурма:" );
            for (int i = 0; i<shaurmas.size();i++){
                System.out.println(shaurmas.get(i).getName()+ " " + shaurmas.get(i).getSize()+ " " + shaurmas.get(i).getBasePrise());
            }
            System.out.println("Ингридиенты:");
            for (int i = 0; i<ingredients.size(); i++)
            {
                System.out.println(ingredients.get(i).getName());
            }
            System.out.println("Для нового заказа нажмите 1");
            System.out.println("Для выхода нажмите 0");
            raz = scanner.nextInt();
        }
        System.out.println(" Сумма к оплате: " + sm);
    }
}



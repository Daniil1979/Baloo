import java.util.Scanner;

public class main {

    public static int calculateDuty(int prise, int weight){
        int result = prise / 100 + weight * 100;
        return result;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доброго времени суток!");
        System.out.print("Введите цену товара (в руб.):");
        int prise = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();
        int duty = calculateDuty(prise, weight);
        System.out.print("Размер пошлины (в руб.) составит:" + duty);

    }



}

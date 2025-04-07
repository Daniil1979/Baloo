public class Main {

    public static void main(String[] args) {


        BookProba martin = new BookProba("Чистый код", 2025, "Роберт Мартин", 464);
        BookProba lafore = new BookProba("Структура данных и алгоритмы Java", 2024, "Роберт Лафоре", 704);
        BookProba bolbot = new BookProba("Классы в языке программирования Java", 2020,"Болбот О.М.",75);

        System.out.println(martin);
        int martinPrice = martin.estimatePrice(martin.pages);
        System.out.println("Цена: " + martinPrice + " руб." + "\n" + "\n");



        System.out.println(lafore);
        int laforePrice = martin.estimatePrice(lafore.pages);
        System.out.println("Цена: " + laforePrice + " руб." + "\n" + "\n");

        System.out.println(bolbot);
        int bolbotPrise = bolbot.estimatePrice(bolbot.pages);
        System.out.println("Цена: " + bolbotPrise + " руб." + "\n" + "\n");


    }
}

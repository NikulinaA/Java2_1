public class Main {
    public static void main(String[] args) {

        int ticketPrice = 45125; // Цена билета
        int conversion = 20;      // Количество рублей для одной бонусной мили

        int bonusMile = ticketPrice / 20; // Вычисляем количество бонусных миль
        System.out.println("Цена билета: " + ticketPrice + " руб.");
        System.out.println("Вам начисленно " + bonusMile + " бонусных миль!!!"); // Выводим полученное количество миль
    }
}
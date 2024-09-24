public class Main {
    public static void main(String[] args) {

        int amountTicket = 2500;
        System.out.println("Стоимость билета " + amountTicket + " руб.");
        System.out.println("Здравствуйте." +
                " Рады предложить Вам нашу бонусную программу, по которой, за каждые 20 рублей стоимости билета" +
                " Вам будет начисляться 1 бонусная миля.");
        int amountOneMiles = 20;
        int bonusMiles = amountTicket / amountOneMiles;
        System.out.println("Сейчас у Вас: " + bonusMiles + " бонусных миль.");


    }
}
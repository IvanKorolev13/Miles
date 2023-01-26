public class EarnedMiles {
    public static void main(String[] args) {
        int amountTicket = 7500;                    // стоимость билета
        int pricePerMile = 20;                      // цена за одну милю
        int milesEarned = amountTicket / pricePerMile; // расчет заработанных милей

        System.out.println("Вам начислено " + milesEarned + " mile(s) за билет на сумму " + amountTicket + " руб.");
        System.out.println("PS: За каждые " + pricePerMile + " руб., потраченные на билет, начисляется 1 миля");
    }
}

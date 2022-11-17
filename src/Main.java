public class Main {
    public static void main(String[] args) {
        int ticketPrice = 41_340;
        int percentInKopecks = 20;

        int miles;
        if (ticketPrice < 0) {
            System.out.printf("Стоимость билета не может быть отрицательной");
        } else if (ticketPrice > 0) {
            miles = ticketPrice / percentInKopecks;
            System.out.printf("Количество миль за покупку билета: " + miles);
        }

    }
}

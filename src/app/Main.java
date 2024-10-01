public class Main {

    public static void main(String[] args) {

        String product1 = "smartphone";
        double pricePerUnit1 = 243.0682;
        int quantitySoldPerDay1 = 10;
        int days1 = 5;

        double totalSales1 = pricePerUnit1 * quantitySoldPerDay1 * days1;
        double dailySales1 = totalSales1 / days1;

        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product1, days1, totalSales1, dailySales1);

        String product2 = "laptop";
        double pricePerUnit2 = 149.812;
        int quantitySoldPerDay2 = 10;
        int days2 = 7;

        double totalSales2 = pricePerUnit2 * quantitySoldPerDay2 * days2;
        double dailySales2 = totalSales2 / days2;

        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product2, days2, totalSales2, dailySales2);

    }

}

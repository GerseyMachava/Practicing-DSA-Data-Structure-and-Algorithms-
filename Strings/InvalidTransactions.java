import java.util.ArrayList;
import java.util.List;

public class InvalidTransactions {

    public static List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] transac = new Transaction[n];
        boolean[] invalid = new boolean[n];

        // Parese all transactions
        for (int i = 0; i < n; i++) {
            String[] transactionParts = transactions[i].split(",");
            transac[i] = new Transaction(transactionParts[0], Integer.parseInt(transactionParts[1]),
                    Integer.parseInt(transactionParts[2]), transactionParts[3], transactions[i]);
        }
        for (int i = 0; i < n; i++) {
            if (transac[i].amount > 1000) {
                invalid[i] = true;
            }

            // Comprare with other transactions
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (transac[i].name.equals(transac[j].name) && !transac[i].city.equals(transac[j].city)
                        && Math.abs(transac[i].time) - Math.abs(transac[j].time) <= 60) {
                    invalid[i] = true;
                    break;
                }
            }

        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (invalid[i]) {
                result.add(transac[i].original);
            }
        }
        return result;

    }

    public static class Transaction {
        String name;
        int time;
        int amount;
        String city;
        String original;

        public Transaction(String name, int time, int amount, String city, String original) {
            this.name = name;
            this.time = time;
            this.amount = amount;
            this.city = city;
            this.original = original;
        }
    }
}

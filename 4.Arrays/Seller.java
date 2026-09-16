public class Seller {
    private String sellerName;
    private double amount;

    public Seller(String sellerName, double amount) {
        this.sellerName = sellerName;
        this.amount = amount;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static Seller findBestSeller(Seller[] sellers) {
        if (sellers == null || sellers.length == 0) {
            throw new IllegalArgumentException("Sellers array must not be empty");

        }
        double highestAmount = sellers[0].amount;
        Seller bestSeller = sellers[0];
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i].amount > highestAmount) {
                highestAmount = sellers[i].amount;
                bestSeller = sellers[i];
            }
        }
        return bestSeller;
    }

}

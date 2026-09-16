public class main {

    public static void main(String[] args) {

        Seller[] sellers = {
                new Seller("Barry Allen", 18196),
                new Seller("Logan", 4255.0),
                new Seller("Maria", 10298.0),
                new Seller("Ana", 26485.0),
                new Seller("Aurora", 19982.0),
                new Seller("Noah", 15820.0),
        };
        Seller bestSeller = Seller.findBestSeller(sellers);
        System.out.println("Seller Name: " + bestSeller.getSellerName());
        System.out.println("Seller Amount: " + bestSeller.getAmount());

    }
}

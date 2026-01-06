import java.util.*;

public class Portfolio {
    private List<String> stocks = new ArrayList<>();

    public Portfolio() {
        stocks.add("AAPL");
        stocks.add("GOOG");
        stocks.add("AMAZ");
        stocks.add("MSFT");
    }

    public void printValues(Stockexchange exchange) {
        for (String s : stocks) {
            double price = exchange.getPrice(s);
            System.out.println(s + ": " + price);
        }
    }
}

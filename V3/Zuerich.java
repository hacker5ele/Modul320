

public class Zuerich implements Stockexchange {
    @Override
    public double getPrice(String symbol) {
        switch (symbol) {
            case "MSFT": return 100;
            case "GOOG": return 200;
            case "AAPL": return 300;
            case "AMAZ": return 400;
        }
        return 0;
    }
}

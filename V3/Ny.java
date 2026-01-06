public class Ny implements Stockexchange{
    @Override
    public double getPrice(String symbol) {
        switch (symbol) {
            case "MSFT": return 350;
            case "GOOG": return 500;
            case "AAPL": return 200;
            case "AMAZ": return 100;
        }
        return 0;
    }
}

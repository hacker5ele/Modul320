public class London implements Stockexchange{
    @Override
public double getPrice(String symbol) {
    switch (symbol) {
        case "MSFT": return 200;
        case "GOOG": return 150;
        case "AAPL": return 400;
        case "AMAZ": return 190;
    }
    return 0;
}
}

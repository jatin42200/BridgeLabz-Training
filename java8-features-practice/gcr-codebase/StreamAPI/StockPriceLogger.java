import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {
		List<Double> stockPrices = Arrays.asList(120.50, 121.30, 119.80, 122.10);

	    stockPrices.forEach(price -> System.out.println("Stock Price: " + price));

	}

}

package stock.com.stockwatcher.modelobjects;

/**
 * Created by vraman on 10/13/16.
 */

public class StockObject {

    private int stockId;
    private String stockCode;
    private String stockName;
    private String currentPriceValue;
    private double percentageChange;
    private double valueChange;

    public StockObject(int stockId, String stockCode, String stockName, String currentPriceValue, double percentageChange, double valueChange) {
        this.stockId = stockId;
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.currentPriceValue = currentPriceValue;
        this.percentageChange = percentageChange;
        this.valueChange = valueChange;
    }

    public int getStockId() {
        return stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public String getCurrentPriceValue() {
        return currentPriceValue;
    }

    public double getPercentageChange() {
        return percentageChange;
    }

    public double getValueChange() {
        return valueChange;
    }
}

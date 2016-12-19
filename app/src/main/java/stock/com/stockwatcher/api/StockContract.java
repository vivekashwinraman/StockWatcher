package stock.com.stockwatcher.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vraman on 12/16/16.
 */

public class StockContract {

    @SerializedName("Status")
    public String status;

    @SerializedName("Name")
    public String name;

    @SerializedName("Symbol")
    public String symbol;

    @SerializedName("LastPrice")
    public double lastPrice;

    @SerializedName("Timestamp")
    public String timeStamp;

    @SerializedName("MarketCap")
    public long marketCap;

    @SerializedName("High")
    public double high;

    @SerializedName("Low")
    public double low;

    @SerializedName("Open")
    public double open;
}

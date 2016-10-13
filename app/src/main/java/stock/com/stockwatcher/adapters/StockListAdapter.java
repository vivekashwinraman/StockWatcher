package stock.com.stockwatcher.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import stock.com.stockwatcher.R;
import stock.com.stockwatcher.modelobjects.StockObject;

/**
 * Created by vraman on 10/13/16.
 */

public class StockListAdapter extends RecyclerView.Adapter<StockListAdapter.ViewHolder> {

    private Context context;
    private List<StockObject> stockObjects;

    public StockListAdapter(Context context, List<StockObject> stockObjects) {
        this.context = context;
        this.stockObjects = stockObjects;
    }

    @Override
    public StockListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_row, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        StockObject stockObject = stockObjects.get(position);
        if (stockObject != null) {
            viewHolder.stockCode.setText(stockObject.getStockCode());
            viewHolder.stockName.setText(stockObject.getStockName());
            viewHolder.stockValue.setText(stockObject.getCurrentPriceValue());

        }
    }

    @Override
    public int getItemCount() {
        return this.stockObjects.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView stockCode;
        public TextView stockName;
        public TextView stockValue;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            stockCode = (TextView)itemLayoutView.findViewById(R.id.stockCode);
            stockName = (TextView) itemLayoutView.findViewById(R.id.stockName);
            stockValue = (TextView)itemLayoutView.findViewById(R.id.stockValue);

        }
    }
}

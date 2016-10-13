package stock.com.stockwatcher.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import stock.com.stockwatcher.R;
import stock.com.stockwatcher.adapters.StockListAdapter;
import stock.com.stockwatcher.modelobjects.StockObject;

/**
 * Created by vraman on 9/29/16.
 */


/**
 * A placeholder fragment containing a simple view.
 */
public class StockListFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private RecyclerView stockListRecyclerView;
    private LinearLayoutManager layoutManager;
    private List<StockObject> stockList;
    private StockListAdapter stockListAdapter;

    public StockListFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static StockListFragment newInstance(int sectionNumber) {
        StockListFragment fragment = new StockListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_stocklist, container, false);

        stockListRecyclerView = (RecyclerView) rootView.findViewById(R.id.stockListRecyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        stockListRecyclerView.setLayoutManager(layoutManager);
        stockListRecyclerView.setItemAnimator(new DefaultItemAnimator());

        int scrollPosition =0;

        if(stockListRecyclerView.getLayoutManager() !=null){
            scrollPosition = layoutManager.findFirstVisibleItemPosition();
        }
        stockListRecyclerView.scrollToPosition(scrollPosition);
        this.stockList = new ArrayList<StockObject>();
        stockList.add(new StockObject(0,"test","test","1.1",0.1,1.0));
        stockList.add(new StockObject(1,"test1","test1","1.1",0.1,1.0));
        stockListAdapter = new StockListAdapter(getActivity(),stockList);
        stockListRecyclerView.setAdapter(stockListAdapter);

        return rootView;
    }
}
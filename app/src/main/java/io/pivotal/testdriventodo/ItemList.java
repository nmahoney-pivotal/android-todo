package io.pivotal.testdriventodo;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by pivotal on 10/16/15.
 */
public class ItemList {

    private List<String> list;
    private ArrayAdapter<String> adapter;
    private ListView listView;

    public ItemList(List<String> list, ArrayAdapter<String> adapter, ListView listView) {
        this.list = list;
        this.adapter = adapter;
        this.listView = listView;
        this.listView.setAdapter(adapter);
        addDummyItems();
    }

    private void addDummyItems() {
        list.add("dummy 1");
        list.add("dummy 2");
        adapter.notifyDataSetChanged();
    }
}

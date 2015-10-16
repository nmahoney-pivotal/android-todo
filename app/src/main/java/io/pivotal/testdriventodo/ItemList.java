package io.pivotal.testdriventodo;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by pivotal on 10/16/15.
 */
public class ItemList {

    private List<Item> list;
    private ArrayAdapter<Item> adapter;
    private ListView listView;

    public ItemList(List<Item> list, ArrayAdapter<Item> adapter, ListView listView) {
        this.list = list;
        this.adapter = adapter;
        this.listView = listView;
        this.listView.setAdapter(adapter);
        addDummyItems();
    }

    public void createNewItem() {
        this.list.add(new Item("", true));
    }

    private void addDummyItems() {
        list.add(new Item("dummy 1", false));
        list.add(new Item("dummy 2", false));
        adapter.notifyDataSetChanged();
    }
}

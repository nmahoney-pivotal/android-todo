package io.pivotal.testdriventodo;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pivotal on 10/16/15.
 */
public class ItemListTest {
    @Test
    public void testConstructor() {
        List<String> listMock = mock(List.class);
        ArrayAdapter<String> adapterMock = mock(ArrayAdapter.class);
        ListView listViewMock = mock(ListView.class);

        ItemList itemList = new ItemList(listMock, adapterMock, listViewMock);

        assertThat(itemList, is(instanceOf(ItemList.class)));
    }
}
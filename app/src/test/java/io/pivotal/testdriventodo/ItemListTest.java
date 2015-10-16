package io.pivotal.testdriventodo;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pivotal on 10/16/15.
 */
public class ItemListTest {
    
    private ItemList itemList;
    private List<Item> listMock;
    private ArrayAdapter<Item> adapterMock;
    private ListView listViewMock;

    @Before
    public void setUp() {
        listMock = mock(List.class);
        adapterMock = mock(ArrayAdapter.class);
        listViewMock = mock(ListView.class);

        itemList = new ItemList(listMock, adapterMock, listViewMock);
    }
    
    @Test
    public void testConstructor() {
        assertThat(itemList, is(instanceOf(ItemList.class)));
    }

    @Test
    public void testCreateNewItem() {
        ArgumentCaptor<Item> captor = ArgumentCaptor.forClass(Item.class);

        itemList.createNewItem();

        verify(listMock, atLeastOnce()).add(captor.capture());
        assertThat(captor.getValue().getContent(), is(equalTo("")));
        assertThat(captor.getValue().isEditable(), is(true));
    }
}
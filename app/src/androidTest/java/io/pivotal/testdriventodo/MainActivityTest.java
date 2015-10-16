package io.pivotal.testdriventodo;

import android.support.design.widget.FloatingActionButton;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.text.method.Touch;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pivotal on 10/14/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;
    private ListView mListView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mMainActivity = getActivity();
        mListView =
                (ListView) mMainActivity
                        .findViewById(R.id.todo_list_id);
    }

    public void testPreconditions() {
        assertNotNull("mMainActivity is null", mMainActivity);
        assertNotNull("mListView is null", mListView);
    }

    public void testDummyItems() {
        TextView firstChild = (TextView) ((LinearLayout) mListView.getChildAt(0)).getChildAt(0);
        TextView secondChild = (TextView) ((LinearLayout) mListView.getChildAt(1)).getChildAt(0);

        assertEquals("dummy 1", firstChild.getText().toString());
        assertEquals("dummy 2", secondChild.getText().toString());
        assertNull(mListView.getChildAt(2));
    }

    public void testNewItem() {
        FloatingActionButton fab = (FloatingActionButton) mMainActivity.findViewById(R.id.fab);
        TouchUtils.clickView(this, fab);
        LinearLayout newItem = (LinearLayout) mListView.getChildAt(3);

        assertThat(
                ((EditText) newItem.getChildAt(0)).getText().toString(),
                is(equalTo(""))
        );
    }
}

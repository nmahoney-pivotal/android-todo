package io.pivotal.testdriventodo;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import android.widget.TextView;

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
        TextView firstChild = (TextView) mListView.getChildAt(0);
        TextView secondChild = (TextView) mListView.getChildAt(1);
        assertEquals("dummy 1", firstChild.getText().toString());
        assertEquals("dummy 2", secondChild.getText().toString());
        assertNull(mListView.getChildAt(2));
    }
}

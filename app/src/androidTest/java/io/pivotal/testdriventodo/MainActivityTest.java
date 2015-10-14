package io.pivotal.testdriventodo;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

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
}

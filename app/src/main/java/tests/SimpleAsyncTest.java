package tests;

import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

public class SimpleAsyncTest extends AndroidTestCase {
    private static final String LOG_TAG = "NonEmptyStringTest";

    public void test() {
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}

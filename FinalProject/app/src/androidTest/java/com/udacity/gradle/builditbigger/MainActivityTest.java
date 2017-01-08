package com.udacity.gradle.builditbigger;

import android.util.Log;

import org.junit.Assert;
import org.junit.Test;

public class MainActivityTest {

    @Test
    public void onResume() throws Exception {

        EndpointsAsyncTask manfred=new EndpointsAsyncTask();
        manfred.setListner(new EndpointsAsyncTask.onPostExecuteCompleteListener() {
            @Override
            public void onPostExecuteComplete(String joke) {

                Assert.assertNotEquals("",joke);
                Log.d("logsdet", "onPostExecuteComplete: ");


            }
        });
        manfred.execute();
    }


}
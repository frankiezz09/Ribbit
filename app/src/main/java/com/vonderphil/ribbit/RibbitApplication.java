package com.vonderphil.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Administrator on 6/12/2015.
 */

//Application is the super level for all activities. See Android Manifest.
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "7CqUxGvMyOZChrQkDxyxCtev6iHuBDyx8aQBPKqy", "IjxU6tGOhldbhnarfCFhQ00MBIVmRWCW8n6PDR6d");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }

}

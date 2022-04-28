package com.nightlyexamples.fragmentexample

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Main :AppCompatActivity(){
    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Log.i(TAG,"onCreate")

        setContentView(R.layout.main_activity)

    }
}



/**
 *
 * This is a continuation of  the previous example activity
 * Purpose - Display a textView from a Fragment.
 * Notations will not include what was previously covered in example activity
 *
 *  Gradle Imports -
 *
 *
 *  Step 1 -  Create a Main activity.
 *                  Extend AppCompatActivity
 *                  (Optional) Create a companion object for log tags
 *                  Override onCreate
 *
 *  Step 2 -    Create a new xml layout file
 *                  in the root element drop down type 'fragment'
 *                  select "androidx.fragment.app.FragmentContainerView"
 *                  name the file main_activity
 *                  Set content view
 *                          setContentView(R.layout.main_activity)

 *  Step 3 - Create a new Kotlin class to control the UI of the newly created fragment
 *                  New > Kotlin class > We mame ours "FragmentExampleController".
 *                  You can name the kotlin class what ever you like, however,  it is suggested to name the files according to their purpose.
 *
 *  Note -  Main activity will contain very little code.
 *              Since we are using a fragment, the main activity is just a holder for the fragment that will be displayed.
 *              FragmentExampleController will host UI controls (button listener logic)
 *
 *
 *
 * */
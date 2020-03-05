package com.techhue.android
import android.app.Activity
import android.os.Bundle
class MyActivity:Activity() {
    /**
     * Called when the activity is first created.
     */
    override fun onCreate(savedInstanceState:Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reslayout)
    }
}
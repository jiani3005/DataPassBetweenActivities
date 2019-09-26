package com.mykotlinapplication.kotlin20.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mykotlinapplication.kotlin20.R
import com.mykotlinapplication.kotlin20.User
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var bundle = intent.getBundleExtra("bundle")
        var user = bundle.getParcelable<User>("parcel")

        textView_welcome.setText("Welcome, ${user?.username}!")
    }
}

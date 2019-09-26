package com.mykotlinapplication.kotlin20.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mykotlinapplication.kotlin20.R
import com.mykotlinapplication.kotlin20.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_login.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            var bundle = Bundle()
            val parcel = User("admin", "admin")

            bundle.putParcelable("parcel", parcel)
            intent.putExtra("bundle", bundle)

            startActivity(intent)
        })
    }
}

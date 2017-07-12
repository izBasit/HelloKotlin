package me.iz.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    tvHello.text = getString(R.string.hey_kotlin)


    button.setOnClickListener {

      val email = etEmail.text
      Toast.makeText(this, "Email is $email", Toast.LENGTH_SHORT).show()
//      toast("Button clicked")
    }

  }
}

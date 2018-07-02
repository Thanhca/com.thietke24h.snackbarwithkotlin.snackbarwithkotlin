package com.thietke24h.snackbarwithkotlin.snackbarwithkotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var snackbar: Snackbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    /* todo 7/2/18 :  call fun onlick in layout android:onClick="onClick" */
    override fun onClick(v: View?) {
        if (v != null) {

            if (v.id == R.id.btn_simpleSnackbar) {

                Snackbar.make(coordinatorLayout, "welcome thietke24h.com  ", Snackbar.LENGTH_LONG).show()

            } else if (v.id == R.id.btn_snackbar_action) {

                Snackbar.make(coordinatorLayout, "Try again..!!", Snackbar.LENGTH_LONG)
                        .setAction("Retry") {
                            val snackbar1 = Snackbar.make(coordinatorLayout, "Message is restored!", Snackbar.LENGTH_SHORT)
                            snackbar1.show()
                        }.show()


            } else if (v.id == R.id.btn_snackbar_custom) {

                snackbar = Snackbar.make(coordinatorLayout, "Try again..!!", Snackbar.LENGTH_LONG)
                val snackbarLayout = snackbar.view
                val textView = snackbarLayout.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_launcher_background, 0)
                textView.compoundDrawablePadding = 5
                textView.setTextColor(Color.BLUE)

                textView.setOnClickListener {
                    val snackbar1 = Snackbar.make(coordinatorLayout, "Message is restored!", Snackbar.LENGTH_SHORT)
                    snackbar1.show()
                }

                snackbar.setActionTextColor(Color.GREEN)
                snackbar.show()

            } else if (v.id == R.id.btn_snackbar_custom_color) {

                snackbar = Snackbar.make(coordinatorLayout, "No internet connection!", Snackbar.LENGTH_LONG)
                        .setAction("RETRY") { }
                snackbar.setActionTextColor(Color.GREEN)

                val sbView = snackbar.view
                val textView = sbView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
                textView.setTextColor(Color.RED)

                snackbar.show()
            }
        }

    }


}

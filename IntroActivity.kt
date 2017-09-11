package test.kotlintest

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class IntroActivity : AppCompatActivity(), View.OnClickListener {


    val name: String
    val age: Int



    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var mTextMessage: TextView? = null
    private var navigation: BottomNavigationView? = null


//    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        override fun onNavigationItemSelected(item: MenuItem): Boolean {
//            when (item.itemId) {
//                R.id.navigation_home -> {
//                    mTextMessage!!.setText(R.string.title_home)
//                    return true
//                }
//                R.id.navigation_dashboard -> {
//                    mTextMessage!!.setText(R.string.title_dashboard)
//                    return true
//                }
//                R.id.navigation_notifications -> {
//                    mTextMessage!!.setText(R.string.title_notifications)
//                    return true
//                }
//            }
//            return false
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        mTextMessage = findViewById(R.id.message) as TextView
        navigation = findViewById(R.id.navigation) as BottomNavigationView

//        val navigation = findViewById(R.id.navigation) as BottomNavigationView
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

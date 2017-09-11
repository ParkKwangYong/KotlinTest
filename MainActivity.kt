package test.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var userName: String = "park"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setName("jung")
        Log.d("TAG", "kypark >>  getName() = " + getName());
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun getName() : String {
        return userName
    }

    fun setName(name: String) {
        this.userName = name
    }

    fun myFunc(arg:(Int, Int) -> Int) {

    }

    inner class InnerCls {

    }
}

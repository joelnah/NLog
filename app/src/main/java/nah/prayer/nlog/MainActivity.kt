package nah.prayer.nlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import nah.prayer.nloglib.Nlog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nlog.d("This is Log test.")
    }
}

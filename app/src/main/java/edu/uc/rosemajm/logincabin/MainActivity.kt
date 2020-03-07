package edu.uc.rosemajm.logincabin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import edu.uc.rosemajm.logincabin.ui.main.MainFragment
import kotlinx.android.synthetic.main.main_activity.view.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        // Create fragment transaction to open account page
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager ().beginTransaction()
//        fragmentTransaction.add(R.id.account_activity, new MainFragment)

//    override fun onPause() {
//        super.onPause()
//    }
//
//    override fun onResume() {
//        super.onResume()
//    }
//
//    override fun onStop() {
//        super.onStop()
//
//        // save any data in progress
//
//        // make any updates
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//    }
//
//    override fun onStart() {
//        super.onStart()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }


    }
}

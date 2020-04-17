package edu.uc.rosemajm.logincabin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import edu.uc.rosemajm.logincabin.ui.main.MainFragment
import edu.uc.rosemajm.logincabin.ui.main.MainViewModel



class MainActivity : AppCompatActivity() {

    private lateinit var accountFragment: AccountFragment
    private lateinit var mainFragment: MainFragment
    private lateinit var activeFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        accountFragment = AccountFragment.newInstance()
        mainFragment = MainFragment.newInstance()
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, mainFragment)
                .commitNow()
            activeFragment = mainFragment
        }

    }

   public fun mainScreen() {
        if (activeFragment == accountFragment) {
            supportFragmentManager.beginTransaction().replace(R.id.container, mainFragment)
                .commitNow()
            activeFragment = mainFragment
        }
    }

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

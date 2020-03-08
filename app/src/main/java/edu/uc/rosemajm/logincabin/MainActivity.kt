package edu.uc.rosemajm.logincabin

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import edu.uc.rosemajm.logincabin.ui.main.MainFragment

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean { // Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.addAccount) { //Corrected the spelling for account here from the layout
            true
        } else super.onOptionsItemSelected(item)
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

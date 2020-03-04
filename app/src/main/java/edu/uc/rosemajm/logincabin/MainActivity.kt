package edu.uc.rosemajm.logincabin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import edu.uc.rosemajm.logincabin.ui.main.AccountSignUp
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

            //add reference to btn
            val  addAccount_btn = findViewById (R.id.addAccount_btn) as Button
            // add onclicklistener to button
            addAccount_btn.setOnClickListener{
                openActivity2()
                Toast.makeText(this@MainActivity, "which account will we add", Toast.LENGTH_SHORT).show()


            }


        }

     fun openActivity2() {
        val intent = Intent(this, AccountSignUp::class.java)
        startActivity(intent);
    }



    }


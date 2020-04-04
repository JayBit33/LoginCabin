package edu.uc.rosemajm.logincabin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.rosemajm.logincabin.dto.Account

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_activity)
    }

    private fun saveAccount(){
        var account = Account().apply {
            //  username = lblUsername.text.toString()
            //  password = lblPassword.text.toString()

            //waiting for the fragment to get created with the proper labels
        }
    }
}

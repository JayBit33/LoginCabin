package edu.uc.rosemajm.logincabin

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.core.view.marginTop
import edu.uc.rosemajm.logincabin.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    lateinit var textBox : TextView
    lateinit var saveBtn : Button
    lateinit var kotlinCbx : CheckBox
    lateinit var javaCbx : CheckBox
    lateinit var radioGroup : RadioGroup
    lateinit var maleRadioBtn : RadioButton
    lateinit var femaleRadioBtn : RadioButton
    lateinit var viewBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // Working with TextBox
        textBox = findViewById(R.id.textView)
        textBox.text = "Jay is here. When there is a lot of text on the screen you must set the following"
        textBox.setSingleLine()
        textBox.ellipsize = TextUtils.TruncateAt.MARQUEE
        textBox.marqueeRepeatLimit = -1
        textBox.isSelected = true

        // Working With Buttons
        saveBtn = findViewById(R.id.saveBtn) as Button

        saveBtn.setOnClickListener {
            saveBtn.text = "Saved Now"
        }

        saveBtn.setOnLongClickListener {
            saveBtn.text = "Android Button Long click"
            true
        }

        // Radio Buttons
        radioGroup = findViewById(R.id.radio) as RadioGroup
        maleRadioBtn = findViewById(R.id.radio_male) as RadioButton
        femaleRadioBtn = findViewById(R.id.radio_female) as RadioButton


        // CheckBox
        kotlinCbx = findViewById(R.id.kotlinCbx) as CheckBox
        javaCbx = findViewById(R.id.javaCbx) as CheckBox

        viewBtn = findViewById(R.id.viewBtn) as Button
        viewBtn.setOnClickListener {
            var result = " "
            if(radioGroup.checkedRadioButtonId != -1) {
                result += "Selected gender : "
                if (maleRadioBtn.isChecked)
                    result += "male\n"
                else if (femaleRadioBtn.isChecked)
                    result += "female\n"
            }

            result += "Programming Language: "

            if (kotlinCbx.isChecked)
                result += "Kotlin "
            if(javaCbx.isChecked)
                result += "Java "

            textBox.setSingleLine(false)

//          set margin for texbox programmatically.
//          val params = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
//          params.setMargins(20,350,0,0)
//          textBox.layoutParams = params

            textBox.setPaddingRelative(0,50,0,0)
            textBox.text = result
        }


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}

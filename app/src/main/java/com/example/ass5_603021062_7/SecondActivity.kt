package com.example.ass5_603021062_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ass5_603021062_7.Employee
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameText.text = "Employee Name : ${newEmployee?.name}"
        genderText.text = "Gender: ${newEmployee?.gender}"
        emailText.text= "Email: ${newEmployee?.email}"
        salaryText.text= "Salary: ${newEmployee?.salary} Bath"

    }

    fun onClickClose(view: View) {
        finish()
    }
}

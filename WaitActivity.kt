package com.example.theoriginal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.theoriginal.models.Task
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.content.Intent

class WaitActivity : AppCompatActivity() {
    private lateinit var submit2: Button
    private lateinit var editText: EditText
    val database1 = Firebase.database("https://theoriginial-copy.asia-southeast1.firebasedatabase.app/").reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wait)

        submit2 = findViewById(R.id.submit2)
        editText = findViewById(R.id.editTextText2)

        submit2.setOnClickListener {
            if(editText.text!=null){
                val entiretask = editText.text.toString()
                val task = "Task"
                Task(entiretask)
                database1.child("users").child(task).push().setValue("dummy")
            }
            else{
                Toast.makeText(this, "Failed to submit please try again",Toast.LENGTH_SHORT).show()
            }
            val r = Intent(this@WaitActivity, DoneActivity::class.java)
            startActivity(r)
        }
    }
}

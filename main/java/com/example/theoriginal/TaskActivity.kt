package com.example.theoriginal

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.theoriginal.databinding.ActivityTaskBinding
import com.example.theoriginal.models.Task
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class TaskActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityTaskBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        mainBinding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        database = Firebase.database("https://theoriginial-copy.asia-southeast1.firebasedatabase.app/").reference
        mainBinding.submit.setOnClickListener {
            if(mainBinding.editTextText.text!=null){
                val entiretask = mainBinding.editTextText.text.toString()
                val task = "Task"
                Task(entiretask)
                database.child("users").child(task).push().setValue(entiretask)
                val entent = Intent(this@TaskActivity, WaitActivity::class.java)
                startActivity(entent)
            }
            else{
                Toast.makeText(this, "Failed to submit please try again",Toast.LENGTH_SHORT).show()
            }
    }


    }
}



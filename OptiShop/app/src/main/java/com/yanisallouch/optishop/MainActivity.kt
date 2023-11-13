package com.yanisallouch.optishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views
        val welcomeMessageTextView = findViewById<TextView>(R.id.welcomeMessageTextView)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val signUpButton = findViewById<Button>(R.id.signUpButton)
        val skipButton = findViewById<Button>(R.id.skipButton)

        // Set click listeners
        signInButton.setOnClickListener { navigateToSignIn() }
        signUpButton.setOnClickListener { navigateToSignUp() }
        skipButton.setOnClickListener { navigateToSetupProfile() }

        // Set Lorem Ipsum text to the welcome message
        val loremIpsum = getString(R.string.lorem_ipsum)
        val welcomeMessageTemplate = getString(R.string.welcome_message)
        val welcomeMessage = String.format(welcomeMessageTemplate, loremIpsum)
        welcomeMessageTextView.text = welcomeMessage
    }

    private fun navigateToSignIn() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSignUp() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSetupProfile() {
        val intent = Intent(this, SetupProfileActivity::class.java)
        startActivity(intent)
    }
}
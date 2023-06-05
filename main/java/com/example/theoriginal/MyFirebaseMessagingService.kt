package com.example.theoriginal

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Check if the message contains a data payload
        remoteMessage.data.isNotEmpty().let {
            // Handle the data payload
            val data = remoteMessage.data
            // Extract the necessary information from the data payload
            val requestId = data["requestId"]
            val requestType = data["requestType"]
            // Handle the request based on the request type
            if (requestType == "accept") {
                // Handle the accepted request
                handleAcceptedRequest(requestId)
            } else if (requestType == "decline") {
                // Handle the declined request
                handleDeclinedRequest(requestId)
            }
        }

        // Check if the message contains a notification payload
        remoteMessage.notification?.let {
            // Handle the notification payload
            val title = it.title
            val body = it.body
            // Display the notification to the user or handle it as needed
            showNotification(title, body)
        }
    }

    private fun handleAcceptedRequest(requestId: String?) {
        // Handle the logic for an accepted request
        // This can include updating the UI, performing actions, etc.
        if (requestId != null) {
            // Perform necessary operations with the accepted request
            // For example, update the status of the request in the database
        }
    }

    private fun handleDeclinedRequest(requestId: String?) {
        // Handle the logic for a declined request
        // This can include updating the UI, performing actions, etc.
        if (requestId != null) {
            // Perform necessary operations with the declined request
            // For example, notify the user that the request has been declined
        }
    }

    private fun showNotification(title: String?, body: String?) {
        // Implement your own notification display logic
        // This can be done using system notifications, custom UI, or other methods
        // Show the title and body of the notification to the user
    }
}

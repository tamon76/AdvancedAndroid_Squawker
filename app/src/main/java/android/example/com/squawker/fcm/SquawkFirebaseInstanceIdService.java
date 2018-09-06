package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

// Completed (1) Make a new package for your FCM service classes called "fcm"
// Completed (2) Create a new Service class that extends FirebaseInstanceIdService.
// You'll need to implement the onTokenRefresh method. Simply have it print out
// the new token.

public class SquawkFirebaseInstanceIdService extends FirebaseMessagingService {

    public static final String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onNewToken(String token) {
        Log.d(LOG_TAG, "Token: " + token);
    }
}

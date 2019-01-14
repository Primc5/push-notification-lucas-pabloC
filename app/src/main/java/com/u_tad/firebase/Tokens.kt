package com.u_tad.firebase

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService

// creamos una clase que extiende de FirebaseMessagingServicie (ya que instance esta depracated) en donde creamos y refrescamos el token

class Tokens: FirebaseMessagingService() {
    override fun onNewToken(p0: String?) {
        super.onNewToken(p0)
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Refreshed token: " + refreshedToken!!)
    }


}
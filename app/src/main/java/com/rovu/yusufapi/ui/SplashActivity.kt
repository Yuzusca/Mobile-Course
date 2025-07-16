package com.rovu.yusufapi.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//ganti package dibawah dengan package kalian
import com.rovu.yusufapi.MainActivity
import com.rovu.yusufapi.data.local.SessionManager
import com.rovu.yusufapi.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sessionManager = SessionManager(this)

        // Fungsi untuk Token Checking
        if (sessionManager.fetchAuthToken() != null) {
            // Jika ada Token maka akan langsung ke MainActivity
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            // Jika tidak ada maka akan masuk ke LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }
        // Menutup SplashActivity
        finish()
    }
}

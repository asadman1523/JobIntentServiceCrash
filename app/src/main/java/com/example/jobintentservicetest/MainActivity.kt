package com.example.jobintentservicetest

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.jobintentservicetest.TestAlarmReceiver.Companion.START_TEST_SERVICE_REQUEST_CODE
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartServiceBtn.setOnClickListener { view ->
            createAlarm(view.context)
        }
    }

    private fun createAlarm(context: Context) {
        val minuteMillis = TimeUnit.MINUTES.toMillis(1)
        val alarmManager: AlarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            SystemClock.elapsedRealtime() + minuteMillis,
            minuteMillis,
            Intent(context, TestAlarmReceiver::class.java).let { intent ->
                PendingIntent.getBroadcast(
                    context,
                    START_TEST_SERVICE_REQUEST_CODE,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
                )
            }
        )
    }
}

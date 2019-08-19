package com.example.jobintentservicetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import kotlin.random.Random

class TestAlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            TestJobService.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
        }
    }

    companion object {
        const val START_TEST_SERVICE_REQUEST_CODE = 1010
    }
}
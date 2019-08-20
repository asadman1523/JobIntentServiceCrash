package com.example.jobintentservicetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.jobintentservicetest.testjobs.*
import kotlin.random.Random

class TestAlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            TestJobService.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService2.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService3.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService4.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService5.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService6.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService7.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService8.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )
            TestJobService9.startTestService(
                context,
                TestDataClass("changos", Random.nextInt(10000))
            )

        }
    }

    companion object {
        const val START_TEST_SERVICE_REQUEST_CODE = 1010
    }
}
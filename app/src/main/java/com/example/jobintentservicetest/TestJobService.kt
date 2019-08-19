package com.example.jobintentservicetest

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class TestJobService : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        val dataClass = intent.takeIf { intent.hasExtra(TEST_DATA) }?.getParcelableExtra<TestDataClass>(TEST_DATA)

        if (dataClass != null) {
            Log.d(TestJobService::class.java.canonicalName, "Obtained Data Class")
        } else {
            Log.d(TestJobService::class.java.canonicalName, "Didn't Obtained Data Class")
        }

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            //do nothing
        }
    }

    companion object {
        private const val ID = 82313
        private const val TEST_DATA = "TEST_DATA"

        fun startTestService(context: Context, data: TestDataClass) {
            val intent = Intent(context, TestJobService::class.java)
            intent.putExtra(TEST_DATA, data)

            enqueueWork(context, TestJobService::class.java, ID, intent)
        }
    }
}
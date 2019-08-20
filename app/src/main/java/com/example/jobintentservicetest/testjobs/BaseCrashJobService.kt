package com.example.jobintentservicetest.testjobs

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService
import com.example.jobintentservicetest.TestDataClass

abstract class BaseCrashJobService : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        val dataClass = intent
            .takeIf { intent.hasExtra(TEST_DATA) }
            ?.getParcelableExtra<TestDataClass>(TEST_DATA)

        if (dataClass != null) {
            Log.d(this::class.java.canonicalName, "Obtained Data Class")
        } else {
            Log.d(this::class.java.canonicalName, "Didn't Obtained Data Class")
        }

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            //do nothing
        }
    }

    companion object {
        private const val TEST_DATA = "TEST_DATA"

        fun <T : BaseCrashJobService> startTestService(
            context: Context,
            data: TestDataClass,
            jobClass: Class<in T>,
            jobId: Int
        ) {
            val intent = Intent(context, jobClass)
            intent.putExtra(TEST_DATA, data)

            enqueueWork(context, jobClass, jobId, intent)
        }
    }
}
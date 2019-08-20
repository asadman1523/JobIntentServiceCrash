package com.example.jobintentservicetest.testjobs

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService
import com.example.jobintentservicetest.TestDataClass

abstract class BaseCrashJobService : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        val dataId = intent
            .takeIf { intent.hasExtra(DATA_ID_EXTRA) }
            ?.getIntExtra(DATA_ID_EXTRA, -1)

        if (dataId != null && dataId != -1) {
            Log.d(this::class.java.canonicalName, "Obtained Data Id")
        } else {
            Log.d(this::class.java.canonicalName, "Didn't Obtained Data Id")
        }

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            //do nothing
        }
    }

    companion object {
        private const val DATA_ID_EXTRA = "DATA_ID_EXTRA"

        fun <T : BaseCrashJobService> startTestService(
            context: Context,
            data: TestDataClass,
            jobClass: Class<in T>,
            jobId: Int
        ) {
            val intent = Intent(context, jobClass)
            intent.putExtra(DATA_ID_EXTRA, data.randomId)

            enqueueWork(context, jobClass, jobId, intent)
        }
    }
}
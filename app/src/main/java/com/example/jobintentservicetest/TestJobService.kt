package com.example.jobintentservicetest

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class TestJobService : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        val idExtra = intent.takeIf { intent.hasExtra(DATA_ID_EXTRA) }?.getIntExtra(DATA_ID_EXTRA, -1)

        if (idExtra != null && idExtra != -1) {
            Log.d(TestJobService::class.java.canonicalName, "Obtained Id Extra")
        } else {
            Log.d(TestJobService::class.java.canonicalName, "Didn't Id Extra")
        }

        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            //do nothing
        }
    }

    companion object {
        private const val ID = 82313
        private const val DATA_ID_EXTRA = "ID_EXTRA"
        private const val DATA_MSG_EXTRA= "MSG_EXTRA"

        fun startTestService(context: Context, data: TestDataClass) {
            val intent = Intent(context, TestJobService::class.java)
            intent.putExtra(DATA_ID_EXTRA, data.randomId)
            intent.putExtra(DATA_MSG_EXTRA, data.testMessage)

            enqueueWork(context, TestJobService::class.java, ID, intent)
        }
    }
}
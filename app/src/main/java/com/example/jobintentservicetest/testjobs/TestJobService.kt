package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService : BaseCrashJobService() {
    companion object {
        private const val ID = 82313

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService::class.java,
                ID
            )
        }
    }
}
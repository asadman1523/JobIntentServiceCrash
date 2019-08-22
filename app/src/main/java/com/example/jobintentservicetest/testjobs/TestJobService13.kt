package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService13 : BaseCrashJobService() {
    companion object {
        private const val ID = 82325

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService13::class.java,
                ID
            )
        }
    }
}
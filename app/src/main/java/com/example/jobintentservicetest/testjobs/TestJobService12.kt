package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService12 : BaseCrashJobService() {
    companion object {
        private const val ID = 82324

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService12::class.java,
                ID
            )
        }
    }
}
package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService5 : BaseCrashJobService() {
    companion object {
        private const val ID = 82317

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService5::class.java,
                ID
            )
        }
    }
}
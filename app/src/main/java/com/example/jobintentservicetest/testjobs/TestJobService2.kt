package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService2 : BaseCrashJobService() {
    companion object {
        private const val ID = 82314

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService2::class.java,
                ID
            )
        }
    }
}
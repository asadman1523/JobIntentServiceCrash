package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService9 : BaseCrashJobService() {
    companion object {
        private const val ID = 82321

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService9::class.java,
                ID
            )
        }
    }
}
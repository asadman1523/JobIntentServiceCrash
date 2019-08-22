package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService15 : BaseCrashJobService() {
    companion object {
        private const val ID = 82327

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService15::class.java,
                ID
            )
        }
    }
}
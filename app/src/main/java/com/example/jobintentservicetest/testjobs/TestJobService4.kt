package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService4 : BaseCrashJobService() {
    companion object {
        private const val ID = 82316

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService4::class.java,
                ID
            )
        }
    }
}
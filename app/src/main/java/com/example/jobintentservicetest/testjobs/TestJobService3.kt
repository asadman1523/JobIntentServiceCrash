package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService3 : BaseCrashJobService() {
    companion object {
        private const val ID = 82315

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService3::class.java,
                ID
            )
        }
    }
}
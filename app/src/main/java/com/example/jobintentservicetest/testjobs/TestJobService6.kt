package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService6 : BaseCrashJobService() {
    companion object {
        private const val ID = 82318

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService6::class.java,
                ID
            )
        }
    }
}
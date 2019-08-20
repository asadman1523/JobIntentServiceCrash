package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService8 : BaseCrashJobService() {
    companion object {
        private const val ID = 82320

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService8::class.java,
                ID
            )
        }
    }
}
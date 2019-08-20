package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService7 : BaseCrashJobService() {
    companion object {
        private const val ID = 82319

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService7::class.java,
                ID
            )
        }
    }
}
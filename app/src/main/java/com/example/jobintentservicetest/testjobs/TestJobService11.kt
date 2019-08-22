package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService11 : BaseCrashJobService() {
    companion object {
        private const val ID = 82323

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService11::class.java,
                ID
            )
        }
    }
}
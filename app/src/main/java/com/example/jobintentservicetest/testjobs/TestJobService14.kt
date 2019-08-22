package com.example.jobintentservicetest.testjobs

import android.content.Context
import com.example.jobintentservicetest.TestDataClass

class TestJobService14 : BaseCrashJobService() {
    companion object {
        private const val ID = 82326

        fun startTestService(context: Context, data: TestDataClass) {
            startTestService(
                context,
                data,
                TestJobService14::class.java,
                ID
            )
        }
    }
}
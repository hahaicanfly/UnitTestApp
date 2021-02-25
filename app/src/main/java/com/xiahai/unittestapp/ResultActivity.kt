package com.xiahai.unittestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

/**
 * @ClassName: ResultActivity
 * @Description:
 * @Date: 2021/2/18 4:33 PM
 * @History:
 * <date> <version> <desc>
 */
class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val id = intent.getStringExtra("ID")

        tv_result.text = "Result Id is: $id"
    }
}
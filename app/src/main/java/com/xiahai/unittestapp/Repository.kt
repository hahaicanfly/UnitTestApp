package com.xiahai.unittestapp

import android.content.Context

/**
 * @ClassName: Repository
 * @Description:
 * @Date: 2021/2/19 3:01 PM
 * @History:
 * <date> <version> <desc>
 */
class Repository(val context: Context) {
    fun saveUserId(id: String) {
        val sharedPreferences = context.getSharedPreferences("USER_DATA", Context.MODE_PRIVATE)
        sharedPreferences.edit().putString("USER_ID", id).commit()
    }
}

package com.xiahai.unittestapp

import android.content.Context
import android.content.SharedPreferences
import org.junit.Test
import org.mockito.Mockito.*

/**
 * @ClassName: RepositoryTest
 * @Description:
 * @Date: 2021/2/19 3:15 PM
 * @History:
 * <date> <version> <desc>
 */
class RepositoryTest {

    @Test
    fun saveUserIdTest() {
        //1. Mock Context、SharePreference
        val pref = mock(SharedPreferences::class.java)
        val editor = mock(SharedPreferences.Editor::class.java)
        val context = mock(Context::class.java)

        //2. 使用when thenReturn 讓Production code 呼叫sharedPreference時回傳模擬的物件
        `when`(context.getSharedPreferences(anyString(), anyInt())).thenReturn(pref)
        `when`(pref.edit()).thenReturn(editor)
        `when`(editor.putString(anyString(), anyString())).thenReturn(editor)

        //3. 執行被測試物件：Activity 呼叫repository.saveUserId()
        val userId = "A1234567"
        val preKey = "USER_ID"

        val repository = Repository(context)
        repository.saveUserId(userId)

        //4. 使用verify method
        verify(editor)
                //驗證模擬物件是否有呼叫putString，並傳入正確的參數
            .putString(
                argThat { key -> key == preKey },
                argThat { value -> value == userId }
            )

        //5. 檢查SharedPreference
        verify(editor)
                //是否有呼叫commit
            .commit()

    }


    fun saveUserIdTestPrac() {
        //1. Mock Context、SharePreference

        //2. 使用when thenReturn 讓Production code 呼叫sharedPreference時回傳模擬的物件

        //3. 執行被測試物件：Activity 呼叫repository.saveUserId()

        //4. 使用verify method，驗證模擬物件是否有呼叫putString，並傳入正確的參數

        //5. 檢查SharedPreference是否有呼叫commit

    }
}














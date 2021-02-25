package com.xiahai.unittestapp

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * @ClassName: RegisterVerifyTest
 * @Description:
 * @Date: 2021/2/19 11:09 AM
 * @History:
 * <date> <version> <desc>
 */
class RegisterVerifyTest {

    lateinit var registerVerify: RegisterVerify

    @Before
    fun setUp() {
        registerVerify = RegisterVerify()
    }

    @Test
    fun loginIdVerifyTrue(){
//        val registerVerify = RegisterVerify()
        Assert.assertTrue(registerVerify.isLoginIdVerify("A123456"))
    }

    @Test
    fun loginIdVerifyFalse(){
//        val registerVerify = RegisterVerify()
        Assert.assertFalse(registerVerify.isLoginIdVerify("A1234"))
    }
}
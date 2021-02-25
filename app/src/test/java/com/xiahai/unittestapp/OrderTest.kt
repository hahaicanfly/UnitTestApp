package com.xiahai.unittestapp

import com.xiahai.unittestapp.test.IEmailUtil
import com.xiahai.unittestapp.test.Order
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

/**
 * @ClassName: OrderTest
 * @Description:
 * @Date: 2021/2/18 2:52 PM
 * @History:
 * <date> <version> <desc>
 */
class OrderTest {

    @Mock
    lateinit var mockEmailUtil: IEmailUtil

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun test_insert_order() {
        val order = Order()
        val mockEmailUtil = MockEmailUtil()

        val userEmail = "my_mail@email.com"
        order.insertOrder(userEmail, 1, 200, mockEmailUtil)

        //使用mockEmail.receiveEmail 來驗證 order.insert 是否有呼叫 IEmailUtil.sendCustomer
        Assert.assertEquals(userEmail, mockEmailUtil.receiveEmail)
    }

    @Test
    fun test_insert_order_by_mokito() {
        val order = Order()

        /** use mokito mock() **/
//        val mockEmailUtil = mock(IEmailUtil::class.java)

        val userEmail = "my_mail@email.com"
        order.insertOrder(userEmail, 1, 200, mockEmailUtil)

        /** use mokito verify() **/
        //驗證是否有呼叫sendCustomer，並傳入正確的userEmail
        verify(mockEmailUtil).sendCustomer(userEmail)
    }
}
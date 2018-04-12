package com.github.skiedrowski.tools.kt.exceptions

import com.natpryce.hamkrest.and
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.containsSubstring
import org.junit.Test

class ExceptionsTest {
    @Test
    fun stackTraceString() {
        val stackTraceString = NullPointerException().stackTraceString()
        assertThat(
            stackTraceString,
            containsSubstring("java.lang.NullPointerException")
                .and(containsSubstring("com.github.skiedrowski.tools.kt.exceptions.ExceptionsTest.stackTraceString"))
        )
    }

}
package com.example.myapplication

import org.junit.Test
import java.util.*

class SampleTEst {

    @Test
    fun motorolaPls() {
        val output = UUID(0, 121).toString()
        val expected = "00000000-0000-0000-0000-000000000079"

        assert(output == expected) { "Expected $expected got $output" }
    }
}

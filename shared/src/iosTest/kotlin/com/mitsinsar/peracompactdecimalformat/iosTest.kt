package com.mitsinsar.peracompactdecimalformat

import com.mitsinsar.peracompactdecimalformat.locals.EnglishLocale
import java.math.BigDecimal
import kotlin.test.BeforeClass
import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    lateinit var formatter: PeraCompactDecimalFormat

    @BeforeClass
    fun setup() {
        formatter = PeraCompactDecimalFormatBuilder.getInstance()
            .setLocale(EnglishLocale())
            .build()
    }

    private fun assertFormattedNumber(
        rawNumber: String,
        expectedFormattedNumber: String,
        expectedSuffix: String?
    ): Boolean {
        val number = BigDecimal(rawNumber)
        val formattedCompactDecimal = formatter.format(number)
        println(formattedCompactDecimal.toString())
        return with(formattedCompactDecimal) {
            this.number == number && formattedNumber == expectedFormattedNumber && suffix == expectedSuffix
        }
    }

    @Test
    fun checkIfMinimumSmallNumberWorks() {
        assertTrue {
            assertFormattedNumber(
                rawNumber = "0",
                expectedFormattedNumber = "0.00",
                expectedSuffix = ""
            )
        }
    }

//    @Test
//    fun `check if random small number works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "214.42521321324123",
//                expectedFormattedNumber = "214.42",
//                expectedSuffix = ""
//            )
//        }
//    }
//
//    @Test
//    override fun `check if maximum small number works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999.999999999",
//                expectedFormattedNumber = "999.99",
//                expectedSuffix = ""
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum thousand works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000.0000000000",
//                expectedFormattedNumber = "1,000.00",
//                expectedSuffix = ""
//            )
//        }
//    }
//
//    @Test
//    override fun `check if random thousand works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "541122.0124123",
//                expectedFormattedNumber = "541,122.01",
//                expectedSuffix = ""
//            )
//        }
//    }
//
//    @Test
//    override fun `check if maximum thousand works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999999.999999999",
//                expectedFormattedNumber = "999,999.99",
//                expectedSuffix = ""
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum million works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000000",
//                expectedFormattedNumber = "1.00",
//                expectedSuffix = "M"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if mid million works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "249520000",
//                expectedFormattedNumber = "249.52",
//                expectedSuffix = "M"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if max million works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999999999.999",
//                expectedFormattedNumber = "999.99",
//                expectedSuffix = "M"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum billion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000000000.999",
//                expectedFormattedNumber = "1.00",
//                expectedSuffix = "B"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if random billion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "12489000000.999",
//                expectedFormattedNumber = "12.48",
//                expectedSuffix = "B"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if maximum billion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999999999999.9999999",
//                expectedFormattedNumber = "999.99",
//                expectedSuffix = "B"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum trillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000000000000",
//                expectedFormattedNumber = "1.00",
//                expectedSuffix = "t"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if random trillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "211782475000000.516316214",
//                expectedFormattedNumber = "211.78",
//                expectedSuffix = "t"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if maximum trillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999999999999999.99999999",
//                expectedFormattedNumber = "999.99",
//                expectedSuffix = "t"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum quadrillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000000000000000",
//                expectedFormattedNumber = "1.00",
//                expectedSuffix = "q"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if random quadrillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "261897000000000000.42187821",
//                expectedFormattedNumber = "261.89",
//                expectedSuffix = "q"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if maximum quadrillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "999999999999999999.9999999999",
//                expectedFormattedNumber = "999.99",
//                expectedSuffix = "q"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if minimum quintillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "1000000000000000000",
//                expectedFormattedNumber = "1.00",
//                expectedSuffix = "Q"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if random quintillion works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "5878674635918825120.4215213",
//                expectedFormattedNumber = "5.87",
//                expectedSuffix = "Q"
//            )
//        }
//    }
//
//    @Test
//    override fun `check if max UINT64 works`() {
//        assertTrue {
//            assertFormattedNumber(
//                rawNumber = "18446744073709551615",
//                expectedFormattedNumber = "18.44",
//                expectedSuffix = "Q"
//            )
//        }
//    }

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}
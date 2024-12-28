import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ConverterTests {
    private val converter = sf.CurrencyConverter

    @Test
    fun testConvertRubToUsd() {
        assertEquals(3, converter.convertRubToUsd(300))
    }

    @Test
    fun testConvertUsdToRub() {
        assertEquals(300, converter.convertUsdToRub(3))
    }
}
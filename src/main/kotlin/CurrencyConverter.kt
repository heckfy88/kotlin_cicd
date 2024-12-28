package sf

enum class Currency(val value: Int) {
    USD(1),
}

enum class CurrencyPair(val value: Int) {
    RUB_USD(100),
}

object CurrencyConverter {
    fun convertRubToUsd(amount: Int): Int {
        return amount / CurrencyPair.RUB_USD.value
    }

    fun convertUsdToRub(amount: Int): Int {
        return amount * CurrencyPair.RUB_USD.value
    }
}
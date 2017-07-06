package calc

/**
 * Created by rioswarawan on 7/6/17.
 */

fun main(args: Array<String>) {
    compute()
}

private fun compute() {
    print("Value A: ")
    val value1 = readLine().toString().toInt()

    print("Value B: ")
    val value2 = readLine().toString().toInt()

    chooseOperator(value1, value2)
    computeAgain()
}

private fun computeAgain() {
    println()
    println()
    print("Run calculator again? (y/n)")
    val again = readLine()

    when {
        again?.toLowerCase().equals("y") -> compute()
        again?.toLowerCase().equals("n") -> println("Thanks!")
        else -> println("Thanks!")
    }
}

private fun chooseOperator(val1: Int, val2: Int) {
    println()
    println("Choose Operator: ")
    println("1. Sum (+)")
    println("2. Minus (-)")
    println("3. Multiple (*)")
    println("4. Divide (/)")
    print("Choose (1..4):")
    val op = readLine().toString().toInt()

    when (op) {
        1 -> sum(val1, val2)
        2 -> minus(val1, val2)
        3 -> multiple(val1, val2)
        4 -> divide(val1, val2)
        else -> {
            println("Only choose 1 to 4 operation above")
            computeAgain()
        }
    }
}

private fun sum(val1: Int, val2: Int) {
    println("$val1 + $val2 = " + (val1 + val2))
}

private fun minus(val1: Int, val2: Int) {
    println("$val1 - $val2 = " + (val1 - val2))
}

private fun multiple(val1: Int, val2: Int) {
    println("$val1 * $val2 = " + (val1 * val2))
}

private fun divide(val1: Int, val2: Int) {
    println("$val1 - $val2 = " + (val1 / val2))
}
/**
 * Created by rioswarawan on 7/3/17.
 */

fun main(args: Array<String>) {

    /**
     * Prints:
     * Hello World
     */
    println("Hello World")


    /**
     * Prints:
     * User(id=1, name=Rio Swarawan, email=swarawan.rio@gmail.com)
     */
    val rio = User(1, "Rio Swarawan", "swarawan.rio@gmail.com")
    println(rio)


    /**
     * Prints:
     * User(id=1, name=Rio Swarawan Putra, email=swarawan.rio@gmail.com)
     */
    val rioEdit = rio.copy(name = "Rio Swarawan Putra")
    println(rioEdit)


    /**
     * Prints:
     * Hello, Rio Swarawan Putra. Is swarawan.rio@gmail.com your real email?
     */
    val (_, realName, realEmail) = rioEdit
    println("Hello, $realName. Is $realEmail your real email?")


    /**
     * Prints:
     * [User(id=1, name=Dono, email=dono@warkop.com), User(id=2, name=Kasino, email=kasino@warkop.com), User(id=3, name=Indro, email=indro@warkop.com)]
     */
    val users = listOf(
            User(1, "Dono", "dono@warkop.com"),
            User(2, "Kasino", "kasino@warkop.com"),
            User(3, "Indro", "indro@warkop.com"))
    println(users)


    /**
     * Prints:
     * User(id=1, name=Dono, email=dono@warkop.com)
     * User(id=2, name=Kasino, email=kasino@warkop.com)
     * User(id=3, name=Indro, email=indro@warkop.com)
     */
    for (user in users) {
        println(user)
    }


    /**
     * Prints:
     * [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
     */
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val doubled = numbers.map { value -> value * 2 }
    print(doubled)
    println()


    /**
     * Same as above
     * Prints:
     * [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
     */
    val doubled2 = numbers.map { it * 2 }
    print(doubled2)
    println()


    /**
     * Prints:
     * [2, 4, 6, 8, 10]
     */
    val evenNumbers = numbers.filter { it % 2 == 0 }
    print(evenNumbers)
    println()


    /**
     * Prints:
     * [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     */
    val sortedNumber = numbers.sortedByDescending { it }
    print(sortedNumber)
    println()


    /**
     * Prints:
     * 5 is less than 10
     */
    val first = 5
    val second = 10
    fun compare(a: Int, b: Int): Boolean = a < b
    if (compare(first, second))
        println("$first is less than $second")
    else println("$second is less than $first")

    /**
     * Prints:
     * [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39,
     * 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77,
     * 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]
     */
    val bigNumbers: MutableList<Int> = (1..100).toMutableList()
    val oddNumbers = bigNumbers.filter { it % 2 == 1 }
    print(oddNumbers)
    println()

    /**
     * Prints:
     * [3, 9, 15, 21, 27, 33, 39, 45, 51, 57, 63, 69, 75, 81, 87, 93, 99]
     */
    val oddAndDivideByThreeNumbers = bigNumbers.filter { it % 2 == 1 }.filter { it % 3 == 0 }
    print(oddAndDivideByThreeNumbers)
    println()

}

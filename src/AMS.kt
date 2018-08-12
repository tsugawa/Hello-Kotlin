import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    feedTheFish()
}

fun feedTheFish(){

    val day=randomDay()

    val food=fishFood(day)

    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {

    return when (day) {
        "Sunday" -> "flakes"
        "Monday" -> "pellets"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}
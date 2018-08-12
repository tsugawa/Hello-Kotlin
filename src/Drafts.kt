fun main(args: Array<String>) {
    for (i in 1..10) {

        var fortuneCheck = getFortuneCookie(getBirthday())

        println("Your fortune is: $fortuneCheck")

        if (fortuneCheck.contains("Take it easy" ))
            break

    }
}

fun getBirthday() : Int {


    print("Enter your  birthday: ")

    return readLine()?.toIntOrNull() ?: 1


}

fun getFortuneCookie(birthday : Int): String {

    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    val index = when (birthday) {
        in 1..7 -> 4
        28,31 -> 2
        else -> birthday.rem(fortunes.size)
    }

    return fortunes[index]

}
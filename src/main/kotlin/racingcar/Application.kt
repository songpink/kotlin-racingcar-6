package racingcar

import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms

fun main() {
    var game = Randoms.pickNumberInRange(0, 9)
    val read = Console.readLine()
    println(game)
    println(read)
}

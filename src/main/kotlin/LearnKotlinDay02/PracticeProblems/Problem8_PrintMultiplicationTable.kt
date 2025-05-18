package LearnKotlinDay02.PracticeProblems

// 문제 8. PrintMultiplicationTable
// 사용자로부터 숫자를 입력받아 해당 숫자의 구구단을 출력하는 프로그램을 작성하세요.

fun main() {
    val num = readLine()!!.toInt()  // 사용자 입력 숫자

    // 구구단 출력 로직 작성
    for(i in 1..9){
        println("$num x $i = " + num * i)
    }
}
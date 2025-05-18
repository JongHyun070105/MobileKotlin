package LearnKotlinDay02.PracticeProblems

// 문제 10. RepeatInputUntilExit
// 사용자에게 "exit"이 입력될 때까지 계속해서 입력을 받는 프로그램을 작성하세요.

fun main() {
    var text : String
    do {
        text = readLine()!!.toString()  // 사용자 입력
        // "exit"이 입력되면 종료
    } while (text != "exit")
}
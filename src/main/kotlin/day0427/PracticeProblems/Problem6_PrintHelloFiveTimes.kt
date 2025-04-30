package day0427.PracticeProblems

// 문제 6. PrintHelloFiveTimes
// "Hello"를 5번 출력하는 프로그램을 작성하세요.

fun main() {
    var count = 0  // 출력 횟수를 셀 변수

    do {
        println("Hello")
        count++
    }while (count <= 5)
}
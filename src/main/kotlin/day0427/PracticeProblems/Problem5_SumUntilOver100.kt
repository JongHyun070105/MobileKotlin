package day0427.PracticeProblems

// 문제 5. SumUntilOver100
// 1부터 자연수를 하나씩 더해 나가다가,
// 합계가 100을 넘는 순간 반복을 멈추는 프로그램을 작성하세요.
// 그때 사용된 마지막 숫자와 합계를 출력하세요.

fun main() {
    var sum = 0
    var number = 1

    while (sum <= 100) {
        sum += number
        number++
    }

    println("최종 숫자: ${number - 1}")
    println("합계: $sum")
}
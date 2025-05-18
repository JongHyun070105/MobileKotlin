package day0501.PracticeProblems

// 문제 설명:
// 정수 n을 매개변수로 받아, n번째 피보나치 수를 반환하는 함수를 작성하세요.
// 피보나치 수열: 1, 1, 2, 3, 5, 8, 13, 21, ... (앞의 두 수를 더한 수열)
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, 반복문 (재귀 함수 사용 가능)
fun fibonacci(n: Int): Int {
    if (n <= 2) {
        return 1 // 첫 번째 항과 두 번째 항은 1
    }
    var a = 1
    var b = 1
    var result = 0
    for (i in 3..n) {
        result = a + b
        a = b
        b = result
    }
    return result
}
fun main() {
    val n = 7 // 구할 피보나치 수의 순서

    val a = fibonacci(n)
    println("${a}")
}
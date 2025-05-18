package LearnKotlinDay02.PracticeProblems

// 문제 3. Factorial
// 주어진 숫자 n에 대해 n! (팩토리얼)을 구하는 프로그램을 작성하세요.
// 팩토리얼은 n부터 1까지의 모든 자연수를 곱한 값을 의미합니다.
// 예: 5! = 5 * 4 * 3 * 2 * 1 = 120

fun main() {
    val n = 5  // 원하는 숫자 n을 설정하세요.
    var factorial = 1

    for(i in n downTo 1){
        factorial *= i
    }

    println("Factorial of $n is $factorial")
}
package LearnKotlinDay03.PracticeProblems

// 문제 설명:
// 원금(Double), 이율(Double), 기간(Int)을 매개변수로 받아, 복리 이자를 계산하여 반환하는 함수를 작성하세요.
// 복리 이자 계산 공식: 원금 * (1 + 이율)^기간
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Double 타입, Int 타입, 연산자

fun bank(principal: Double, interestRate: Double, years: Int): Double{
    val money = Math.pow(principal * (1 + interestRate), years.toDouble())
    return money
}

fun main() {
    val principal = 1000000.0   // 원금
    val interestRate = 0.05    // 이율 (5%)
    val years = 5             // 기간 (년)

    println(bank(principal, interestRate, years))
}
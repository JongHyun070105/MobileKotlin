package LearnKotlinDay03.PracticeProblems

// 문제 설명:
// 태어난 년도를 Int 타입 매개변수로 받아, 현재 나이를 계산하여 반환하는 함수를 작성하세요.
// 현재 년도는 2024년으로 가정합니다.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, 연산자

fun age(birthYear: Int): Int{
    val year = 2024
    val result = year - birthYear
    return result
}

fun main() {
    val birthYear = 2000 // 태어난 년도
    println("현재 나이 " + age(birthYear))
}
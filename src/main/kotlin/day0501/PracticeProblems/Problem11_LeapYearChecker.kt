package day0501.PracticeProblems

// 문제 설명:
// 년도를 Int 타입 매개변수로 받아, 윤년인지 아닌지 판별하여 "윤년" 또는 "평년" 문자열을 반환하는 함수를 작성하세요.
// 윤년 판별 조건:
// - 4로 나누어 떨어지지만, 100으로는 나누어 떨어지지 않는 해
// - 또는 400으로 나누어 떨어지는 해
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, String 타입, 조건문, 논리 연산자

fun yearsum(year: Int): String{
    return if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
        "윤년"
    } else{
        "평년"
    }
}

fun main() {
    val year = 2024 // 판별할 년도
    val result = yearsum(year)

    println("${year} 는 ${result}")
}
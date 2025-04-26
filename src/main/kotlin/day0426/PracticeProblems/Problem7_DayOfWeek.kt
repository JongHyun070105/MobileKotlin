package day0426.PracticeProblems

// 7. 요일 출력
// 1~7 사이 숫자를 입력받아 요일을 출력하는 프로그램을 작성하세요.
// 1=월요일, 2=화요일… 7=일요일, 그 외 숫자는 "잘못된 입력"을 출력하세요.

fun main() {
    val day = 3  // 원하는 요일 숫자로 바꿔서 테스트하세요.

    when(day){
        1 -> println("월요일")
        2 -> println("화요일")
        3 -> println("수요일")
        4 -> println("목요일")
        5 -> println("금요일")
        6 -> println("토요일")
        7 -> println("일요일")
        else -> println("오류")
    }
}
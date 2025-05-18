package LearnKotlinDay03.PracticeProblems

// 문제 설명:
// 문자열 하나를 매개변수로 받아, 그 문자열을 뒤집어서 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, String 타입, 반복문 (선택 사항)

fun reverse(text: String): String{
    return text.reversed()
}

fun main() {
    val text = "Hello, Kotlin!"

    println("${text} 거꾸로 하면 ${reverse(text)}")
}
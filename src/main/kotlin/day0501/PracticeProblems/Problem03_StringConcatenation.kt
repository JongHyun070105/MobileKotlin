package day0501.PracticeProblems

// 문제 설명:
// 두 개의 문자열을 매개변수로 받아, 두 문자열을 공백으로 구분하여 합친 결과를 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, String 타입, 연산자

fun stringSum(str1: String, str2: String): String{
    return str1 + " " + str2
}

fun main() {
    val str1 = "Hello"
    val str2 = "Kotlin"

    val strresult = stringSum(str1, str2)

    println(strresult)
}
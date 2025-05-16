package day0501.PracticeProblems

// 문제 설명:
// 정수 하나를 매개변수로 받아, 짝수인지 홀수인지 판별하여 "짝수" 또는 "홀수" 문자열을 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, String 타입, 조건문, 연산자
fun trueorfalse(number: Int){
    if(number % 2 == 0){
        println("$number 는 짝수")
    } else{
        println("$number 는 홀수")
    }
}

fun main() {
    val number = 7 // 판별할 숫자

    println(trueorfalse(number))
}

// 개선된 버전
//fun trueorfalse(number: Int): String{
//    return if(number % 2 == 0){
//        "짝수"
//    } else{
//        "홀수"
//    }
//}
//
//fun main() {
//    val number = 7 // 판별할 숫자
//    val result = trueorfalse(number)
//    println("$number 는 $result")
//}
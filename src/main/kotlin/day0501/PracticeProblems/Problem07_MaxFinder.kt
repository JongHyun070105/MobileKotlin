package day0501.PracticeProblems

// 문제 설명:
// 세 개의 정수를 매개변수로 받아, 그 중 가장 큰 수를 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, 조건문

fun iknowmax(num1: Int, num2: Int, num3: Int):Int{
    return if(num1 > num2 && num1> num3){
        num1
    } else if(num2 > num1 && num2 > num3){
        num2
    } else {
        num3
    }
}

fun main() {
    val num1 = 15
    val num2 = 8
    val num3 = 22

    val result = iknowmax(num1, num2, num3)

    println("가장 큰 수는 ${result}")
}
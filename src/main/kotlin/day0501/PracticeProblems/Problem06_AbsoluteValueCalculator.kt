package day0501.PracticeProblems

// 문제 설명:
// 정수 하나를 매개변수로 받아, 그 수의 절댓값을 계산하여 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, 조건문, 연산자

fun abs(number: Int): Int{
    return if(number > 0){
        number
    }else{
        -number
    }
}

fun main() {
    val number = -10 // 절댓값을 구할 숫자
    val result = abs(number)

    println("$result")
}
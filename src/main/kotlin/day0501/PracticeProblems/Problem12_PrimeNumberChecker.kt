package day0501.PracticeProblems

// 문제 설명:
// 정수 하나를 매개변수로 받아, 소수인지 아닌지 판별하여 "소수" 또는 "소수가 아님" 문자열을 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, String 타입, 반복문, 조건문, 연산자

fun isDecimal(number: Int): String{
    if(number <= 1 ){
        return "소수가 아님"
    }
    for(i in 2..Math.sqrt(number.toDouble()).toInt()){
        if(number % i == 0){
            return "소수가 아님"
        }
    }
    return "소수"
}

fun main() {
    val number = 17 // 판별할 숫자R
    val result = isDecimal(number)

    println("${number} 는 ${result}")
}
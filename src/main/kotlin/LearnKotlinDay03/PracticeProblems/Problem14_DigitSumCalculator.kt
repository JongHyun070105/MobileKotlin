package LearnKotlinDay03.PracticeProblems

// 문제 설명:
// 정수 하나를 매개변수로 받아, 각 자리수의 합을 계산하여 반환하는 함수를 작성하세요.
// 예: 12345 -> 1 + 2 + 3 + 4 + 5 = 15
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, 반복문, 연산자

fun returnInt(number: Int): Int{
    val list = number.toString().split("")
    var result = 0
    for(i in list){
        if(i != ""){
            result += i.toInt()
        }
    }
    return result
}

fun main() {
    val number = 12345 // 자리수 합을 구할 숫자

    val a = returnInt(number)
    println("${number}를 더한값은 ${a}")
}
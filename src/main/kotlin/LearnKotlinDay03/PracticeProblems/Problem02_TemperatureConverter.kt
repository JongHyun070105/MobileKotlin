package LearnKotlinDay03.PracticeProblems

// 문제 설명:
// 섭씨 온도를 화씨 온도로 변환하는 함수를 작성하세요.
// 섭씨 온도는 Double 타입 매개변수로 주어집니다.
// 화씨 온도는 "(섭씨 온도 * 9 / 5) + 32" 로 계산합니다.
// 계산 결과를 Double 타입으로 반환하는 함수를 만드세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Double 타입, 연산자

fun change(celsius: Double): Double{
    val num = (celsius * 9 / 5) + 32
    return num
}

fun main() {
    val celsius = 25.0 // 섭씨 온도

    val result = change(celsius)
    println("섭씨를 화씨 온도로 바꿨을 때 결과 : ${result}")
}
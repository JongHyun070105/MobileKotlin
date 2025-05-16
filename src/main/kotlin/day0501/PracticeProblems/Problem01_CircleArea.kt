package day0501.PracticeProblems

// 문제 설명:
// 함수를 사용하여 원의 넓이를 계산하는 프로그램을 작성하세요.
// 원의 반지름은 Double 타입 변수로 주어집니다.
// 원의 넓이는 "반지름 * 반지름 * PI" 로 계산하며, PI 값은 3.14159로 정의합니다.
// 계산 결과를 Double 타입으로 반환하는 함수를 만드세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Double 타입, 연산자

fun main() {
    val radius = 5.0 // 원의 반지름
    val PI = 3.14159
    val sum: Double = radius * radius * PI

    println(sum)
}

// 개선된 버전

//fun circleArea(radius: Double): Double{
//    val PI: Double = 3.14159
//    return radius * radius * PI
//}
//
//fun main(){
//    val radius = 5.0
//    val area = circleArea(radius)
//    println("원의 넓이 : $areaæ)
//}
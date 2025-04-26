package day0426.PracticeProblems

// 9. 두 수의 차이 절댓값 구하기
// 두 개의 정수를 변수로 선언하고, 두 수의 차이를 절댓값으로 출력하는 프로그램을 작성하세요.

fun main() {
    val a = 7  // 첫 번째 수
    val b = 12  // 두 번째 수

    if(a > b){
        println(a - b)
    } else{
        println(b - a)
    }
}
package day0426.PracticeProblems

// 5. 절댓값 구하기
// 정수 하나를 변수로 선언하고, 그 수의 절댓값을 출력하는 프로그램을 작성하세요.

fun main() {
    val number = -10  // 원하는 정수로 바꿔서 테스트하세요.

    if(number < 0){
        println(-number)
    } else{
        println(number)
    }
}
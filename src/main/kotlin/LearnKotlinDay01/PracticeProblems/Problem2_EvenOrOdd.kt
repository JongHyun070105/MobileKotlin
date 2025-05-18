package LearnKotlinDay01.PracticeProblems

// 2. 짝수/홀수 판별
// 정수 하나를 변수로 선언하고, 짝수면 "짝수", 홀수면 "홀수"를 출력하는 프로그램을 작성하세요.

fun main() {
    val number = 5  // 원하는 숫자로 바꿔서 테스트하세요.

    if(number % 2 ==0){
        println("짝수")
    } else if(number % 2 != 0){
        println("홀수")
    } else {
        println("오류")
    }
}
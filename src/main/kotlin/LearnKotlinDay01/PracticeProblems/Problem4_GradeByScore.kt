package LearnKotlinDay01.PracticeProblems

// 4. 점수에 따른 학점 출력
// 점수를 변수로 선언하고, 점수에 따라 다음과 같이 학점을 출력하는 프로그램을 작성하세요.
// 90점 이상: A
// 80점 이상: B
// 70점 이상: C
// 60점 이상: D
// 그 외: F

fun main() {
    val score = 85  // 원하는 점수로 바꿔서 테스트하세요.

    if(score >= 90){
        println("A")
    } else if(score >= 80){
        println("B")
    } else if(score >= 70){
        println("C")
    } else if(score >= 60){
        println("D")
    } else {
        println("F")
    }
}
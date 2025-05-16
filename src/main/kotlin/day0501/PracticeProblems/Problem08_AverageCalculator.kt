package day0501.PracticeProblems

// 문제 설명:
// 5개의 Double 타입 점수를 매개변수로 받아, 평균을 계산하여 반환하는 함수를 작성하세요.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Double 타입, 연산자

fun result(score1: Double, score2: Double, score3: Double, score4: Double, score5: Double): Double{
    val mean: Double = (score1 + score2 + score3 + score4 + score5) / 5
    return mean
}

fun main() {
    val score1 = 85.5
    val score2 = 92.0
    val score3 = 78.5
    val score4 = 89.0
    val score5 = 95.5

    val meanValue = result(score1, score2, score3, score4, score5)
    println("평균 : ${meanValue}")
}
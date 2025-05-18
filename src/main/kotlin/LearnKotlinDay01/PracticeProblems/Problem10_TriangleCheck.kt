package LearnKotlinDay01.PracticeProblems

// 10. 삼각형 가능성 판별
// 세 개의 변 길이를 변수로 선언하고,
// 세 변으로 삼각형이 가능한지 판별하는 프로그램을 작성하세요.
// (삼각형 성립 조건: 가장 긴 변의 길이 < 나머지 두 변의 길이 합)

fun main() {
    val a = 5  // 첫 번째 변
    val b = 7  // 두 번째 변
    val c = 10 // 세 번째 변

    if(a >= b && a >= c && a < b + c){
        println("삼각형 가능")
    } else if (b >= a && b >= c && b < a + c){
        println("삼각형 가능")
    } else if(c >= a && c >= b && c < a + b){
        println("삼각형 가능")
    } else {
        println("삼각형 불가능")
    }
}
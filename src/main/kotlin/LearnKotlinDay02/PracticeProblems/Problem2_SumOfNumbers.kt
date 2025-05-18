package LearnKotlinDay02.PracticeProblems

// 문제 2. SumOfNumbers
// 1부터 100까지의 숫자 중 짝수만 더한 값을 출력하는 프로그램을 작성하세요.

fun main() {
    var sum = 0
    for(i in 1..100){
        if(i % 2 == 0){
            sum += i
        }
    }
    println(sum)
}
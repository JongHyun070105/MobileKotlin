package day0427.PracticeProblems

// 문제 7. SumOddNumbers
// 1부터 20까지의 숫자 중 홀수만 더한 값을 출력하는 프로그램을 작성하세요.

fun main() {
    var sum = 0  // 홀수들의 합을 저장할 변수
    var number = 1  // 시작 숫자

    do {
        if(number % 2 != 0){
            sum+=number
        }
        number ++
    }while (number <= 20)

    println(sum)
}
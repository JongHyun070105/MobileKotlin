package day0427.PracticeProblems

fun main() {
    var number = 1  // 시작 숫자

    // 첫 번째 7의 배수를 찾는 로직 작성
    while (number <= 100){
        if (number % 7 == 0){
            println(number)
            break
        }
        number++
    }
}
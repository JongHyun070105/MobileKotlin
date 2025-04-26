package day0426.PracticeProblems

// 6. 세 수 중 가장 큰 수
// 세 개의 정수를 변수로 선언하고, 그 중 가장 큰 수를 출력하는 프로그램을 작성하세요.

fun main() {
    val a = 5  // 첫 번째 수
    val b = 10  // 두 번째 수
    val c = 3  // 세 번째 수

//    if(a > b){
//        println(a)
//    } else if (b > c){
//        println(b)
//    } else if(c > a){
//        println(c)
//    } else if(c > b){
//        println(c)
//    } else if(b > a){
//        println(b)
//    }

    if (a >= b && a >= c){
        println(a)
    } else if (b >= a && b >= c){
        println(b)
    } else{
        println(c)
    }
}
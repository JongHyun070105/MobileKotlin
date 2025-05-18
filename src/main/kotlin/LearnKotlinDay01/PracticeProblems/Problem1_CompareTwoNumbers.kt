package LearnKotlinDay01.PracticeProblems

// 1. 두 수 비교하기
//두 정수 a,b 를 선언하고, 두 수를 비교하여 >, <, == 중 하나를 출력하세요

fun main(){
    val a = 5
    val b = 7

    if(a > b){
        print("A가 더 큼")
    } else if(a < b){
        print("B가 더 큼")
    } else if(a == b){
        print("서로 같음")
    } else{
        print("오류")
    }
}
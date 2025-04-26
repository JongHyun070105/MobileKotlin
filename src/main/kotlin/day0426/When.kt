package day0426

fun main(){
    val day = 2
//    when(day){
//        1 -> print("월")
//        2 -> print("화")
//        3 -> print("수")
//        4,5 -> print("목요일 또는 금요일")
//       else -> print("주말")
//    }

//    val message = when(day){
//        1 -> "월"
//        2 -> "화"
//        else -> "주말"
//    }

//    print(message)

//    when(day){
//        in 1..5 -> print("평일")
//        else -> print("주말")
//    }

    val age = 45

    when{
        age < 13 -> print("어린이")
        age in 13.. 19 -> print("청소년")
        else -> print("성인")
    }
}
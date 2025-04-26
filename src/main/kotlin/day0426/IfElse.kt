package day0426

fun main(){
    val score = 85;

//    if(score >= 90){
//        print("A")
//    } else if(score >= 80){
//        print("B")
//    } else {
//        print("C")
//    }
    val grade = if(score >= 90) "A" else if (score >= 80) "B" else "C"
    print(grade)
}
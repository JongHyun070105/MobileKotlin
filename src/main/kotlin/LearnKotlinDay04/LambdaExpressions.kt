package LearnKotlinDay04

//fun main(){
//    // 1. 매개변수가 없는 람다
//    val sayHI = {
//        println("안녕")
//    }
//    sayHI()
//
//    // 2. 매개변수가 있는 람다
//    val sum = {a: Int, b: Int -> a + b}
//    val result = sum(10, 20)
//    println("두 수의 합:$result")
//
//    // 3. 반환 값이 있는 람다(마지막 표현식의 값이 반환됨)
//    val multiply = {x: Int, y: Int ->
//        println("곱셈 계산 중..")
//        x * y
//    }
//
//    val product = multiply(10,20)
//    println("두 수의 곱 : $product")
//
//    // 4. 매개변수가 하나일 때 'it' 키워드 사용
//    val printMessage = {message: String -> println("메시지 : $message")}
//    printMessage("Kotlin Lambda")
//
//    val printMessageIt: (String) -> Unit = {println("메시지 (it 사용): $it")}
//    printMessageIt("it 키워드 사용")
//}

// 고차 함수 정의 : calculate 함수는 두 개의 Int와 하나의 람다를 매개변수로 받음
fun caclulate(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    return operation(a, b)
}

fun main(){
    // 람다를 사용하여 덧셈 연산 전달
    val resultNum = caclulate(10, 5) {x, y -> x + y}
    println("덧셈 결과 : $resultNum")

    // 람다를 사용하여 뺄셈 연산 전달
    val subtractNum = caclulate(10,5) {x, y -> x - y}
    println("뺄셈 결과 : $subtractNum")

    // 람다를 사용하여 곱셈 연산 전달
    val multiplyNum = caclulate(10,5) {x, y -> x * y}
    println("곱셈 결과 : $multiplyNum")
}
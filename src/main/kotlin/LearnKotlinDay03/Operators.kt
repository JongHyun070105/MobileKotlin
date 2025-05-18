package LearnKotlinDay03

fun main(){
    var a = 10
    var b = 5

    // 산술 연산자
    println("a + b = ${a + b}") // 덧셈
    println("a - b = ${a - b}") // 뺄셈
    println("a * b = ${a * b}") // 곱셈
    println("a / b = ${a / b}") // 나눗셈
    println("a % b = ${a % b}") // 나머지

//  var a = 10
//  var b = 5

    // 할당 연산자
    a = b       // a에 b의 값을 할당
    a += b      // a에 a + b의 값을 할당
    a -= b      // a에 a - b의 값을 할당
    a *= b      // a에 a * b의 값을 할당
    a /= b      // a에 a / b의 값을 할당
    a %= b      // a에 a % b의 값을 할당


//  var a = 10
//  var b = 5

    // 비교 연산자
    println("a == b = ${a == b}") // false
    println("a != b = ${a != b}") // true
    println("a > b = ${a > b}")   // true
    println("a < b = ${a < b}")   // false
    println("a >= b = ${a >= b}") // true
    println("a <= b = ${a <= b}") // false

    // 논리 연산자
    val x = true
    val y = false

    println("x && y : ${x && y}") // false (AND)
    println("x || y : ${x || y}") // true  (OR)
    println("!x : ${!x}")         // false (NOT)

    // 증감 연산자
    var num = 10
    num++                       // num = num + 1 -> num = 11
    num--                       // num = num - 1 -> num = 10
    println("num : ${num}")     // 10
    println("++num : ${++num}") // 11 (증가 후 출력)
    println("num++ : ${num++}") // 11 (출력 후 증가)
    println("num : ${num}")     // 12
}
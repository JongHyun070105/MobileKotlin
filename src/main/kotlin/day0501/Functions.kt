package day0501

// 간단한 함수 (매개변수, 반환 값 없음)
fun sayHello(){
    println("안녕하세요!")
}

// 매개변수가 있는 함수 (반환 값은 없음)
fun greet(name: String){
    println("${name}님, 반갑습니다!")
}

// 매개변수와 반환 값이 있는 함수
fun add(a: Int, b: Int): Int{
    val sum = a + b
    return sum
}

// 단일 표현식 함수
fun multiply(x: Int, y: Int): Int = x * y

fun main(){
    sayHello()

    greet("홍길동")

    val result = add(5,3)
    println("결과 : ${result}")

    val product = multiply(4,6)
    println("곱셈 결과 : ${product}")
}
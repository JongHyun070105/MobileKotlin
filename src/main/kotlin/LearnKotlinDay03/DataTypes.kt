package LearnKotlinDay03

fun main(){
    // 숫자형
    val age: Int = 20
    val height: Double = 175.2
    val pi = 3.14 // Double 형으로 추론

    // 문자형
    val initial: Char = 'k'

    //불린형
    val isAdult: Boolean = true

    // 문자열
    val name: String = "Kotlin"

    // null 가능형
    var nullableString: String? = "hello"
    nullableString = null

    // 안전 호출 연산자
    val length: Int? = nullableString?.length // null이면 null 반환

    // null 아님 단언 연산자
//    val definitelyNotNull: String = nullableString!! // null이면 NullPointerException 발생
}

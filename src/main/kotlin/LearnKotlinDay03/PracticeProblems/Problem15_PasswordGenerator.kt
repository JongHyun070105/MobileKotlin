package LearnKotlinDay03.PracticeProblems

import java.util.Random

// 문제 설명:
// 길이(Int)를 매개변수로 받아, 주어진 길이의 무작위 암호를 생성하여 반환하는 함수를 작성하세요.
// 암호는 영어 대문자, 소문자, 숫자의 조합으로 구성합니다.
// 함수를 호출하여 결과를 출력하세요.

// 사용 문법:
// 함수, Int 타입, String 타입, 반복문, Random 함수 (선택 사항)

fun generatePassword(length: Int): String {
    val text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val random = Random()
    val password = StringBuilder()

    for (i in 0 until length) {
        val randomIndex = random.nextInt(text.length)
        val randomText = text[randomIndex]
        password.append(randomText)
    }

    return password.toString()
}

fun main() {
    val length = 12 // 생성할 암호 길이
    val password = generatePassword(length)
    println("Generated Password: $password")
}
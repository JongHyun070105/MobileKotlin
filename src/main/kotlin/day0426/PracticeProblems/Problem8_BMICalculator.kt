package day0426.PracticeProblems

// 8. BMI 계산기
// 몸무게(kg)와 키(m)를 변수로 선언하고, BMI를 계산한 뒤 결과에 따라 다음을 출력하세요.
// - BMI < 18.5 : "저체중"
// - 18.5 <= BMI < 25 : "정상"
// - BMI >= 25 : "과체중"

// ✅ BMI 계산 공식
// BMI = 몸무게(kg) / (키(m) * 키(m))

fun main() {
    val weight = 70.0  // 몸무게(kg)
    val height = 1.75  // 키(m)

    val bmi = weight / (height * height)

    if(bmi < 18.5){
        println("저체중")
    } else if(18.5 <= bmi && bmi < 25){
        println("정상")
    } else{
        println("과체중")
    }
}
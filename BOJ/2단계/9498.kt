//시험 점수를 입력받아 90~100점은 A, 80~90점은 B, 70~79점은 C, 60~69점은 D, 나머지 점수는 F를 출력하는 프로그램 작성

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var A:Int = sc.nextInt()
    var score:String
    if(0<=A&&A<=100){
        if(90<=A&&A<=100){
            score = "A"
        }else if(80<=A&&A<=89){
            score ="B"
        }else if(70<=A&&A<=79){
            score = "C"
        }else if(60<=A&&A<=69){
            score = "D"
        }else {
            score = "F"
        }
        print(score)
    }else {
        print("다시 입력.")
        main()
    }
}

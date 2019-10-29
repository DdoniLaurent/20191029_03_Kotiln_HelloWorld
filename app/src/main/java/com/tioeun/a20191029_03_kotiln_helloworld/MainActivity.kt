package com.tioeun.a20191029_03_kotiln_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("코틀린기초","HelloWorld")
        Log.d("코틀린기초","제이름은 구민성입니다.")



        // 1. 변수 num1 초기값

        var num1  = 10
        Log.d("코틀린기초",""+ num1)
         //Log는 내용이 반드시 String이어야함

        // 2. 상수 Pi 로 만들고 초기값 3.14
        val Pi = 3.14
        //val로 만든 상수값 변경 불가
        Log.d("코틀린기초",""+ String.format("%f",Pi))

        // 3. 정수형 변수 num2 만들고 초기값 X 다음 20으로 대입
        var num2 : Int
//        Log.d("코틀린기초",""+ String.format("%d",num2)) //초기화 되지 않는 변수는 컴파일단에서 막힘
        num2 = 20 // -> 미리 타입을 지정해두면, 해당 타입의 값을 나중에 대입 가능
        //num2 = 3.14 -> 타입이 다른 값은 넣을 수 없다
        Log.d("코틀린기초",""+ String.format("%d",num2))

        //코틀린에서는 모든 변수가 참조형 변수이므로, Int같은 기본형으로 추정되는 변수도 메소드/속성을 보유하고 있다.
        num2 = num2.plus(12)
        Log.d("코틀린기초",""+ String.format("%d",num2))

        var num3:Int? = null // ?를 붙이면, 이 변수는 null일 가능성을 내포하고 있다고 알려주는 역할
//        var num4:Int = null  ?를 붙이지 않은 타입의 변수는 null 담기를 거부함
        var num5 = null //애초에 null로 초기화는 가능 대신 타입이 지정되지 않은 상태여야함


    }
}

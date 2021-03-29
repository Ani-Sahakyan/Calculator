package am.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Objects.isNull

class MainActivity : AppCompatActivity(){
    var num1 : Int? = null
    var num2 : Int? = null
    var num1Str = ""
    var num2Str = ""
    var sign = ' '
    var pointDouble= ' '
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val zero = findViewById<Button>(R.id.zero)
        val delete = findViewById<Button>(R.id.delete)
        val answer = findViewById<Button>(R.id.answer)
        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)
        val percent = findViewById<Button>(R.id.percent)
        val point = findViewById<Button>(R.id.point)
        val result = findViewById<TextView>(R.id.result)

        one.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.one){
                when{
                    num1 == null && sign == ' ' && pointDouble == ' ' -> num1 = 1
                    num1 != null && sign == ' '  && pointDouble == ' '  -> num1 = num1!! *10 + 1
                    num2 == null  && pointDouble == ' '  -> num2 = 1
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 1
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "1"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "1"

                }
                    println("num1Str = $num1Str")
                println("num2 = $num2")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        two.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.two){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 2
                    num1 != null && sign == ' '  && pointDouble == ' ' -> num1 = num1!! *10 + 2
                    num2 == null  && pointDouble == ' ' -> num2 = 2
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 2
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "2"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "2"

            }
            println("num1Double = $num1Str")
            println("currentVar = $num2Str")
            when{
                num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                sign != ' ' && pointDouble  == '.' -> result.text = num2Str

            }
        }
        })
        three.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.three){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 3
                    num1 != null && sign == ' ' && pointDouble == ' '  -> num1 = num1!! *10 + 3
                    num2 == null  && pointDouble == ' ' -> num2 = 3
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 3
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "3"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "3"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        four.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.four){
                when{
                    num1 == null && sign == ' ' && pointDouble == ' '  -> num1 = 4
                    num1 != null && sign == ' ' && pointDouble == ' '  -> num1 = num1!! *10 + 4
                    num2 == null  && pointDouble == ' ' -> num2 = 4
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 4
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "4"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "4"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        five.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.five){
                when{
                    num1 == null && sign == ' ' && pointDouble == ' '  -> num1 = 5
                    num1 != null && sign == ' ' && pointDouble == ' '  -> num1 = num1!! *10 + 5
                    num2 == null  && pointDouble == ' ' -> num2 = 5
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 5
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "5"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "5"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        six.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.six){
                when{
                    num1 == null && sign == ' ' && pointDouble == ' '  -> num1 = 6
                    num1 != null && sign == ' ' && pointDouble == ' '  -> num1 = num1!! *10 + 6
                    num2 == null  && pointDouble == ' ' -> num2 = 6
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 6
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "6"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "6"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        seven.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.seven){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 7
                    num1 != null && sign == ' '  && pointDouble == ' ' -> num1 = num1!! *10 + 7
                    num2 == null  && pointDouble == ' ' -> num2 = 7
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 7
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "7"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "7"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        eight.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.eight){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 8
                    num1 != null && sign == ' '  && pointDouble == ' ' -> num1 = num1!! *10 + 8
                    num2 == null  && pointDouble == ' ' -> num2 = 8
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 8
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "8"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "8"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        nine.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.nine){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 9
                    num1 != null && sign == ' '  && pointDouble == ' ' -> num1 = num1!! *10 + 9
                    num2 == null  && pointDouble == ' ' -> num2 = 9
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10 + 9
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "9"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "9"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })
        zero.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.zero){
                when{
                    num1 == null && sign == ' '  && pointDouble == ' ' -> num1 = 0
                    num1 != null && sign == ' '  && pointDouble == ' ' -> num1 = num1!! *10
                    num2 == null  && pointDouble == ' ' -> num2 = 0
                    num2 != null  && pointDouble == ' ' -> num2 = num2!! *10
                    sign == ' ' && pointDouble == '.' -> num1Str = num1Str + "0"
                    sign != ' ' && pointDouble == '.' -> num2Str = num2Str + "0"

                }
                println("num1Double = $num1Str")
                println("currentVar = $num2Str")
                when{
                    num2 == null && pointDouble == ' ' ->  result.text = "$num1"
                    num2 != null && pointDouble == ' ' ->  result.text = "$num2"
                    sign == ' ' && pointDouble  == '.' -> result.text = num1Str
                    sign != ' ' && pointDouble  == '.' -> result.text = num2Str

                }
            }
        })

        plus.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.plus){

                   if(num1 != null && num2 != null && sign != ' ') {
                      num1 = currentResult(num1!!,num2!!,sign)
                      num2 = null
                   }
                if (sign == ' ')
                   result.text = "${result.text} + "
                sign = '+'
                pointDouble = ' '
                }
            println(sign)
            })

        minus.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.minus){

                if(num1 != null && num2 != null && sign != ' ') {
                    num1 =  currentResult(num1!!,num2!!,sign)
                    num2 = null
                }
                if (sign != '-')
                    result.text = "${result.text} - "
                sign = '-'
                pointDouble = ' '
            }
        })

        multiplication.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.multiplication){

                if(num1 != null && num2 != null && sign != ' ') {
                    num1 =  currentResult(num1!!,num2!!,sign)
                    num2 = null
                }
                if (sign != '*')
                    result.text = "${result.text} * "
                sign = '*'
                pointDouble = ' '
            }
        })
        division.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.division){

                if(num1 != null && num2 != null && sign != ' ') {
                    num1 =  currentResult(num1!!,num2!!,sign)
                    num2 = null
                }
                if (sign != '/')
                   result.text = "${result.text} / "
                sign = '/'
                pointDouble = ' '

            }
        })
        percent.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.percent){

                if(num1 != null)
                    result.text = (num1!!.toDouble() / 100).toString()
            }
        })


        delete.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.delete){
                result.text = "0"
                num1Str = ""
                num2Str = ""
                num1 = null
                num2 = null
                sign = ' '
                pointDouble = ' '
            }
        })

        answer.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.answer)
                /*if (sign == '/')resultCalculationDouble(num1?.toDouble(),num2?.toDouble(),sign)
                 else resultCalculation(num1,num2,sign)*/

                when{
                    num1Str.isNotEmpty() && num2Str.isNotEmpty() ->  num1Str = resultCalculationDouble(num1Str.toDouble(),num2Str.toDouble(),sign)
                    num1Str.isNotEmpty() && num2 != null -> num1Str = resultCalculationDouble(num1Str.toDouble(),num2!!.toDouble(),sign)
                    num2Str.isNotEmpty() && num1 != null -> num1Str = resultCalculationDouble(num1!!.toDouble(),num2Str.toDouble(),sign)
                    sign == '/' -> num1Str = resultCalculationDouble(num1?.toDouble(),num2?.toDouble(),sign)
                    else -> resultCalculation(num1,num2,sign)
                }
            num1 = null
            num2 = null
            sign = ' '
        })

        point.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.point) {
                if(pointDouble != '.') {
                    pointDouble = '.'
                    println(" #" + num1Str)
                    if (num1Str == "" && sign == ' ') {
                        num1Str = num1!!.toString() + "."
                        result.text = num1Str
                        println("*" + num1Str)
                    } else {
                        println("++=" + num2!!.toString() + ".")
                        num2Str = num2!!.toString() + "."
                        println("empty" + num2Str)
                        result.text = num2!!.toString() + "."
                    }
                }
            }
        })
    }


    fun resultCalculation(num1 : Int?, num2 : Int?, sign : Char){
      
        when{
            sign == '+' && num1 != null  && num2 != null -> result.text = "${num1+num2}"
            sign == '+' && num1 == null  && num2 != null -> result.text = "${0+num2}"
            sign == '+' && num1 != null  && num2 == null -> result.text = "${num1+num1}"

            sign == '-' && num1 != null  && num2 != null -> result.text = "${num1-num2}"
            sign == '-' && num1 == null  && num2 != null -> result.text = "${0-num2}"
            sign == '-' && num1 != null  && num2 == null -> result.text = "0"

            sign == '*' && num1 != null  && num2 != null -> result.text = "${num1*num2}"
            sign == '*' && num1 == null  && num2 != null -> result.text = "0"
            sign == '*' && num1 != null  && num2 == null -> result.text = "${num1*num1}"
        }

    }

    fun resultCalculationDouble(num1 : Double?, num2 : Double?, sign : Char): String {

        when{
            sign == '/' && num1 != null  && num2 != null -> result.text = "${num1/num2}" ;
            sign == '/' && num1 == null  && num2 != null -> result.text = "0"
            sign == '/' && num1 != null  && num2 == null -> result.text = "0"

            sign == '+' && num1 != null  && num2 != null -> result.text = "${num1+num2}"
            sign == '+' && num1 == null  && num2 != null -> result.text = "${0+num2}"
            sign == '+' && num1 != null  && num2 == null -> result.text = "${num1+num1}"

            sign == '-' && num1 != null  && num2 != null -> result.text = "${num1-num2}"
            sign == '-' && num1 == null  && num2 != null -> result.text = "${0-num2}"
            sign == '-' && num1 != null  && num2 == null -> result.text = "0"

            sign == '*' && num1 != null  && num2 != null -> result.text = "${num1*num2}"
            sign == '*' && num1 == null  && num2 != null -> result.text = "0"
            sign == '*' && num1 != null  && num2 == null -> result.text = "${num1*num1}"
        }

       return result.text.toString()

    }
    fun currentResult(num1 : Int, num2 : Int, sign : Char) : Int {
        when(sign) {
            '+' ->  return num1 + num2
            '-' -> return num1 - num2
            '*' -> return num1 * num2
            '/' -> return num1 / num2
            else -> return 0
        }
    }

  
}
package fallo.fallocalc

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("UNUSED_CHANGED_VALUE", "DEPRECATION")
class MainActivity : AppCompatActivity() {

//  initialization of variables
    private val tag                         = "FalloCalc"
    private var plusClicked                 = false
    private var minusClicked                = false
    private var multipleClicked             = false
    private var divideClicked               = false
    private var isFirstComponent            = true
    private var firstComponentDouble        = 0.0
    private var secondComponentDouble       = 0.0
    private var answer                      = 0.0
    private var nowAnswer                   = "0"
    private var nowSecondAnswer             = "0"
    private var someClicked                 = false
    private var firstPointClicked           = false
    private var secondPointClicked          = false
    private var stringAnswer                = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onZeroClick(view: View) {
        var text = inputView.text.toString()
        text += "0"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "0"
                isFirstComponent = false
                Log.d(tag, "sa = 0")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 0
                Log.d(tag, "fa += 0")
            }
            if (nowAnswer == "0") {
                nowAnswer = "0"
                Log.d(tag, "fa = 0")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 0
                Log.d(tag, "sa += 0")
            }
        }
    }

    fun onPointClick(view: View) {
//        onClick function for point button
//        checking for the first input
        if (isFirstComponent) {
            if(nowAnswer != "0" && !someClicked && !firstPointClicked){
                var text : String  = inputView.text.toString()
                text               += "."
                inputView.text     = text
                firstPointClicked  = true
                nowAnswer          += "."
                Log.d(tag, "fa += .")
            }
        }
        else{
            if (nowSecondAnswer != "0") {
                var text : String   = inputView.text.toString()
                text                += "."
                inputView.text      = text
                nowSecondAnswer     += "."
                secondPointClicked  = true
                Log.d(tag, "sa += .")
        }
        }
    }

    fun onEqualsClick(view: View) {
//        onClick function for equals button
        sum()
    }

    fun onPlusClick(view: View) {
        //onClick function for plus button
        var text = inputView.text.toString()
        text += "+"
        inputView.text = text
        plusClicked = true
        Log.d(tag, "plusClicked = true")
        someClicked = true
    }

    fun onOneClick(view: View) {
//        onClick function for one button
        var text = inputView.text.toString()
        text += "1"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                Log.d(tag, "sa = 1")
                nowSecondAnswer = "1"
                isFirstComponent = false
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 1
                Log.d(tag, "fa += 1")
            }
            if (nowAnswer == "0") {
                nowAnswer = "1"
                Log.d(tag, "fa = 1")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 1
                Log.d(tag, "sa += 1")
            }
        }
    }

    fun onTwoClick(view: View) {
//        onClick function for two button
        var text = inputView.text.toString()
        text += "2"
        inputView.text = text
        if (isFirstComponent) {

            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 2
                Log.d(tag, "fa += 2")
            }
            if (nowAnswer == "0") {
                nowAnswer = "2"
                Log.d(tag, "fa = 1")
            }
            if (someClicked) {
                nowSecondAnswer = "2"
                isFirstComponent = false
                Log.d(tag, "sa = 2")
            }
        }
        else {
            if (someClicked) {
                nowSecondAnswer += 2
                Log.d(tag, "sa += 2")
            }
        }
    }

    fun onThreeClick(view: View) {
//        onClick function for three button
        var text = inputView.text.toString()
        text += "3"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "3"
                isFirstComponent = false
                Log.d(tag, "sa = 3")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 3
                Log.d(tag, "fa += 3")
            }
            if (nowAnswer == "0") {
                nowAnswer = "3"
                Log.d(tag, "fa = 3")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 3
                Log.d(tag, "sa += 3")
            }
        }
    }

    fun onMultipleClick(view: View) {
//        onClick function for multiple button
        var text = inputView.text.toString()
        text += "*"
        inputView.text = text
        multipleClicked = true
        someClicked = true
    }

    fun onFourClick(view: View) {
//        onClick function for four button
        var text = inputView.text.toString()
        text += "4"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "4"
                isFirstComponent = false
                Log.d(tag, "sa = 4")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 4
                Log.d(tag, "fa += 4")
            }
            if (nowAnswer == "0") {
                nowAnswer = "4"
                Log.d(tag, "fa = 4")
            }
        }
        else{
            if (someClicked) {
                Log.d(tag, "sa += 4")
                nowSecondAnswer += 4
            }
        }
    }

    fun onFiveClick(view: View) {
//        onClick function for five button
        var text = inputView.text.toString()
        text += "5"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "5"
                isFirstComponent = false
                Log.d(tag, "sa = 5")
            }
            if(nowAnswer != "0" && !someClicked){
                Log.d(tag, "fa += 5")
                nowAnswer += 5
            }
            if (nowAnswer == "0") {
                nowAnswer = "5"
                Log.d(tag, "fa = 5")
            }

        }
        else{
            if (someClicked) {
                Log.d(tag, "sa += 5")
                nowSecondAnswer += 5
            }
        }
    }

    fun onSixClick(view: View) {
//        onClick function for six button
        var text = inputView.text.toString()
        text += "6"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "6"
                isFirstComponent = false
                Log.d(tag, "sa = 6")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 6
                Log.d(tag, "fa += 6")
            }
            if (nowAnswer == "0") {
                nowAnswer = "6"
                Log.d(tag, "fa = 6")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 6
                Log.d(tag, "sa += 6")
            }
        }
    }

    fun onMinusClick(view: View) {
//        onClick function for minus button
        var text = inputView.text.toString()
        text += "-"
        inputView.text = text
        minusClicked = true
        someClicked = true
    }

    fun onSevenClick(view: View) {
//        onClick function for seven button
        var text = inputView.text.toString()
        text += "7"
        inputView.text = text
        if (isFirstComponent) {
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 7
                Log.d(tag, "fa += 7")
            }
            if (nowAnswer == "0") {
                nowAnswer = "7"
                Log.d(tag, "fa = 7")
            }
            if (someClicked) {
                nowSecondAnswer = "7"
                isFirstComponent = false
                Log.d(tag, "sa = 7")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 7
                Log.d(tag, "sa += 7")
            }
        }
    }

    fun onEightClick(view: View) {
//        onClick function for eight button
        var text = inputView.text.toString()
        text += "8"
        inputView.text = text
        if (isFirstComponent) {

            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 8
                Log.d(tag, "fa += 8")
            }
            if (nowAnswer == "0") {
                nowAnswer = "8"
                Log.d(tag, "fa = 8")
            }

            if (someClicked) {
                nowSecondAnswer = "8"
                isFirstComponent = false
                Log.d(tag, "sa = 8")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 8
                Log.d(tag, "sa += 8")
            }
        }
    }

    fun onNineClick(view: View) {
//        onClick function for nine button
        var text = inputView.text.toString()
        text += "9"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "9"
                isFirstComponent = false
                Log.d(tag, "sa = 9")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 9
                Log.d(tag, "fa += 9")
            }
            if (nowAnswer == "0") {
                nowAnswer = "9"
                Log.d(tag, "fa = 9")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 9
                Log.d(tag, "sa += 9")
            }
        }
    }

    fun onDivideClick(view: View) {
//        onClick function for divide button
        var text = inputView.text.toString()
        text += "/"
        inputView.text = text
        divideClicked = true
        someClicked = true

    }

    fun onDeleteClick(view: View) {
        //onClick function for delete button
        var text = inputView.text.toString()
        text = text.dropLast(1)
        inputView.text = text
        if (isFirstComponent) {
            nowAnswer = nowAnswer.dropLast(1)
        }
        if (!isFirstComponent) {
            nowSecondAnswer = nowSecondAnswer.dropLast(1)
        }
    }

    fun onAllDeleteClick(view: View) {
//        onClick function for allDelete button
        deleteButton.visibility = View.VISIBLE
        view.visibility = View.INVISIBLE
        nowAnswer = "0"
        Log.d(tag, "nowAnswer = $nowAnswer")
        inputView.text = ""
    }

    private fun sum(){
//      function for sum of to numbers
        firstComponentDouble        = nowAnswer.toDouble()
        secondComponentDouble       = nowSecondAnswer.toDouble()
//        set button for deleting all text
        deleteButton.visibility     = View.INVISIBLE
        allDeleteButton.visibility  = View.VISIBLE

        if (plusClicked)      answer = firstComponentDouble + secondComponentDouble

        if (minusClicked)     answer = firstComponentDouble - secondComponentDouble

        if (multipleClicked)  answer = firstComponentDouble * secondComponentDouble

        if (divideClicked)    answer = firstComponentDouble / secondComponentDouble

        Log.d(
            tag,
            "fc: $firstComponentDouble sc: $secondComponentDouble fa: $nowAnswer sa: $nowSecondAnswer a: $answer"
        )

        stringAnswer           = answer.toString()
        if (stringAnswer.drop(stringAnswer.length - 2) == ".0")
            stringAnswer = stringAnswer.dropLast(2)

        inputView.text         = stringAnswer
        divideClicked          = false
        multipleClicked        = false
        minusClicked           = false
        plusClicked            = false
        someClicked            = false
        nowAnswer              = answer.toString()
        nowSecondAnswer        = "0"
        isFirstComponent       = true
        secondComponentDouble  = 0.0
        firstPointClicked      = false
        secondPointClicked     = false
    }
}

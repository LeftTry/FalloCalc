package fallo.fallocalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNUSED_CHANGED_VALUE")
class MainActivity : AppCompatActivity() {

    private val TAG              : String  = "FalloCalc"
    private var plusClicked      : Boolean = false
    private var minusClicked     : Boolean = false
    private var multipleClicked  : Boolean = false
    private var divideClicked    : Boolean = false
    private var isFirstComponent : Boolean = true
    private var firstComponent   : Int     = 0
    private var secondComponent  : Int     = 0
    private var answer           : Int     = 0
    private var nowAnswer        : String  = "0"
    private var nowSecondAnswer  : String  = "0"
    private var someClicked      : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onZeroClick(view: View) {
        var text : String = inputView.text.toString()
        text += "0"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "0"
                isFirstComponent = false
            }
            if (nowAnswer == "0") {
                nowAnswer = "0"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 0
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 0
            }
        }
    }
    fun onPointClick(view: View) {
        var text : String = inputView.text.toString()
        text += "."
        inputView.text = text
    }
    fun onEqualsClick(view: View) {
        firstComponent = nowAnswer.toInt()
        secondComponent = nowSecondAnswer.toInt()
        deleteButton.visibility = View.INVISIBLE
        allDeleteButton.visibility = View.VISIBLE
        if (plusClicked){
            answer = firstComponent + secondComponent
            Log.d(TAG, answer.toString())
            plusClicked = false
            someClicked = false
            secondComponent = 0
            firstComponent = answer
            nowSecondAnswer = "0"
    }
        if (minusClicked){
            answer = firstComponent - secondComponent
            minusClicked = false
            someClicked = false
            secondComponent = 0
            firstComponent = answer
            nowSecondAnswer = "0"
        }
        if (multipleClicked){
            answer = firstComponent * secondComponent
            multipleClicked = false
            someClicked = false
            secondComponent = 0
            firstComponent = answer
            nowSecondAnswer = "0"
        }
        if (divideClicked){
            answer = firstComponent / secondComponent
            divideClicked = false
            someClicked = false
            secondComponent = 0
            firstComponent = answer
            nowSecondAnswer = "0"
        }
        inputView.text = answer.toString()
    }
    fun onPlusClick(view: View) {
        var text : String = inputView.text.toString()
        text += "+"
        inputView.text = text
        plusClicked = true
        someClicked = true
    }
    fun onOneClick(view: View) {
        var text : String = inputView.text.toString()
        text += "1"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "1"
                isFirstComponent = false
            }
            if (nowAnswer == "0") {
                nowAnswer = "1"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 1
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 1
            }
        }
    }
    fun onTwoClick(view: View) {
        var text : String = inputView.text.toString()
        text += "2"
        inputView.text = text
        if (isFirstComponent) {

            if (nowAnswer == "0") {
                nowAnswer = "2"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 2
            }
            if (someClicked) {
                nowSecondAnswer = "2"
                isFirstComponent = false
            }
        }
        else {
            if (someClicked) {
                nowSecondAnswer += 2
            }
        }
    }
    fun onThreeClick(view: View) {
        var text : String = inputView.text.toString()
        text += "3"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "3"
                isFirstComponent = false
            }
            if (nowAnswer == "0") {
                nowAnswer = "3"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 3
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 3
            }
        }
    }
    fun onMultipleClick(view: View) {
        var text : String = inputView.text.toString()
        text += "*"
        inputView.text = text
        multipleClicked = true
        someClicked = true
    }
    fun onFourClick(view: View) {
        var text : String = inputView.text.toString()
        text += "4"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "4"
                isFirstComponent = false
            }
            if (nowAnswer == "0") {
                nowAnswer = "4"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 4
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 4
            }
        }
    }
    fun onFiveClick(view: View) {
        var text : String = inputView.text.toString()
        text += "5"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "5"
                isFirstComponent = false
                Log.d(TAG, "sa = 5")
            }
            if (nowAnswer == "0") {
                nowAnswer = "5"
                Log.d(TAG, "fa = 5")
            }
            if(nowAnswer != "0" && !someClicked){
                Log.d(TAG, "fa += 5")
                nowAnswer += 5
            }
        }
        else{
            if (someClicked) {
                Log.d(TAG, "sa += 5")
                nowSecondAnswer += 5
            }
        }
    }
    fun onSixClick(view: View) {
        var text : String = inputView.text.toString()
        text += "6"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "6"
                isFirstComponent = false
            }
            if (nowAnswer == "0") {
                nowAnswer = "6"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 6
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 6
            }
        }
    }
    fun onMinusClick(view: View) {
        var text : String = inputView.text.toString()
        text += "-"
        inputView.text = text
        minusClicked = true
        someClicked = true
    }
    fun onSevenClick(view: View) {
        var text : String = inputView.text.toString()
        text += "7"
        inputView.text = text
        if (isFirstComponent) {

            if (nowAnswer == "0") {
                nowAnswer = "7"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 7
            }
            if (someClicked) {
                nowSecondAnswer = "7"
                isFirstComponent = false
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 7
            }
        }
    }
    fun onEightClick(view: View) {
        var text : String = inputView.text.toString()
        text += "8"
        inputView.text = text
        if (isFirstComponent) {

            if (nowAnswer == "0") {
                nowAnswer = "8"
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 8
            }
            if (someClicked) {
                nowSecondAnswer = "8"
                isFirstComponent = false
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 8
            }
        }
    }
    fun onNineClick(view: View) {
        var text : String = inputView.text.toString()
        text += "9"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "9"
                isFirstComponent = false
            }
            else {
                if (nowAnswer == "0") {
                    nowAnswer = "9"
                }
                if(nowAnswer != "0" && !someClicked){
                    nowAnswer += 9
                }
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 9
            }
        }
    }
    fun onDivideClick(view: View) {
        var text : String = inputView.text.toString()
        text += "/"
        inputView.text = text
        divideClicked = true
        someClicked = true

    }

    fun onDeleteClick(view: View) {
        var text : String = inputView.text.toString()
        text = text.dropLast(1)
        inputView.text = text
    }

    fun onAllDeleteClick(view: View) {
        deleteButton.visibility = View.VISIBLE
        allDeleteButton.visibility = View.INVISIBLE
        nowAnswer = "0"
        inputView.text = ""
    }
}


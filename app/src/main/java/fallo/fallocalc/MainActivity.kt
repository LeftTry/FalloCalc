package fallo.fallocalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("UNUSED_CHANGED_VALUE", "DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val TAG              = "FalloCalc"
    private var plusClicked      = false
    private var minusClicked     = false
    private var multipleClicked  = false
    private var divideClicked    = false
    private var isFirstComponent = true
    private var firstComponent   = 0
    private var secondComponent  = 0
    private var answer           = 0
    private var nowAnswer        = "0"
    private var nowSecondAnswer  = "0"
    private var someClicked      = false

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
                Log.d(TAG, "sa = 0")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 0
                Log.d(TAG, "fa += 0")
            }
            if (nowAnswer == "0") {
                nowAnswer = "0"
                Log.d(TAG, "fa = 0")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 0
                Log.d(TAG, "sa += 0")
            }
        }
    }
    fun onPointClick(view: View) {
        var text = inputView.text.toString()
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
            plusClicked = false
    }
        if (minusClicked){
            answer = firstComponent - secondComponent
            minusClicked = false
        }
        if (multipleClicked){
            answer = firstComponent * secondComponent
            multipleClicked = false
        }
        if (divideClicked){
            answer = firstComponent / secondComponent
            divideClicked = false
        }
        inputView.text = answer.toString()
        someClicked = false
        secondComponent = 0
        nowAnswer = answer.toString()
        nowSecondAnswer = "0"
        isFirstComponent = true
        Log.d(TAG, "fc: $firstComponent sc: $secondComponent fa: $nowAnswer sa: $nowSecondAnswer a: $answer")
    }
    fun onPlusClick(view: View) {
        var text = inputView.text.toString()
        text += "+"
        inputView.text = text
        plusClicked = true
        Log.d(TAG, "plusClicked = true")
        someClicked = true
    }
    fun onOneClick(view: View) {
        var text = inputView.text.toString()
        text += "1"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                Log.d(TAG, "sa = 1")
                nowSecondAnswer = "1"
                isFirstComponent = false
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 1
                Log.d(TAG, "fa += 1")
            }
            if (nowAnswer == "0") {
                nowAnswer = "1"
                Log.d(TAG, "fa = 1")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 1
                Log.d(TAG, "sa += 1")
            }
        }
    }
    fun onTwoClick(view: View) {
        var text = inputView.text.toString()
        text += "2"
        inputView.text = text
        if (isFirstComponent) {

            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 2
                Log.d(TAG, "fa += 2")
            }
            if (nowAnswer == "0") {
                nowAnswer = "2"
                Log.d(TAG, "fa = 1")
            }
            if (someClicked) {
                nowSecondAnswer = "2"
                isFirstComponent = false
                Log.d(TAG, "sa = 2")
            }
        }
        else {
            if (someClicked) {
                nowSecondAnswer += 2
                Log.d(TAG, "sa += 2")
            }
        }
    }
    fun onThreeClick(view: View) {
        var text = inputView.text.toString()
        text += "3"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "3"
                isFirstComponent = false
                Log.d(TAG, "sa = 3")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 3
                Log.d(TAG, "fa += 3")
            }
            if (nowAnswer == "0") {
                nowAnswer = "3"
                Log.d(TAG, "fa = 3")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 3
                Log.d(TAG, "sa += 3")
            }
        }
    }
    fun onMultipleClick(view: View) {
        var text = inputView.text.toString()
        text += "*"
        inputView.text = text
        multipleClicked = true
        someClicked = true
    }
    fun onFourClick(view: View) {
        var text = inputView.text.toString()
        text += "4"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "4"
                isFirstComponent = false
                Log.d(TAG, "sa = 4")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 4
                Log.d(TAG, "fa += 4")
            }
            if (nowAnswer == "0") {
                nowAnswer = "4"
                Log.d(TAG, "fa = 4")
            }
        }
        else{
            if (someClicked) {
                Log.d(TAG, "sa += 4")
                nowSecondAnswer += 4
            }
        }
    }
    fun onFiveClick(view: View) {
        var text = inputView.text.toString()
        text += "5"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "5"
                isFirstComponent = false
                Log.d(TAG, "sa = 5")
            }
            if(nowAnswer != "0" && !someClicked){
                Log.d(TAG, "fa += 5")
                nowAnswer += 5
            }
            if (nowAnswer == "0") {
                nowAnswer = "5"
                Log.d(TAG, "fa = 5")
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
        var text = inputView.text.toString()
        text += "6"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "6"
                isFirstComponent = false
                Log.d(TAG, "sa = 6")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 6
                Log.d(TAG, "fa += 6")
            }
            if (nowAnswer == "0") {
                nowAnswer = "6"
                Log.d(TAG, "fa = 6")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 6
                Log.d(TAG, "sa += 6")
            }
        }
    }
    fun onMinusClick(view: View) {
        var text = inputView.text.toString()
        text += "-"
        inputView.text = text
        minusClicked = true
        someClicked = true
    }
    fun onSevenClick(view: View) {
        var text = inputView.text.toString()
        text += "7"
        inputView.text = text
        if (isFirstComponent) {
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 7
                Log.d(TAG, "fa += 7")
            }
            if (nowAnswer == "0") {
                nowAnswer = "7"
                Log.d(TAG, "fa = 7")
            }
            if (someClicked) {
                nowSecondAnswer = "7"
                isFirstComponent = false
                Log.d(TAG, "sa = 7")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 7
                Log.d(TAG, "sa += 7")
            }
        }
    }
    fun onEightClick(view: View) {
        var text = inputView.text.toString()
        text += "8"
        inputView.text = text
        if (isFirstComponent) {

            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 8
                Log.d(TAG, "fa += 8")
            }
            if (nowAnswer == "0") {
                nowAnswer = "8"
                Log.d(TAG, "fa = 8")
            }

            if (someClicked) {
                nowSecondAnswer = "8"
                isFirstComponent = false
                Log.d(TAG, "sa = 8")
            }
        }
        else{
            if (someClicked) {
                nowSecondAnswer += 8
                Log.d(TAG, "sa += 8")
            }
        }
    }
    fun onNineClick(view: View) {
        var text = inputView.text.toString()
        text += "9"
        inputView.text = text
        if (isFirstComponent) {
            if (someClicked) {
                nowSecondAnswer = "9"
                isFirstComponent = false
                Log.d(TAG, "sa = 9")
            }
            if(nowAnswer != "0" && !someClicked){
                nowAnswer += 9
                Log.d(TAG, "fa += 9")
            }
            if (nowAnswer == "0") {
                nowAnswer = "9"
                Log.d(TAG, "fa = 9")
            }

        }
        else{
            if (someClicked) {
                nowSecondAnswer += 9
                Log.d(TAG, "sa += 9")
            }
        }
    }
    fun onDivideClick(view: View) {
        var text = inputView.text.toString()
        text += "/"
        inputView.text = text
        divideClicked = true
        someClicked = true

    }

    fun onDeleteClick(view: View) {
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
        deleteButton.visibility = View.VISIBLE
        view.visibility = View.INVISIBLE
        nowAnswer = "0"
        Log.d(TAG, "nowAnswer = $nowAnswer")
        inputView.text = ""
    }
}


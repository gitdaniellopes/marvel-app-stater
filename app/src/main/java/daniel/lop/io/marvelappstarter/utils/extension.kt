package daniel.lop.io.marvelappstarter.utils

import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.toast(message: String, duration: Int = Toast.LENGTH_LONG){
    Toast.makeText(
    requireContext(),
        message,
        duration).show()
}

fun View.show(){
    visibility = View.VISIBLE
}

fun View.hide(){
    visibility = View.INVISIBLE
}

fun View.gone(){
    visibility = View.GONE
}

fun String.LimitDescription(character: Int): String{
    if (this.length > character){
        val firstCharacter = 0
        return "${this.substring(firstCharacter, character)}"
    }
    return this
}
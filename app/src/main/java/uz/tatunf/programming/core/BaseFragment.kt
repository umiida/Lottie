package uz.tatunf.programming.core

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.koin.android.ext.android.inject
import uz.tatunf.programming.Settings

open class BaseFragment(resId: Int) : Fragment(resId) {

    protected val settings: Settings by inject()

    fun toastSH(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun toastLN(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    protected fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = activity.currentFocus
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

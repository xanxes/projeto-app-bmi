package br.senai.sp.jandira.imc20.utils

import android.content.Context
import br.senai.sp.jandira.imc20.R
import kotlin.math.pow

fun getBmi(weight : Int, height : Float): Float {
    return weight / height.pow(2)
}

fun getStatusBmi(bmi : Double, context: Context): String {
    var status = ""

    if (bmi < 18.5) {
        status = context.getString(R.string.below_weight)
    } else if (bmi < 25) {
        status = context.getString(R.string.normal_weight)
    } else if (bmi < 30) {
        status = context.getString(R.string.slightly_above_weight)
    } else if (bmi < 35) {
        status = context.getString(R.string.obesity_I)
    } else if (bmi < 40) {
        status = context.getString(R.string.obesity_II)
    } else {
        status = context.getString(R.string.obesity_III)
    }

    return status
}
package com.ericho.example


fun IntArray.toFloatArray(): FloatArray {
    val res = FloatArray(this.size)
    for ((index, ni) in this.withIndex()) {
        res[index] = ni.toFloat()
    }
    return res
}
package com.ericho.example.color_matrix1

import android.graphics.ColorMatrix
import com.ericho.example.toFloatArray

val redFloatArray = intArrayOf(
    1, 1, 1, 0, 0,
    0, 0, 0, 0, 0,
    0, 0, 0, 0, 0,
    0, 0, 0, 1, 0
).toFloatArray()
val greenFloatArray = intArrayOf(
    0, 0, 0, 0, 0,
    1, 1, 1, 0, 0,
    0, 0, 0, 0, 0,
    0, 0, 0, 1, 0
).toFloatArray()
val blueFloatArray = intArrayOf(
    0, 0, 0, 0, 0,
    0, 0, 0, 0, 0,
    1, 1, 1, 0, 0,
    0, 0, 0, 1, 0
).toFloatArray()
val evenGreyScaleFloatArray = floatArrayOf(
    0.33f, 0.33f, 0.33f, 0f, 0f,
    0.33f, 0.33f, 0.33f, 0f, 0f,
    0.33f, 0.33f, 0.33f, 0f, 0f,
    0f, 0f, 0f, 1f, 0f
)
val invertColorFloatArray = intArrayOf(
    -1, 0, 0, 0, 255,
    0, -1, 0, 0, 255,
    0, 0, -1, 0, 255,
    0, 0, 0, 1, 0
).toFloatArray()

val emptyFloatArray = intArrayOf(
    1, 0, 0, 0, 0,
    0, 1, 0, 0, 0,
    0, 0, 1, 0, 0,
    0, 0, 0, 1, 0
).toFloatArray()

fun FloatArray.toColorMatrix(): ColorMatrix = ColorMatrix(this)
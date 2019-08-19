package com.ericho.example

import android.app.Application
import android.graphics.ColorMatrix
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class ColorMatrixViewModel(app: Application) : AndroidViewModel(app) {

    val imageColorMatrix: ObservableField<ColorMatrix> = ObservableField()

    fun onBtn1Click(view: View) {
        val matrix = floatArrayOf(
            1f, 1f, 1f, 0f, 0f,
            1f, 1f, 1f, 0f, 0f,
            1f, 1f, 1f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
        imageColorMatrix.set(redFloatArray.toColorMatrix())
    }

    fun onBtn2Click(view: View) {

        imageColorMatrix.set(blueFloatArray.toColorMatrix())
    }

    fun onBtn3Click(view: View) {
        imageColorMatrix.set(greenFloatArray.toColorMatrix())
    }

    fun onBtn4Click(view: View) {
        imageColorMatrix.set(invertColorFloatArray.toColorMatrix())
    }

    fun onImageClick(view: View) {
        imageColorMatrix.set(emptyFloatArray.toColorMatrix())
    }


    private val redFloatArray = intArrayOf(
        1, 1, 1, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 1, 0
    ).toFloatArray()
    private val greenFloatArray = intArrayOf(
        0, 0, 0, 0, 0,
        1, 1, 1, 0, 0,
        0, 0, 0, 0, 0,
        0, 0, 0, 1, 0
    ).toFloatArray()
    private val blueFloatArray = intArrayOf(
        0, 0, 0, 0, 0,
        0, 0, 0, 0, 0,
        1, 1, 1, 0, 0,
        0, 0, 0, 1, 0
    ).toFloatArray()
    private val evenGreyScaleFloatArray = floatArrayOf(
        0.33f, 0.33f, 0.33f, 0f, 0f,
        0.33f, 0.33f, 0.33f, 0f, 0f,
        0.33f, 0.33f, 0.33f, 0f, 0f,
        0f, 0f, 0f, 1f, 0f
    )
    private val invertColorFloatArray = intArrayOf(
        -1, 0, 0, 0, 255,
        0, -1, 0, 0, 255,
        0, 0, -1, 0, 255,
        0, 0, 0, 1, 0
    ).toFloatArray()

    private val emptyFloatArray = intArrayOf(
        1, 0, 0, 0, 0,
        0, 1, 0, 0, 0,
        0, 0, 1, 0, 0,
        0, 0, 0, 1, 0
    ).toFloatArray()
    private fun FloatArray.toColorMatrix(): ColorMatrix = ColorMatrix(this)
}
package com.ericho.example.color_matrix1

import android.app.Application
import android.graphics.ColorMatrix
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class ColorMatrixViewModel(app: Application) : AndroidViewModel(app) {

    val imageColorMatrix: ObservableField<ColorMatrix> = ObservableField()

    fun onImageClick(view: View) {
        imageColorMatrix.set(emptyFloatArray.toColorMatrix())
    }


}
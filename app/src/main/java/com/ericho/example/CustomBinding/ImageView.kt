package com.ericho.example.CustomBinding

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:colorFilterMatrix")
fun setColorFilterMatrix(imageView: ImageView, matrix: ColorMatrix?) {
    if (matrix != null)
        imageView.colorFilter = ColorMatrixColorFilter(matrix)
}
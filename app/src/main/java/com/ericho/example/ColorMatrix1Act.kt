package com.ericho.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ericho.example.databinding.ActColorMatrix1Binding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ColorMatrix1Act : AppCompatActivity() {

    val vm: ColorMatrixViewModel by viewModel<ColorMatrixViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_color_matrix1)
        val b: ActColorMatrix1Binding = DataBindingUtil.setContentView(this, R.layout.act_color_matrix1)
        b.lifecycleOwner = this
        b.vm = vm
    }
}
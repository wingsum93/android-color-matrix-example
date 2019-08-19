package com.ericho.example

import com.ericho.example.color_matrix1.ColorMatrixViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appMainModule = module {
    viewModel { ColorMatrixViewModel(get()) }


}
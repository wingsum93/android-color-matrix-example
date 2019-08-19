package com.ericho.example

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appMainModule = module {
    viewModel { ColorMatrixViewModel(get()) }


}
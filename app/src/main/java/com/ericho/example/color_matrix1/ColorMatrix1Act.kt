package com.ericho.example.color_matrix1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.ericho.example.R
import com.ericho.example.databinding.ActColorMatrix1Binding
import com.ericho.example.model.ColorFilterAction
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class ColorMatrix1Act : AppCompatActivity() {

    val vm: ColorMatrixViewModel by viewModel<ColorMatrixViewModel>()
    private lateinit var adapter: ColorAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_color_matrix1)
        val b: ActColorMatrix1Binding = DataBindingUtil.setContentView(
            this,
            R.layout.act_color_matrix1
        )
        b.lifecycleOwner = this
        b.vm = vm
        b.recyclerView.adapter = ColorAdapter(getColorFilterAction()).also { adapter = it }
        b.recyclerView.layoutManager = GridLayoutManager(this, 2)

        adapter.setOnColorFilterClickListener {
            Timber.d("setOnColorFilterClickListener")
            vm.imageColorMatrix.set(it.toColorMatrix())
        }
    }

    private fun getColorFilterAction(): List<ColorFilterAction> {
        val res = ArrayList<ColorFilterAction>()
        res += ColorFilterAction("Green", greenFloatArray)
        res += ColorFilterAction("Red", redFloatArray)
        res += ColorFilterAction("Blue", blueFloatArray)
        res += ColorFilterAction("EvenGrey", evenGreyScaleFloatArray)
        res += ColorFilterAction("invertColor", invertColorFloatArray)

        return res
    }
}
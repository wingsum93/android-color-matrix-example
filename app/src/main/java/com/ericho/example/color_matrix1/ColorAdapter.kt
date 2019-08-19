package com.ericho.example.color_matrix1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ericho.example.databinding.RowColorFilterBinding
import com.ericho.example.model.ColorFilterAction
import timber.log.Timber


class ColorAdapter(
    private val items: List<ColorFilterAction>
) : RecyclerView.Adapter<ColorAdapter.Holder>(), OnColorFilterClickListener {

    private var onItemClickListener: ((FloatArray) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val b: RowColorFilterBinding = RowColorFilterBinding.inflate(inflater, parent, false)
        return Holder(b)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onColorFilterClick(arr: FloatArray) {
        onItemClickListener?.invoke(arr)
        Timber.d("onColorFilterClick")
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        val i = items[position]
        holder.bind(i)
        holder.binding.listener = this
    }

    fun setOnColorFilterClickListener(block: ((FloatArray) -> Unit)) {
        this.onItemClickListener = block
    }

    class Holder(val binding: RowColorFilterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ColorFilterAction) {
            binding.item = item
            binding.executePendingBindings()
        }
    }
}
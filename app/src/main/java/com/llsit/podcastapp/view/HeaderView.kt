package com.llsit.podcastapp.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.llsit.podcastapp.databinding.ViewHeaderBinding

class HeaderView : FrameLayout {
    private val binding: ViewHeaderBinding by lazy {
        ViewHeaderBinding.inflate(LayoutInflater.from(context), this, false)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        addView(binding.root)
    }

    fun setOnClick(block: () -> Unit) {
        binding.avatarHeader.setOnClickListener {
            block.invoke()
        }
    }
}

package com.naveed.myandroidapp.view.adapter

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

/**
 * This bindingAdapter is applied to methods that are used to manipulate values that are set to views.
 */
@BindingAdapter("visible")
fun View.visible(visible: Boolean){
    isVisible = visible
}
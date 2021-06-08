package com.smile.mvvmtemplate.presentation.base.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.smile.mvvmtemplate.databinding.ItemLoadingRowBinding

class LoadingStateAdapter : LoadStateAdapter<LoadingStateViewHolder>() {

    override fun onBindViewHolder(holder: LoadingStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): LoadingStateViewHolder {
        val itemBinding =
            ItemLoadingRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoadingStateViewHolder(itemBinding)
    }

}
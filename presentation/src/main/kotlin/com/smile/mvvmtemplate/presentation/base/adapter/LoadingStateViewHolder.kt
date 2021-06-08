package com.smile.mvvmtemplate.presentation.base.adapter

import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.smile.mvvmtemplate.databinding.ItemLoadingRowBinding

class LoadingStateViewHolder(private val itemBinding: ItemLoadingRowBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(loadState: LoadState) {
        itemBinding.itemLoadingRowContainer.isVisible = loadState is LoadState.Loading
    }

}
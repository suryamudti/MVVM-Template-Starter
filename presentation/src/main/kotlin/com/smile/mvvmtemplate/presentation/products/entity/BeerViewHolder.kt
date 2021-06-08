package com.smile.mvvmtemplate.presentation.products.entity

import androidx.recyclerview.widget.RecyclerView
import com.smile.mvvmtemplate.databinding.ItemProductBinding
import com.smile.mvvmtemplate.presentation.extension.load

class BeerViewHolder(val itemBinding: ItemProductBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(beer: BeerUI) = with(itemView) {
        itemBinding.itemProductContainer.transitionName = beer.id.toString()
        itemBinding.itemProductIdTxv.text = beer.id.toString()
        itemBinding.itemProductImv.load(beer.imageUrl)
        itemBinding.itemProductNameTxv.text = beer.name
        itemBinding.itemProductAbvTxv.text = beer.abv.toString()
        //itemBinding.itemProductTypeTxv.text = beer.type
    }

}
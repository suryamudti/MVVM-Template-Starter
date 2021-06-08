package com.smile.mvvmtemplate.presentation.products.productlist

import android.view.View
import com.smile.mvvmtemplate.presentation.base.adapter.BasePagedListAdapter
import com.smile.mvvmtemplate.presentation.base.adapter.RecyclerItem
import com.smile.mvvmtemplate.presentation.products.entity.BeerCell

class ProductsListAdapter(onItemClick: (RecyclerItem, View) -> Unit) : BasePagedListAdapter(
    BeerCell,
    onItemClick = onItemClick
)
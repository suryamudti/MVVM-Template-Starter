package com.smile.mvvmtemplate.presentation.products.entity

import com.smile.mvvmtemplate.domain.base.mapper.Mapper
import com.smile.mvvmtemplate.domain.products.entity.Beer

class BeerMapper : Mapper<Beer, BeerUI> {

    override fun mapLeftToRight(obj: Beer): BeerUI = with(obj) {
        BeerUI(
            id = id,
            name = name,
            tagline = tagline,
            description = description,
            imageUrl = imageUrl,
            abv = abv
        )
    }

}
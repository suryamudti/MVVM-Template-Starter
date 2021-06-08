package com.smile.mvvmtemplate.data.products.entity

import com.smile.mvvmtemplate.domain.base.mapper.Mapper
import com.smile.mvvmtemplate.domain.products.entity.Beer

class BeerMapper : Mapper<BeerResponse, Beer> {

    override fun mapLeftToRight(obj: BeerResponse): Beer = with(obj) {
        Beer(
            id = id,
            name = name,
            tagline = tagline,
            description = description,
            imageUrl = imageUrl,
            abv = abv
        )
    }

}
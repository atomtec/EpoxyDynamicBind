package com.f11.epoxytrial

import com.airbnb.epoxy.TypedEpoxyController

class CompositeController : TypedEpoxyController<List<CompositeItem>>() {
    override fun buildModels(data: List<CompositeItem>) {
        data.forEach { item ->
            CompositeItemModel_()
                .id(item.id)
                .headerText("Header for Item ${item.id}")
                .footerText("Footer for Item ${item.id}")
                .content(item.content)
                .addTo(this)
        }
    }
}


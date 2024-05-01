package com.f11.epoxytrial

import com.airbnb.epoxy.EpoxyController

class SimpleController : EpoxyController() {
    var items: List<String> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        items.forEachIndexed { index, title ->
            SimpleItemModel_()
                .id(index)
                .title(title)
                .addTo(this)
        }
    }
}

package com.f11.epoxytrial

import com.airbnb.epoxy.TypedEpoxyController

class CompositeController : TypedEpoxyController<List<CompositeItem>>() {
    override fun buildModels(data: List<CompositeItem>) {
        data.forEach { item ->
            when (item.type) {
                0 -> {
                    // Add TextView and EditText
                    TextViewModel_()
                        .id("text_${item.id}")
                        .text(item.text)
                        .addTo(this)

                    EditTextModel_()
                        .id("edit_${item.id}")
                        .text(item.text)
                        .addTo(this)
                }
                1 -> {
                    // Add TextView and ImageView
                    TextViewModel_()
                        .id("text_${item.id}")
                        .text(item.text)
                        .addTo(this)

                    item.imageRes?.let {
                        ImageViewModel_()
                            .id("image_${item.id}")
                            .imageRes(it)
                            .addTo(this)
                    }
                }
                2 -> {
                    // Add TextView, EditText, and ImageView
                    TextViewModel_()
                        .id("text_${item.id}")
                        .text(item.text)
                        .addTo(this)

                    EditTextModel_()
                        .id("edit_${item.id}")
                        .text(item.text)
                        .addTo(this)

                    item.imageRes?.let {
                        ImageViewModel_()
                            .id("image_${item.id}")
                            .imageRes(it)
                            .addTo(this)
                    }
                }
            }
        }
    }
    }


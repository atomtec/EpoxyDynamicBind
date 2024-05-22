package com.f11.epoxytrial

import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.TypedEpoxyController

class CombinedController : TypedEpoxyController<List<CombinedItem>>() {
    override fun buildModels(data: List<CombinedItem>?) {
        data?.forEach { item ->
            // Top model
            ListItemModel_()
                .id("top_${item.id}")
                .text1(item.topText1)
                .text2(item.topText2)
                .imageRes(item.topImageRes)
                .addTo(this)

            // Middle models based on type
            when (item.type) {
                0 -> {
                    ImageViewModel_()
                        .id("middle_image_${item.id}")
                        .imageRes(item.middleImageRes)
                        .addTo(this)
                }
                1 -> {
                    SimpleItemModel_()
                        .id("middle_simple_${item.id}")
                        .title(item.middleText1)
                        .addTo(this)

                    EditTextModel_()
                        .id("middle_edit_${item.id}")
                        .text(item.middleText2)
                        .addTo(this)
                }
                2 -> {
                    SimpleItemModel_()
                        .id("middle_simple_${item.id}")
                        .title(item.middleText1)
                        .addTo(this)

                    ImageViewModel_()
                        .id("middle_image_${item.id}")
                        .imageRes(item.middleImageRes)
                        .addTo(this)
                }
            }

            // Bottom model
            HorizontalChainIconsModel_()
                .id("bottom_${item.id}")
                .icon1Res(item.bottomIcon1)
                .icon2Res(item.bottomIcon2)
                .icon3Res(item.bottomIcon3)
                .icon4Res(item.bottomIcon4)
                .addTo(this)
        }
    }
}
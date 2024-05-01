package com.f11.epoxytrial

import com.airbnb.epoxy.EpoxyController

class MyController(private val image1Click: (() -> Unit)) : EpoxyController() {
    var data: List<Any> = emptyList()  // Can be a sealed class or a common interface if types vary
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        data.forEachIndexed { index, item ->
            when (item) {
                is SimpleItem -> SimpleItemModel_()
                    .id(index)
                    .title(item.title)
                    .addTo(this)
                is ComplexItem -> ComplexItemModel_()
                    .id(index)
                    .text1(item.text1)
                    .text2(item.text2)
                    .text3(item.text3)
                    .text4(item.text4)
                    .imageRes1(item.imageRes1)
                    .imageRes2(item.imageRes2)
                    .addTo(this)
                is ComplexItem2 -> ComplexItemModel2_()
                    .id(index)
                    .image1Click(image1Click)
                    .text1(item.text1)
                    .text2(item.text2)
                    .text3(item.text3)
                    .text4(item.text4)
                    .imageRes1(item.imageRes1)
                    .imageRes2(item.imageRes2)
                    .showText1(item.showText1)
                    .showText3(item.showText3)
                    .addTo(this)
            }
        }
    }
}


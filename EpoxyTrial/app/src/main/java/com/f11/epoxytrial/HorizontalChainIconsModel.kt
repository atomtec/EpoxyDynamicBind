package com.f11.epoxytrial

import android.view.View
import android.widget.ImageView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class HorizontalChainIconsModel : EpoxyModelWithHolder<HorizontalChainIconsModel.Holder>() {

    @EpoxyAttribute
    var icon1Res: Int = 0

    @EpoxyAttribute
    var icon2Res: Int = 0

    @EpoxyAttribute
    var icon3Res: Int = 0

    @EpoxyAttribute
    var icon4Res: Int = 0

    override fun bind(holder: Holder) {
        holder.icon1.setImageResource(icon1Res)
        holder.icon2.setImageResource(icon2Res)
        holder.icon3.setImageResource(icon3Res)
        holder.icon4.setImageResource(icon4Res)
    }

    class Holder : EpoxyHolder() {
        lateinit var icon1: ImageView
        lateinit var icon2: ImageView
        lateinit var icon3: ImageView
        lateinit var icon4: ImageView

        override fun bindView(itemView: View) {
            icon1 = itemView.findViewById(R.id.icon1)
            icon2 = itemView.findViewById(R.id.icon2)
            icon3 = itemView.findViewById(R.id.icon3)
            icon4 = itemView.findViewById(R.id.icon4)
        }
    }

    override fun getDefaultLayout() = R.layout.horizontal_chain_icons
}
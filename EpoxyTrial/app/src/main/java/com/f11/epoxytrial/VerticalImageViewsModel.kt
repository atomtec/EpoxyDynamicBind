package com.f11.epoxytrial



import android.view.View
import android.widget.ImageView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder


abstract class VerticalImageViewsModel : EpoxyModelWithHolder<VerticalImageViewsModel.Holder>() {

    @EpoxyAttribute
    var image1Res: Int = 0

    @EpoxyAttribute
    var image2Res: Int = 0

    override fun getDefaultLayout(): Int {
        return R.layout.vertical_image_views
    }

    override fun bind(holder: Holder) {
        holder.imageView1.setImageResource(image1Res)
        holder.imageView2.setImageResource(image2Res)
    }

    class Holder : EpoxyHolder() {
        lateinit var imageView1: ImageView
        lateinit var imageView2: ImageView

        override fun bindView(itemView: View) {
            imageView1 = itemView.findViewById(R.id.imageView1)
            imageView2 = itemView.findViewById(R.id.imageView2)
        }
    }
}

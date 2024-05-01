package com.f11.epoxytrial

import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class ImageViewModel : EpoxyModelWithHolder<ImageViewHolder>() {
    @EpoxyAttribute
    @DrawableRes
    var imageRes: Int = 0  // Image resource ID attribute

    override fun bind(holder: ImageViewHolder) {
        super.bind(holder)
        holder.imageView.setImageResource(imageRes)
    }

    override fun getDefaultLayout(): Int {
        return R.layout.model_image_view
    }
}

class ImageViewHolder : EpoxyHolder() {
    lateinit var imageView: ImageView

    override fun bindView(itemView: View) {
        imageView = itemView.findViewById(R.id.image_view)
    }
}

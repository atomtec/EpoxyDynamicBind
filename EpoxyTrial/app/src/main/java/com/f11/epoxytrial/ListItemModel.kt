package com.f11.epoxytrial


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class ListItemModel : EpoxyModelWithHolder<ListItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var text1: String

    @EpoxyAttribute
    lateinit var text2: String

    @EpoxyAttribute
    @DrawableRes
    var imageRes: Int = 0

    override fun bind(holder: Holder) {
        holder.textView1.text = text1
        holder.textView2.text = text2
        holder.imageView.setImageResource(imageRes)
    }

    class Holder : EpoxyHolder() {
        lateinit var textView1: TextView
        lateinit var textView2: TextView
        lateinit var imageView: ImageView

        override fun bindView(itemView: View) {
            textView1 = itemView.findViewById(R.id.textView1)
            textView2 = itemView.findViewById(R.id.textView2)
            imageView = itemView.findViewById(R.id.imageView)
        }
    }

    override fun getDefaultLayout() = R.layout.list_item_view
}

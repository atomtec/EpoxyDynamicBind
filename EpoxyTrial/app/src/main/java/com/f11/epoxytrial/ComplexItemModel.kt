package com.f11.epoxytrial

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class ComplexItemModel : EpoxyModelWithHolder<ComplexItemModelHolder>() {

    @EpoxyAttribute
    lateinit var text1: String
    @EpoxyAttribute
    lateinit var text2: String
    @EpoxyAttribute
    lateinit var text3: String
    @EpoxyAttribute
    lateinit var text4: String
    @EpoxyAttribute
    var imageRes1: Int = 0
    @EpoxyAttribute
    var imageRes2: Int = 0

    override fun bind(holder: ComplexItemModelHolder) {
        holder.textView1.text = text1
        holder.textView2.text = text2
        holder.textView3.text = text3
        holder.textView4.text = text4
        holder.imageView1.setImageResource(imageRes1)
        holder.imageView2.setImageResource(imageRes2)
    }


    override fun getDefaultLayout(): Int {
        return R.layout.item_complex
    }
}

class ComplexItemModelHolder : EpoxyHolder() {
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView

    override fun bindView(itemView: View) {
        textView1 = itemView.findViewById(R.id.text_view_1)
        textView2 = itemView.findViewById(R.id.text_view_2)
        textView3 = itemView.findViewById(R.id.text_view_3)
        textView4 = itemView.findViewById(R.id.text_view_4)
        imageView1 = itemView.findViewById(R.id.image_view_1)
        imageView2 = itemView.findViewById(R.id.image_view_2)
    }
}
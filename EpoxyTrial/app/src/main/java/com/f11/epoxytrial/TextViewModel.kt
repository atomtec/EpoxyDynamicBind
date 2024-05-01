package com.f11.epoxytrial

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class TextViewModel : EpoxyModelWithHolder<TextViewHolder>() {
    @EpoxyAttribute
    lateinit var text: String // Dynamic text attribute

    override fun bind(holder: TextViewHolder) {
        super.bind(holder)
        holder.textView.text = text  // Set text dynamically
    }

    override fun getDefaultLayout(): Int {
        return R.layout.model_text_view
    }
}

class TextViewHolder : EpoxyHolder() {
    lateinit var textView: TextView

    override fun bindView(itemView: View) {
        textView = itemView.findViewById(R.id.text_view)
    }
}

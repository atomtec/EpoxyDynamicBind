package com.f11.epoxytrial

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class SimpleItemModel : EpoxyModelWithHolder<Holder>() {

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: Holder) {
        holder.title.text = title
    }

    override fun getDefaultLayout(): Int {
        return R.layout.model_simple_item
    }
}

class Holder : EpoxyHolder() {
    lateinit var title: TextView

    override fun bindView(itemView: View) {
        title = itemView.findViewById(R.id.text_view_title)
    }
}
package com.f11.epoxytrial

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class CompositeItemModel : EpoxyModelWithHolder<CompositeItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var headerText: String

    @EpoxyAttribute
    lateinit var footerText: String

    @EpoxyAttribute
    lateinit var content: List<ContentItem>

    override fun bind(holder: Holder) {
        holder.headerTextView.text = headerText
        holder.footerTextView.text = footerText

        // Clear any existing views in the container
        holder.contentContainer.removeAllViews()

        // Dynamically add views to the container
        content.forEach { item ->
            when (item) {
                is ContentItem.TextItem -> {
                    val textView = TextView(holder.contentContainer.context).apply {
                        text = item.text
                    }
                    holder.contentContainer.addView(textView)
                }
                is ContentItem.ImageItem -> {
                    val imageView = ImageView(holder.contentContainer.context).apply {
                        setImageResource(item.imageRes)
                    }
                    holder.contentContainer.addView(imageView)
                }
                // Add more cases as needed
            }
        }
    }

    class Holder : EpoxyHolder() {
        lateinit var headerTextView: TextView
        lateinit var footerTextView: TextView
        lateinit var contentContainer: ConstraintLayout

        override fun bindView(itemView: View) {
            headerTextView = itemView.findViewById(R.id.headerTextView)
            footerTextView = itemView.findViewById(R.id.footerTextView)
            contentContainer = itemView.findViewById(R.id.contentContainer)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.model_composite_item
    }
}

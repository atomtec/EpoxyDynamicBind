package com.f11.epoxytrial

import android.view.View
import android.widget.EditText
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass
abstract class EditTextModel : EpoxyModelWithHolder<EditTextHolder>() {
    @EpoxyAttribute
    var text: String? = null  // Optional text attribute

    override fun bind(holder: EditTextHolder) {
        super.bind(holder)
        holder.editText.setText(text)
    }

    override fun getDefaultLayout(): Int {
        return R.layout.model_edit_text
    }
}

class EditTextHolder : EpoxyHolder() {
    lateinit var editText: EditText

    override fun bindView(itemView: View) {
        editText = itemView.findViewById(R.id.edit_text)
    }
}

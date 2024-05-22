package com.f11.epoxytrial


import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyModelGroup

class DynamicModelGroup(
    id: Long,
    models: List<EpoxyModel<*>>
) : EpoxyModelGroup(id.toInt(), models) {

    private val mutableModels = models.toMutableList()

    override fun addModel(model: EpoxyModel<*>) {
        mutableModels.add(model)
        setModels(mutableModels)
    }

    fun removeModel(model: EpoxyModel<*>) {
        mutableModels.remove(model)
        setModels(mutableModels)
    }

    fun clearModels() {
        mutableModels.clear()
        setModels(mutableModels)
    }

    private fun setModels(models: List<EpoxyModel<*>>) {
        // Reflection hack to set the models list because EpoxyModelGroup doesn't expose a setter
        val modelsField = EpoxyModelGroup::class.java.getDeclaredField("models")
        modelsField.isAccessible = true
        modelsField.set(this, models)
    }
}

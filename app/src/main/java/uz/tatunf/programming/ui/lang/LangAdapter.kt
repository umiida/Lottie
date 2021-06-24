package uz.tatunf.programming.ui.lang

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.tatunf.programming.R
import uz.tatunf.programming.core.BaseAdapter
import uz.tatunf.programming.core.extention.inflate
import uz.tatunf.programming.data.model.Languages
import uz.tatunf.programming.databinding.ItemThemesBinding

class LangAdapter: BaseAdapter<Languages, LangAdapter.ThemesViewHolder>(R.layout.item_themes) {

    private var onItemClick: (pos: Int) -> Unit = { }
    fun setOnItemClickListener(onItemClick: (pos: Int) -> Unit) {
        this.onItemClick = onItemClick
    }
    inner class ThemesViewHolder(private val binding: ItemThemesBinding): RecyclerView.ViewHolder(binding.root){
        fun populateModel(model: Languages){
            binding.apply {
                theme.text = model.name
                clItem.setOnClickListener {
                    onItemClick.invoke(model.id)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemesViewHolder {
        val itemView = parent.inflate(R.layout.item_themes)
        val binding = ItemThemesBinding.bind(itemView)
        return ThemesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ThemesViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}
package dev.andrericardo.marvelapp.presentation.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.andrericardo.core.domain.model.Character
import dev.andrericardo.marvelapp.R
import dev.andrericardo.marvelapp.databinding.ItemCharacterBinding

class CharactersViewHolder(itemCharacterBinding: ItemCharacterBinding) :
    RecyclerView.ViewHolder(itemCharacterBinding.root) {

    private val textName = itemCharacterBinding.textName
    private val imageCharacter = itemCharacterBinding.imageCharacter

    fun bind(character: Character) {
        textName.text = character.name
        Glide.with(itemView)
            .load(character.imageUrl)
            .fallback(R.drawable.ic_image_loading_error)
            .into(imageCharacter)
    }

    companion object {
        fun create(parent: ViewGroup) : CharactersViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemCharacterBinding.inflate(inflater, parent, false)
            return CharactersViewHolder(itemBinding)
        }
    }

}

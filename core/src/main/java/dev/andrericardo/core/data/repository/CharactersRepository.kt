package dev.andrericardo.core.data.repository

import androidx.paging.PagingSource
import dev.andrericardo.core.domain.model.Character

interface CharactersRepository {

    fun getCharacters(query: String): PagingSource<Int, Character >

}

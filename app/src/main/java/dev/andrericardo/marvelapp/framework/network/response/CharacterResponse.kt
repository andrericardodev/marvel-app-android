package dev.andrericardo.marvelapp.framework.network.response

data class CharacterResponse(
    val id: Int,
    val name: String,
    val thumbnail: ThumbnailResponse
)

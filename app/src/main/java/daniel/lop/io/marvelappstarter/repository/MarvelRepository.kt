package daniel.lop.io.marvelappstarter.repository

import daniel.lop.io.marvelappstarter.data.remote.ServiceApi
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: ServiceApi
) {
    suspend fun list(namedStartWith: String? = null) = api.list(namedStartWith)
    suspend fun getComics(characterId: Int) = api.getComics(characterId)
}
package service

import model.Top250Data
import retrofit2.http.GET
import webclient.IMDB_API_KEY

interface MovieService {
    @GET(IMDB_API_KEY)
    suspend fun findTop250Movies(): Top250Data
}
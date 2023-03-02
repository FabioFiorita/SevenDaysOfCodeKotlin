package service

import model.Top250Data
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import webclient.IMDB_API_KEY

interface MovieService {
    @GET(IMDB_API_KEY)
    fun findTop250Movies(): Call<Top250Data>
}
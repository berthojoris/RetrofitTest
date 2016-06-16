package rest;

/**
 * Created by Bertho on 6/14/2016.
 */

import model.ChannelResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/channel")
    Call<ChannelResponse> getAllChannel(@Query("api_key") String apiKey);

    @GET("/movie/top_rated")
    Call<ChannelResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("/movie/{id}")
    Call<ChannelResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}

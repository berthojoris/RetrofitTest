package rest;

/**
 * Created by Bertho on 6/15/2016.
 */

import model.RandikaChannel;
import model.RandikaChannelResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface RandikaApi {

    @GET(Constant.CHANNEL)
    Observable<RandikaChannelResponse<RandikaChannel>>
    getChannel();

    @GET("/channel")
    Call<RandikaChannelResponse> getAllChannel();
}

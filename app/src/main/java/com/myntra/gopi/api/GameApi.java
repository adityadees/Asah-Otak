package com.myntra.gopi.api;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * .
 */

public interface GameApi {

    @GET("/services/feeds/photos_public.gne?tags=flowers")
    Observable<ResponseBody> getRandomGameImages(@QueryMap HashMap<String, String> queryMap);
}

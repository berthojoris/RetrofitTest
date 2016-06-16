package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bertho on 6/15/2016.
 */
public class NewChannelResponse {
    @SerializedName("items")
    private List<Channel> items;
}

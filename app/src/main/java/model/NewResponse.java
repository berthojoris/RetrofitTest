package model;

/**
 * Created by Bertho on 6/16/2016.
 */
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class NewResponse {

    @SerializedName("items")
    private List<Channel> items;

    public List<Channel> getItems() {
        return items;
    }

    public void setItems(List<Channel> items) {
        this.items = items;
    }

}

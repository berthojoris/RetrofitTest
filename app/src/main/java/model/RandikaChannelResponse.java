package model;

/**
 * Created by Bertho on 6/15/2016.
 */
import java.util.List;

public class RandikaChannelResponse<Data> extends Response {

    private List<Data> items;

    public List<Data> getItems()
    {
        return items;
    }

    public void setItems(List<Data> items)
    {
        this.items = items;
    }
}

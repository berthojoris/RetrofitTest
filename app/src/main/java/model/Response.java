package model;

/**
 * Created by Bertho on 6/15/2016.
 */
public class Response
{
    private int status;

    public boolean getCode()
    {
        return status == 200;
    }

    public void setCode(int code)
    {
        this.status = code;
    }
}
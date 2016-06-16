package model;

/**
 * Created by Bertho on 6/14/2016.
 */
import com.google.gson.annotations.SerializedName;

public class Channel {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("code")
    private String code;
    @SerializedName("description")
    private String description;
    @SerializedName("number")
    private Integer number;
    @SerializedName("definition")
    private String definition;
    @SerializedName("paket")
    private String paket;
    @SerializedName("logo")
    private String logo;

    public Channel(String id, String name, String code, String description, Integer number, String definition, String paket, String logo) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.number = number;
        this.definition = definition;
        this.paket = paket;
        this.logo = logo;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}

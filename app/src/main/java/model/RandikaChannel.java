package model;

/**
 * Created by Bertho on 6/15/2016.
 */
import android.os.Parcel;
import android.os.Parcelable;

public class RandikaChannel implements Parcelable {

    private String id;
    private String name;
    private String code;
    private String description;
    private String number;
    private String definition;
    private String paket;
    private String logo;

    protected RandikaChannel(Parcel in) {
        id = in.readString();
        name = in.readString();
        code = in.readString();
        description = in.readString();
        number = in.readString();
        definition = in.readString();
        paket = in.readString();
        logo = in.readString();
    }

    public static final Creator<RandikaChannel> CREATOR = new Creator<RandikaChannel>() {
        @Override
        public RandikaChannel createFromParcel(Parcel in) {
            return new RandikaChannel(in);
        }

        @Override
        public RandikaChannel[] newArray(int size) {
            return new RandikaChannel[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(code);
        dest.writeString(description);
        dest.writeString(number);
        dest.writeString(definition);
        dest.writeString(paket);
        dest.writeString(logo);
    }
}

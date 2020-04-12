package core.models;

import com.google.gson.annotations.SerializedName;

public class Hero {
    public String name;
    @SerializedName("alter-ego")
    public String alterEgo;
    public Gender gender;
}
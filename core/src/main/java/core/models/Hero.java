package core.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Hero {
    public String name;
    @SerializedName("alter-ego")
    public String alterEgo;
    public Gender gender;
    public ArrayList<Villain> enemies;
}
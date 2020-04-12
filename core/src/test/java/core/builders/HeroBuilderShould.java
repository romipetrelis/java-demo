package core.builders;

import com.google.gson.Gson;
import core.models.Gender;
import core.models.Villain;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class HeroBuilderShould {

    @Test
    public void setPropertiesOfHero(){
        var actual = new HeroBuilder().name("Superman").alterEgo("Clark Kent").build();

        assertThat(actual.alterEgo).isEqualTo("Clark Kent");
        assertThat(actual.name).isEqualTo("Superman");
    }

    @Test
    public void produceHeroJsonWithSpecifiedSerializedName() {
        var model = new HeroBuilder().name("Batman").alterEgo("Bruce Wayne").build();

        var gson = new Gson();
        var json = gson.toJson(model);

        assertThat(json).contains("alter-ego");
    }

    @Test
    public void produceHeroJsonWithEnumNameAsValue() {
        var model = new HeroBuilder().gender(Gender.MALE).build();

        var gson = new Gson();
        var json = gson.toJson(model);

        assertThat(json).contains("MALE");
    }

    @Test
    public void addVillainToEnemiesList() {
        var model = new HeroBuilder().name("Superman")
                .hasEnemy(v -> v.name("Lex Luthor")).build();

        assertThat(model.enemies).anyMatch(villain -> villain.name == "Lex Luthor");
    }
}

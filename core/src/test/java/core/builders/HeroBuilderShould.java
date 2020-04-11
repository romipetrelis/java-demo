package core.builders;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeroBuilderShould {

    @Test
    public void setPropertiesOfHero(){
        var actual = new HeroBuilder().name("Superman").alterEgo("Clark Kent").build();

        assertThat(actual.alterEgo).isEqualTo("Clark Kent");
        assertThat(actual.name).isEqualTo("Superman");
    }
}

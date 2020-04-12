package core.builders;

import core.models.Gender;
import core.models.Hero;

import java.util.ArrayList;
import java.util.function.Consumer;

public class HeroBuilder extends BuilderBase<Hero> {
    @Override
    protected Hero newTarget() {
        return new Hero();
    }

    public HeroBuilder name(String value){
        Target.name = value;
        return this;
    }

    public HeroBuilder alterEgo(String value) {
        Target.alterEgo = value;
        return this;
    }

    public HeroBuilder gender(Gender value) {
        Target.gender = value;
        return this;
    }

    public HeroBuilder hasEnemy(Consumer<VillainBuilder> configure) {
        var builder = new VillainBuilder();
        configure.accept(builder);
        var enemy = builder.build();

        Target.enemies = Target.enemies == null ? new ArrayList<>() : Target.enemies;
        Target.enemies.add(enemy);

        return this;
    }
}

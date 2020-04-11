package core.builders;

import core.models.Hero;

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
}

package core.builders;

import core.models.Villain;

public class VillainBuilder extends BuilderBase<Villain> {
    @Override
    protected Villain newTarget() {
        return new Villain();
    }

    public VillainBuilder name(String value) {
        Target.name = value;
        return this;
    }
}
package core.builders;

public abstract class BuilderBase<T> {

    protected T Target;

    public BuilderBase(){
        Target = newTarget();
    }

    protected abstract T newTarget();

    public T build() {
        return Target;
    }
}

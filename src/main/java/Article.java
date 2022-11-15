public abstract class Article <S, T, N extends Number>{
    private S id;
    private T description;
    private N volume;

    public Article(S id, T description, N volume) {
        this.id = id;
        this.description = description;
        this.volume = volume;
    }

    public S getId() {
        return id;
    }

    public void setId(S id) {
        this.id = id;
    }

    public T getDescription() {
        return description;
    }

    public void setDescription(T description) {
        this.description = description;
    }

    public N getVolume() {
        return volume;
    }

    public void setVolume(N volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", description=" + description +
                ", volume=" + volume +
                '}';
    }
}

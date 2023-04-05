public class Toy {
    int id;
    String name;
    float weight;

    public Toy(int id, String name, float weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

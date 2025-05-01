public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal =(Animal) o;
        return name.equals(animal.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ArrayListAnimalTest {
    @Test

    void shouldContainAnyOrder() {
        //crear objetos
        Animal a1= new Animal("Dog");
        Animal a2 = new Animal("Cat");
        Animal a3 = new Animal("Turtle");
        Animal a4 = new Animal("Bird");
        //crear una lista
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        // Verificamos que la lista contiene los objetos sin importar el orden
        assertThat(animals).containsExactlyInAnyOrder(a3, a1, a2);
    }
    @Test
    void shouldContainOnce() {//mirar containsonlyonce
        //crear objetos
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal turtle = new Animal("turtle");
        Animal bird = new Animal("bird");
        //crear una lista
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(turtle);
        //verificar que perro solo aparece una vez
        int dogCount = 0;
        for (Animal a : animals) {
            if (a.equals(dog)) {
                dogCount++;
            }
        }
        assertThat(dogCount).isEqualTo(1);
    }
    @Test
    void shouldNotContain() {
        //crear objetos
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal turtle = new Animal("turtle");
        Animal bird = new Animal("bird");
        //crear una lista
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(turtle);
        //verificar que pajaro no esta en la lista
        assertThat(animals).doesNotContain(bird);

    }



}

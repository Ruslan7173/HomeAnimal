import org.example.Cat;
import org.example.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDog {
    @Test
    public  void testdog(){
        Dog dog1 = new Dog("Bob");
        Assertions.assertEquals("Гав гав", dog1.makeSound());

    }
}


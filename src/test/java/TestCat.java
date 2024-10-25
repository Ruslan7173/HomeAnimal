import org.example.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCat {
    @Test

    public  void testcat(){
        Cat cat1 = new Cat("Tom");
        Assertions.assertEquals("Мяу Мяу", cat1.makeSound());

    }
}

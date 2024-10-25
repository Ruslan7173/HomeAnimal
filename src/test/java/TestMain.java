import org.example.Cat;
import org.example.Dog;
import org.example.Main;
import org.example.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    public void  make3Pets(){

        Pet[] actualPets = Main.make3Pets();
        Pet [] expectedPets = {new Dog("Bob"), new Cat("Tom"), new Cat("Tom2")};
        Assertions.assertArrayEquals(expectedPets, actualPets); //сравнение двух массивов в майне


        }
        @Test
    public  void  testConvertPetsToSounds (){
        Pet[] pets =Main.make3Pets();
        String [] actualSounds = Main.converPetsToSounda(pets);
        String [] expectedSound = {"Гав", "Мяу", "Мяу"};
        Assertions.assertArrayEquals(expectedSound,actualSounds);
        }
    @Test
    public  void  testConvertPetsToSounds2 (){
        Pet[] pets = { new Cat("Tom1"), new Cat ("Tom2")};
        String [] actualSounds = Main.converPetsToSounda(pets);
        String [] expectedSound = {"Мяу", "Мяу"};
        Assertions.assertArrayEquals(expectedSound,actualSounds);
    }
    @Test
    public  void  testConvertPetsToSounds3 () {
        Pet[] pets = {};
        String[] actualSounds = Main.converPetsToSounda(pets);
        String[] expectedSound = {};
        Assertions.assertArrayEquals(expectedSound, actualSounds);


    }
    @Test
    public  void  testConvertPetsToSounds4 () {
        Pet[] pets = {new Pet("неведамая зверушка") {
            @Override
            public String makeSound() {
                return "странные звуки";
            }
        }};
        String[] actualSounds = Main.converPetsToSounda(pets);
        String[] expectedSound = {"странные звуки"};
        Assertions.assertArrayEquals(expectedSound, actualSounds);


    }




}

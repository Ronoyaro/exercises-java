package newExercise.exercise6;

public class Init {
    public static void main(String[] args) {
        Animal[] animais = new Animal[]{new Cachorro(), new Peixe()};
        for (Animal animal : animais) {
            animal.mover();
            animal.emitirSom();
        }
    }
}

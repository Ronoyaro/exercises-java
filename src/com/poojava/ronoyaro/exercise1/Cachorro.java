package POOExercises.exercise1;

public class Cachorro implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    @Override
    public void mover() {
        System.out.println("Andando");
    }
}

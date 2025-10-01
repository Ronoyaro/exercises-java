package POOExercises.exercise1;

public interface Animal {
    void emitirSom();
    void mover();
    default void tipo() {
        System.out.println("Sou um animal");
    }
}

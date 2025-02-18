package Desafio3;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Emite som de cachorro");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abana o rabo");
    }
}

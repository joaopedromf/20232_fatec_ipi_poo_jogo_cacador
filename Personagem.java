public class Personagem{
    //atributos
    String nome;
    int energia;
    int fome;
    int sono;

    //m�todos
    void cacar(){
        System.out.println(nome + " ca�ando...");
    }

    void comer(){
        System.out.println(nome + " comendo...");
    }

    void dormir(){
        System.out.println(nome + " dormindo...");
    }
}
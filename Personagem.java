public class Personagem{
    //atributos
    String nome;
    int energia;
    int fome;
    int sono;

    //m�todos
    void cacar(){
        if(energia>=2){
            System.out.println(nome + " ca�ando...");
            energia-=2; //energia = energia - 2;
        }
        else{
            System.out.println(nome + " sem energia para ca�ar...");
        }
        fome = Math.min(fome+1,10);
        sono = Math.min(sono+1,10);
    }

    void comer(){
        System.out.println(nome + " comendo...");
    }

    void dormir(){
        System.out.println(nome + " dormindo...");
    }
}
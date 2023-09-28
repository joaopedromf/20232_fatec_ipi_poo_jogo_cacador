public class Personagem{
    //atributos
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

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
        if(fome>0){
            System.out.println(nome + " comendo...");
            fome--;
            energia = Math.min(energia+1,10);
        }
        else{
            System.out.println(nome + " sem fome.");
        }
    }

    void dormir(){
        if(sono>0){
            System.out.println(nome + " dormindo...");
            sono-=1;
            energia = Math.min(energia+1,10);
        }
        else{
            System.out.println(nome + " sem sono.");
        }
    }
}
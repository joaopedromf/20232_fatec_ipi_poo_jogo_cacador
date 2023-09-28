public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        var personagem = new Personagem();
        personagem.nome = "John";
        while(true){
            personagem.cacar();
            personagem.comer();
            personagem.dormir();
            System.out.println("**************************");
            Thread.sleep(8000);
        }
    }
}

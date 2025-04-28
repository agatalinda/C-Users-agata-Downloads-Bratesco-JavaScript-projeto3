public class Usuario {
    public static void main(String[] args) throws Exception {
     

       SmartTv smartTv = new SmartTv();


       smartTv.diminuirVolume(); // Aqui é o método para aumentar o volume
       smartTv.diminuirVolume();// cada comando diminui diminuirá o volume
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();// cada comando aumentará o volume
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       System.out.println("Volume Atual ? " + smartTv.volume);

       smartTv.mudarCnal(13); // Aqui é o método para mudar o canal 
       System.out.println("Canal Atual ? " + smartTv.canal);

     // Aqui é o método para aumentar o volume
       System.out.println("Tv ligada ? " + smartTv.ligado);// Foi adicionado os comando para o usuario ter acesso a Televisão.
       System.out.println("Canal Atual ? " + smartTv.canal);
       System.out.println("Volume Atual ? " + smartTv.volume);
    
       smartTv.ligar();
       System.out.println("Novo Smart -> Tv Ligada ? " + smartTv.ligado);
    
       smartTv.desligado();
       System.out.println("Novo Smart -> Tv Ligada ? " + smartTv.ligado);
    }
}

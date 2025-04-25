public class Usuario {
    public static void main(String[] args) throws Exception {
     

       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume(); // Aqui é o método para aumentar o volume
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       System.out.println("Volume Atual ? " + smartTv.volume);
       
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

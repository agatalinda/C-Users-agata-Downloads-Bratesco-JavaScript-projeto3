public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       System.out.println("Tv ligada ? " + smartTv.ligado);// Foi adicionado os comando para o usuario ter acesso a Televisão.
       System.out.println("Canal Atual ? " + smartTv.canal);
       System.out.println("Volume Atual ? " + smartTv.volume);
    
       smartTv.ligar();
       System.out.println("Novo Smart -> Tv ligada ? " + smartTv.ligado);
    
       smartTv.desligado();
       System.out.println("Novo Smart -> Tv desligada ? " + smartTv.ligado);
    }
}

public class SmartTv { // Aqui é a configurações da tv

    boolean ligado=false;
    int canal=1;
    int volume=25;
    public void aumentarVolume(){ // Aqui é o método para aumentar o volume
        //volume = volume + 1; // Aqui é o método para aumentar o volume
        //volume++; // Aqui é o método para aumentar o volume
        volume++;
        System.out.println("Aumentar o volume para: " + volume); // Aqui é o método para aumentar o volume
    }
    public void diminuirVolume(){ // Aqui é o método para diminuir o volume
        //volume = volume - 1; // Aqui é o método para diminuir o volume
        //volume--; // Aqui é o método para diminuir o volume
        volume--;
        System.out.println("Diminuir o volume para: " + volume); // Aqui é o método para diminuir o volume
    }


    // criar o método de manipulação do ligar

    public void ligar(){
        ligado=true;
       
    }
    public void desligado(){
        ligado=false;
    
    }
    
}
public class SmartTv { // Aqui é a configurações da tv

    boolean ligado=false;
    int canal=1;
    int volume=25;
    public void mudarCnal(int novoCanal){ // Aqui é o método para mudar o canal
        canal=novoCanal; // Aqui é o método para mudar o canal
        System.out.println("Mudando para o canal: " + canal); // Aqui é o método para mudar o canal
    }

    public void aumentarCanal(){
          // Canal para ajutar o usuario a entender o funcionamento da tv
        canal++;


    };
    public void diminuirCanal(){
        canal--;
    };

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
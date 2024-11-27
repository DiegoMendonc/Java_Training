public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        //metodos de ligar e desligar TV:
        public void ligar(){
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }
        //metodos de subir, diminuir e mudar manual canal
        public void subirCanal(){
            //canal = canal + 1;
            canal++;
        }
        public void diminuirCanal(){
            //canal = canal -1;
            canal--;
        }
        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }
        //metodos de aumentar e diminuir volume
        public void aumentarVolume(){
            //volume = volume + 1;
            volume++;
            System.out.println("Volume aumentando para: " + volume);
        }
        public void diminuarVolume(){
            //volume = volume - 1;
            volume--;
            System.out.println("Volume diminuindo para: " + volume);
        }
    }
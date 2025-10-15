package br.edu.etec.relogio.model;

public class Relogio {
        int minuto;
     
        public void setMinuto(int minuto){
                this.minuto=minuto;
                if (minuto >=0 && minuto <60)
                {System.out.println(minuto+" esta dentro de um minuto");}
                else{System.out.println(minuto+" nao esta dentro de um minuto");}
    }
}


package aula13;

public class Cachorro extends Lobo {
    
    //polimorfismo de sobreposição (mesma assinatura, classes diferentes):
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!"); //som específico de cachorro
    }
    
    //polimorfismo de sobrecarga (assinaturas diferentes - quantidade e tipo de atributos no método, classes iguais)
    public void reagir(String frase){
        if(frase.equals("Bora passear") || frase.equals("Oi, doguinho")){
            System.out.println("Abanar o rabo e latir"); //se a frase dita pro cachorro for "bora passear" ou "oi doguinho", ele abana e late
        } else{
            System.out.println("Rosnar"); //senão, rosnar
        }
    }
 
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo"); //se for antes de 12 horas, o cachorro abana
        } else if(hora >= 18){
            System.out.println("Ignorar"); //de 18 horas pra frente, o cachorro ignora
        } else{
            System.out.println("Abanar o rabo e latir"); //se for entre 12 e 18, o cachorro abana e late
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar o rabo"); //se for o dono do cachorro, ele abana o rabo
        } else{
            System.out.println("Rosnar e latir"); //senão, ele rosna e late
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar o rabo"); //se o cachorro for novo e leve, ele abana o rabo
            } else{
                System.out.println("Latir"); //se o cachorro for novo e pesado, ele late
            }
        } else{
            if(peso < 10){
                System.out.println("Rosnar"); //se o cachorro for velho e leve, ele rosna
            } else{
                System.out.println("Ignorar"); //se o cachorro for velho e pesado, ele ignora
            }
        }
    }
    
}

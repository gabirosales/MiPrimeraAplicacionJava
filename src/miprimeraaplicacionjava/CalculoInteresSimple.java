package miprimeraaplicacionjava;

public class CalculoInteresSimple {
    public static void main(String[] args){
        double interes, capitalprestado, tiempo, tasaDeInteres, TiempoEnMeses;
        
        interes = 144;
        capitalprestado = 1200.00;
        tasaDeInteres = 0.08;
        
        
        tiempo = interes / (capitalprestado * tasaDeInteres);
        TiempoEnMeses = tiempo * 12;
        
        System.out.println("Tiempo : " + tiempo + "años");
        System.out.println("Tiempo : " + TiempoEnMeses + "meses");
        
    }
    
}

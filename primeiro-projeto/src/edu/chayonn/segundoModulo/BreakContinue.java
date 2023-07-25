package edu.chayonn.segundoModulo;

public class BreakContinue {

    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero++ ){
            if(numero==3){
                break;
            }
            System.out.println(numero);
        }

        for(int number=1; number<=5; number++){
            if(number==2){
                continue;
            }
            System.out.println(number);
        }




    }
    

}

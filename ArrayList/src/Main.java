import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arrayEstatico = new String[5];
        arrayEstatico[0]="Maria";
        arrayEstatico[1]="Pedro";
        arrayEstatico[2]="Sofia";
        arrayEstatico[3]="Valentina";
        arrayEstatico[4]="Enzo";
       // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Selena");
        arrayDinamico.add("Shakira");
        arrayDinamico.add("Twice");
        arrayDinamico.add("Black Pink");
        System.out.println("Imprimindo o Array Estático");
        for (int indice =0 ; indice < arrayEstatico.length; indice++){
            System.out.println(arrayEstatico[indice]);
        }
        System.out.println("Imprimindo o Array Dinamico");
        System.out.println("Remover Selena");
        arrayDinamico.remove(0);
        //arrayDinamico.clear();
//        for (int indice =0 ; indice < arrayDinamico.size(); indice++){
//            System.out.println(arrayDinamico.get(indice));
//        }
        for(String nome : arrayDinamico){
            System.out.println(nome);
        }

    }
}

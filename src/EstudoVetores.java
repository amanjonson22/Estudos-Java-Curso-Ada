import java.util.Arrays;

public class EstudoVetores {
    public static void main(String[] args){
        //Se eu não sei quais são as posições e quero adicionar depois.
        /* String[] nomes = new String[5];
        nomes[0] = "Amanda";
        nomes[1] = "Carol";
        nomes[2] = "Felipe";
        nomes[3] = "Ronaldo";
        nomes[4] = "Patrick";
        for (int i=0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        } */

        //Se eu já sei quais são as posições
        String[] nomes = {"Amanda", "Roberta", "Lucas", "Felipe", "Marcela", "Ronaldo", "Patrick", "Carol"};
        for (int i=0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //Para imprimir a array sem o for
        System.out.println(Arrays.toString(nomes));
    }
}

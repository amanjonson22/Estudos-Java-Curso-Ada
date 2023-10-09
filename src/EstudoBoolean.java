public class EstudoBoolean {
    public static void main(String[] args){
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;


        System.out.println(vamosAPraia);
        

        // <--- faz comentário
        // operador and: &&
        // operador or: ||


        String mensagem = fimDeSemana ? "é fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}

public class TrabalhoVoluntario {
     private float duracao;

    public void imprimeProjeto (Boolean valida){
        if (duracao > 2) {
            valida = false;
            
        }
        else valida = true;
    }
    public void imprimeProjeto(String imprime) {

        System.out.println(duracao);
    }

    public void ValidaProjeto() {
    }

    public void imprimeProjeto() {
    }
}


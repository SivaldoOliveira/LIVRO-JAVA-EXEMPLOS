public class Atleta implements Comparable<Atleta> {
    private int numero;
    private String nome;

    public Atleta() {
        nome = "";
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) throws Exception {
        if (numero <= 0)
            throw new Exception("Número inválido!");

        this.numero = numero;
    }

    public void setNumero(String numero) throws Exception {
        try {
            setNumero(Integer.parseInt(numero));
        } catch (NumberFormatException ex) {
            throw new Exception("Número inválido!");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(Atleta atleta) {
        if (this.numero < atleta.numero)
            return -1;
        else if (this.numero > atleta.numero)
            return 1;
        else
            return 0;
    }

    public String toString() {
        return numero + " - " + nome;
    }

}

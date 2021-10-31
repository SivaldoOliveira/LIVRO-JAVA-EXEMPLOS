public enum Gravidade {
    MINIMA(1, "Mínima"), PEQUENA(2, "Pequena"), MEDIA(3, "Média"), ALTA(4, "Alta"), ALTISSIMA(5, "Altíssima");

    private int indicador;
    private String descricao;

    Gravidade(int indicador, String descricao) {
        this.indicador = indicador;
        this.descricao = descricao;
    }

    public int getIndicador() {
        return indicador;
    }

    public String getDescricao() {
        return descricao;
    }
}

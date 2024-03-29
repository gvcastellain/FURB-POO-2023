public class Obra {

    private String titulo;
    private String autor;
    private Parecer[] pareceres = new Parecer[3];
    private byte indice = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void addParecer(Parecer p) {
        if (p != null && this.indice < this.pareceres.length) {
            this.pareceres[this.indice] = p;
            this.indice++;
        }
    }

    public String exibirPareceres() {
        String retorno = "";

        for (int i = 0; i < this.indice; i++) {
            retorno += (i + 1) + ")" + this.pareceres[i].getNomeParecerista() + " - " + this.pareceres[i].getData()
                    + " - " + this.pareceres[i].getConteudo() + "\n";
        }

        return retorno;
    }

}

public class ExemploSincronizacao {
    public static void main(String[] args) {
        Impressora matricial = new Impressora();

        Fila docto1 = new Fila("Relatório de vendas", matricial);
        Fila docto2 = new Fila("Planilha de custos", matricial);
        Fila docto3 = new Fila("Ficha de confêrencia ", matricial);

        docto1.start();
        docto2.start();
        docto3.start();
    }
}

class Fila extends Thread {
    private String documento;
    private Impressora impressora;

    public Fila(String documento, Impressora impressora) {
        this.documento = documento;
        this.impressora = impressora;
    }

    public void run() {
        impressora.imprimir(documento);
    }
}

class Impressora {
    public synchronized void imprimir(String documento) {
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Início de impressão: " + documento);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException iex) {
            System.out.println("Linha interrompida!");
        }

        System.out.println("Fim de impressão: " + documento);
        System.out.println("------------------------------------------");
    }
}

/********************************************************************
 * Este arquivo é parte integrante do livro identificado abaixo e é *
 * protegido pela legislação que trata dos direitos autorais. *
 * *
 * Título: Programação de Computadores em Java *
 * Autor: Rui Rossi dos Santos *
 * Editora: NovaTerra Editora e Distribuidora Ltda. *
 * Ano: 2014 *
 ********************************************************************/

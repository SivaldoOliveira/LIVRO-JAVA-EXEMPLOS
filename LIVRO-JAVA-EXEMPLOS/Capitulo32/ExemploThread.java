public class ExemploThread {
    public static void main(String[] args) {
        Thread tc = Thread.currentThread();

        tc.setName("Thread corrente");
        tc.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Nome: " + tc.getName());
        System.out.println("Prioridade: " + tc.getPriority());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException iex) {
            System.out.println("Erro: thread interrompida");
        }

        System.out.println();
        tc.setName("Thread única");
        tc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Nome: " + tc.getName());
        System.out.println("Prioridade: " + tc.getPriority());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException iex) {
            System.out.println("Erro: thread interrompida");
        }

        System.out.println();
        tc.setName("Thread atual");
        tc.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Nome: " + tc.getName());
        System.out.println("Prioridade: " + tc.getPriority());
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

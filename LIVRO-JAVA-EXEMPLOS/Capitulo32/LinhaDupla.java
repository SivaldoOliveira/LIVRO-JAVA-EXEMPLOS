public class LinhaDupla {
    public static void main(String[] args) {
        Thread principal = Thread.currentThread();
        principal.setName("Linha principal");
        principal.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Linha criada: " + principal);

        Thread secundaria = new Thread(new MinhaLinha());
        secundaria.setName("Linha secundária");
        secundaria.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Linha criada: " + secundaria);

        System.out.println();
        secundaria.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException iex) {
        }

        System.out.println("Linha principal encerrada");
    }
}

class MinhaLinha implements Runnable {
    public void run() {
        System.out.println("Linha secundária iniciada");

        for (int i = 5; i >= 0; i--) {
            System.out.println("Contagem: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
            }
        }

        System.out.println("Linha secundária encerrada");
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

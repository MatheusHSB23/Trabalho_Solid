package br.edu.umfg;

import br.edu.umfg.TelaInicial;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();

        try {
            while (true) {
                TelaInicial.menuDeOpcoes();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
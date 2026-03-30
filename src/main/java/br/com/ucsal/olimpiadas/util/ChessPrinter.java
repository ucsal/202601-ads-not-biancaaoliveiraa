package br.com.ucsal.olimpiadas.util;

public class ChessPrinter {
    public static void imprimirTabuleiro(String fen) {
        if (fen == null || fen.isBlank()) return;
        String parteTabuleiro = fen.split(" ")[0];
        String[] ranks = parteTabuleiro.split("/");
        System.out.println("\n    a b c d e f g h\n   -----------------");
        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " | ");
            for (char c : ranks[r].toCharArray()) {
                if (Character.isDigit(c)) {
                    for (int i = 0; i < (c - '0'); i++) System.out.print(". ");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println("| " + (8 - r));
        }
        System.out.println("   -----------------");
    }
}
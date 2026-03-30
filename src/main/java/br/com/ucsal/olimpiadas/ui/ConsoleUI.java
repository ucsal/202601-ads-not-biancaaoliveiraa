package br.com.ucsal.olimpiadas.ui;

import br.com.ucsal.olimpiadas.domain.*;
import br.com.ucsal.olimpiadas.repository.Repository;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner in = new Scanner(System.in);
    private final Repository<Participante> pRepo;
    private final Repository<Prova> prRepo;

    public ConsoleUI(Repository<Participante> p, Repository<Prova> pr) {
        this.pRepo = p; 
        this.prRepo = pr;
    }

    public void executar() {
        while (true) {
            System.out.println("\n=== OLIMPÍADA SOLID ===");
            System.out.println("1) Cadastrar Participante\n2) Cadastrar Prova\n0) Sair");
            System.out.print("> ");
            String op = in.nextLine();
            if (op.equals("0")) break;
            if (op.equals("1")) cadastrarParticipante();
            if (op.equals("2")) cadastrarProva();
        }
    }

    private void cadastrarParticipante() {
        System.out.print("Nome: ");
        Participante p = new Participante();
        p.setNome(in.nextLine());
        pRepo.salvar(p);
        System.out.println("Cadastrado!");
    }

    private void cadastrarProva() {
        System.out.print("Título: ");
        Prova pr = new Prova();
        pr.setTitulo(in.nextLine());
        prRepo.salvar(pr);
        System.out.println("Prova criada!");
    }
}
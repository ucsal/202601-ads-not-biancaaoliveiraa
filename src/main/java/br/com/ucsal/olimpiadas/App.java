package br.com.ucsal.olimpiadas;

import br.com.ucsal.olimpiadas.domain.*;
import br.com.ucsal.olimpiadas.repository.*;
import br.com.ucsal.olimpiadas.ui.ConsoleUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Repository<Participante> pRepo = new InMemoryRepo<>();
        Repository<Prova> prRepo = new InMemoryRepo<>();

        ConsoleUI ui = new ConsoleUI(pRepo, prRepo);
        ui.executar();
    }
}

class InMemoryRepo<T> implements Repository<T> {
    private final List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T e) {
        lista.add(e);
    }

    @Override
    public List<T> buscarTodos() {
        return new ArrayList<>(lista);
    }

    @Override
    public Optional<T> buscarPorId(long id) {
        return Optional.empty();
    }
}
package br.com.ucsal.olimpiadas.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    void salvar(T entidade);
    List<T> buscarTodos();
    Optional<T> buscarPorId(long id);
}
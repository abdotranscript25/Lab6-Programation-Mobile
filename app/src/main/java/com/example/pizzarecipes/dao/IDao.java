package com.example.pizzarecipes.dao;

import java.util.List;

public interface IDao<T> {

    T creer(T objet);

    T modifier(T objet);

    boolean supprimer(long id);

    T trouverParId(long id);

    List<T> trouverTous();
}
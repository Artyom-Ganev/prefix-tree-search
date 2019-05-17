package ru.ganev.prefix_tree_search.service;

import ru.ganev.prefix_tree_search.model.Word;

import java.util.List;

public interface IWordService {
    List<Word> findAll();
}

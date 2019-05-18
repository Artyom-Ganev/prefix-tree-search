package ru.ganev.prefix_tree_search.service;

import ru.ganev.prefix_tree_search.model.Word;

public interface IWordService {
    Iterable<Word> findAll();
}

package ru.ganev.prefix_tree_search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ganev.prefix_tree_search.model.Word;
import ru.ganev.prefix_tree_search.repository.WordRepository;

@Service
public class WordService implements IWordService {
    @Autowired
    private WordRepository repository;

    @Override
    public Iterable<Word> findAll() {
        return repository.findAll();
    }
}

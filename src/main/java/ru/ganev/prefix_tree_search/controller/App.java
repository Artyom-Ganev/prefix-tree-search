package ru.ganev.prefix_tree_search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ganev.prefix_tree_search.model.Word;
import ru.ganev.prefix_tree_search.service.IWordService;

@Controller
public class App {

    @Autowired
    private IWordService wordService;

    @GetMapping("/words")
    public String findCities(Model model) {
        Iterable<Word> words = wordService.findAll();
        model.addAttribute("words", words);
        return "words";
    }
}
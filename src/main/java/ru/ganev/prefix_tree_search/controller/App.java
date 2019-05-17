package ru.ganev.prefix_tree_search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ganev.prefix_tree_search.model.Word;
import ru.ganev.prefix_tree_search.service.IWordService;

import java.util.List;

@Controller
public class App {

    @Autowired
    private IWordService wordService;

    @GetMapping("/words")
    public String findCities(Model model) {
        List<Word> words = wordService.findAll();
        model.addAttribute("words", words);
        return "words";
    }
}
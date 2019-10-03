package gois.study.jokeapp.controllers;

import gois.study.jokeapp.services.JokeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}

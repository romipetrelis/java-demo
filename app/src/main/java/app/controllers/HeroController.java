package app.controllers;

import core.models.Hero;
import core.services.HeroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(final HeroService heroService) {

        this.heroService = heroService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<Hero> get(@PathVariable String name) {

        var model = heroService.getHeroByName(name);
        return ResponseEntity.ok(model);
    }
}

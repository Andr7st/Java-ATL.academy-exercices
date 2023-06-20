package org.andr7st.sb.app.controllers;

import org.andr7st.sb.app.entities.Article;
import org.andr7st.sb.app.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getList() {
        return articleService.list();
    }

    // Search the id passed in the path variable
    @GetMapping("/{id}")
    public Optional<Article> getById(@PathVariable Integer id) {
        Article articleResult = null;
        for (Article article: articleService.list()) {
            if(article.getId().equals(id)) {
                articleResult = article;
                break;
            }
        }
        // if id does not exist get error 500
        // assert articleResult != null; return Optional.of(articleResult);
        return Optional.ofNullable(articleResult);
    }

    @PostMapping
    public Article insertNew(@RequestBody Article article) { //requestBody translate to JSON
        return articleService.insert(article);
    }

    @PutMapping
    public Article updateNew(@RequestBody Article article) {
        return articleService.update(article);
    }

    @DeleteMapping
    public void delete(@RequestBody Article article) {
        articleService.delete(article);
    }

}
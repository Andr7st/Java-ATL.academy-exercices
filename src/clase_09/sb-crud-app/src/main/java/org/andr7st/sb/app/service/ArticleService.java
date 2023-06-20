package org.andr7st.sb.app.service;

import org.andr7st.sb.app.entities.Article;
import org.andr7st.sb.app.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article insert(Article article) {
        return articleRepository.save(article);
    }
    public Article update(Article article) {
        return articleRepository.save(article);
    }

    public List<Article> list() {
        return articleRepository.findAll();
    }

    public void delete(Article article) {
        articleRepository.delete(article); // also by Id
    }















//    @Autowired
//    ArticleService articleService;
//
//    @Override
//    public Article getById(Integer id) {
//
//        Article articleResult = null;
//
//        for (Article article: articleService.list()) {
//
//            if(article.getId().equals(id)) {
//                articleResult = article;
//                break;
//
//            }
//
//        }
//
//        return articleResult;
//    }

//    @Override
//    public Optional<Article> getByIdOptional(Integer id) {
//        return Optional.empty();
//    }
}

//interface ArticleServiceI {
//
//    public Article getById(Integer id);
//   // public Optional<Article> getByIdOptional(Integer id);
//
//}
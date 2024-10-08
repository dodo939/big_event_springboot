package io.github.dodo939.service;

import io.github.dodo939.pojo.Article;
import io.github.dodo939.pojo.PageBean;

public interface ArticleService {

    void addArticle(Article article);

    PageBean<Article> listArticle(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    Article getArticleById(Integer id);

    void updateArticle(Article article);

    void deleteArticle(Integer id);

    void deleteArticleByCategoryId(Integer id);
}

package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{

}

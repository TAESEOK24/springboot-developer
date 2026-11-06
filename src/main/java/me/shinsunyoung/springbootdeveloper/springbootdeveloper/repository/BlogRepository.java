package me.shinsunyoung.springbootdeveloper.springbootdeveloper.repository;

import me.shinsunyoung.springbootdeveloper.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

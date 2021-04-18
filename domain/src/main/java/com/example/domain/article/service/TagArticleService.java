package com.example.domain.article.service;

import com.example.domain.article.model.Article;
import com.example.domain.article.model.Tag;
import com.example.domain.article.model.TagArticle;
import com.example.domain.article.repository.TagArticleRepository;
import com.example.domain.user.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@AllArgsConstructor
public class TagArticleService {
    private final TagArticleRepository repository;

    public TagArticle bind(Tag tag, Article article, User user) {
        TagArticle tagArticle = TagArticle.builder()
                .tagId(tag.getId())
                .articleId(article.getId())
                .createdBy(user.getId())
                .lastModifiedAt(Instant.now())
                .build();

        return repository.save(tagArticle);
    }

    public List<TagArticle> getByArticle(Article article) {
        return repository.findAll(Example.of(TagArticle.builder()
                .articleId(article.getId())
                .build()));
    }
}

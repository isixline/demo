package com.example.frontend.service;

import com.example.domain.article.model.Article;
import com.example.domain.article.service.ArticleService;
import com.example.domain.auth.model.Authorize;
import com.example.domain.user.model.User;
import com.example.domain.user.service.UserService;
import com.example.frontend.usecase.CreateArticleCase;
import com.example.frontend.usecase.GetArticleDetailCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleApplicationService {
    private final ArticleService service;
    private final UserService userService;

    public CreateArticleCase.Response create(CreateArticleCase.Request request, Authorize authorize) {
        User user = userService.getById(authorize.getUserId());
        Article article = service.create(request.getTitle(), request.getContent(), user);
        return CreateArticleCase.Response.from(article);
    }

    public GetArticleDetailCase.Response getDetail(String id) {
        Article article = service.getById(id);
        return GetArticleDetailCase.Response.from(article);
    }
}

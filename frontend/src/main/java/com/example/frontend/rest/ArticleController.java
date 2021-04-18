package com.example.frontend.rest;

import com.example.domain.auth.model.Authorize;
import com.example.domain.auth.service.AuthorizeService;
import com.example.frontend.service.ArticleApplicationService;
import com.example.frontend.usecase.CreateArticleCase;
import com.example.frontend.usecase.GetArticleDetailCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("articles")
@AllArgsConstructor
public class ArticleController {
    private final ArticleApplicationService applicationService;
    private final AuthorizeService authorizeService;

    @PostMapping
    @ResponseStatus(CREATED)
    public CreateArticleCase.Response createArticle(@RequestParam(value = "token") String token,
                                                    @RequestBody CreateArticleCase.Request request) {
        Authorize authorize = authorizeService.getById(token);
        return applicationService.create(request, authorize);
    }

    @GetMapping("/{id}")
    public GetArticleDetailCase.Response getArticleDetail(@PathVariable("id") String id) {
        return applicationService.getDetail(id);
    }
}

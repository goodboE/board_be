package com.ko.board.controller;

import com.ko.board.model.Bookmark;
import com.ko.board.model.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxExController {

    private List<Bookmark> Bookmarks = new ArrayList<>();

    @RequestMapping("/get-with-no-parameter")
    public String getWithNoParameter() {
        return "파라미터가 없는 GET 요청";
    }

    @PostMapping("/bookmark")
    public String registerPost(@RequestBody Bookmark bookmark) {
        Bookmarks.add(bookmark);
        return "registered";
    }

    @GetMapping("/bookmarks")
    public List<Bookmark> getPosts() {
        return Bookmarks;
    }

}

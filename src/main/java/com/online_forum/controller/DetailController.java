package com.online_forum.controller;

import com.alibaba.fastjson.JSON;
import com.online_forum.common.R;
import com.online_forum.entity.Book;
import com.online_forum.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DetailController {
    @Autowired
    private BookService bookService;
    @GetMapping("/detai/{id}")
    public String haha(HttpServletRequest request,@PathVariable Integer id) throws IOException {
        //String url = "/page/detail/bookdetail.html";
        Book book = bookService.getById(id);

        System.out.println(book);

        R<Book> bookR = new R<>(1, "success select by id", book, null);

        String json = JSON.toJSONString(bookR);

        System.out.println(json);
        request.setAttribute("json",json);

        String url = "detail/bookdetail";

        return url;
    }


}

package info.programmador.controller;

import info.programmador.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author programmador.info
 * @since 14.07.15 0:24
 */
@Controller
public class BookClientController {

    @Autowired
    public BookService bookService;

    @RequestMapping("/")
    @ResponseBody
    public String showBookId(){
        String bookId = bookService.generateBookId();
        System.out.println("Book id: " + bookId);
        return "Received book id: " + bookId;
    }
}

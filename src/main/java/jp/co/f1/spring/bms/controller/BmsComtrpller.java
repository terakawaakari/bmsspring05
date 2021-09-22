package jp.co.f1.spring.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import jp.co.f1.spring.bms.repository.BookRepository;
import jp.co.f1.spring.bms.entity.Book;

@Controller
public class BmsComtrpller {
	
	@Autowired
	private BookRepository bookinfo;
	
	@RequestMapping("/list")
	public ModelAndView list(ModelAndView mav) {
		Iterable<Book> book_list = bookinfo.findAll();
		
		mav.addObject("book_list", book_list);
		
		mav.setViewName("list");
		
		return mav;
	}
}

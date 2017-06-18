package jp.sakura.server.catroom;

import jp.sakura.server.catroom.Entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CommentTestController {

    @Autowired
    private ICommentRepository commentRepository;

    @RequestMapping("registtest")
    public ModelAndView RegistTest(){
        List<MessageEntity> messages = commentRepository.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("messages", messages);
        modelAndView.setViewName("commenttest");
        return modelAndView;
    }

    @RequestMapping("commenttest")
    public ModelAndView CommentTest(){
        List<MessageEntity> messages = commentRepository.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("messages", messages);
        modelAndView.setViewName("commenttest");
        return modelAndView;
    }
}

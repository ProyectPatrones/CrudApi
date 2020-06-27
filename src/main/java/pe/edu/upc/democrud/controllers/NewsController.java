package pe.edu.upc.democrud.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.democrud.models.News;
import pe.edu.upc.democrud.services.INewsService;


import javax.swing.text.html.Option;
import javax.ws.rs.Path;
import java.util.Optional;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService service;

    @GetMapping("/obesidad/{id}")
    public String obesidad(@PathVariable int id) throws Exception {
        Optional<News>news = service.findById(id);
        return "obesidad";
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "hola";
    }

}

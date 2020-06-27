package pe.edu.upc.democrud.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.democrud.services.ICrudService;
import pe.edu.upc.democrud.services.IPeopleService;
import pe.edu.upc.democrud.models.Person;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/person")
public class PeopleController {
    @Autowired
    private IPeopleService service;
    @GetMapping("/listar")
    public String listar(Model model) throws Exception {
        List<Person>personas = service.findAll();
        model.addAttribute("people", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("person", new Person());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Person p, Model model)  {
        try {
            service.save(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/person/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) throws Exception {
        Optional<Person>persona = service.findById(id);
        model.addAttribute("person", persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id) throws Exception {
        service.deleteById(id);
        return "redirect:/person/listar";
    }



}

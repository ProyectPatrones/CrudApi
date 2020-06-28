package pe.edu.upc.democrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.democrud.models.Doctor;
import pe.edu.upc.democrud.services.IDoctorService;

import java.util.List;

//Aqui se tienen que cambiar los retornos
@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private IDoctorService doctorService;

    @GetMapping("/listar")
    public String listar(Model model)   {
        List<Doctor> doctores = null;
        try {
            doctores = doctorService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("doctor", doctores);
        return "indexDoc";
    }

    @GetMapping("/new")
    public String agregar (Model model){
        model.addAttribute("doctor", new Doctor());
        return "formDoc";
    }

    @GetMapping("/delete/{id}")
    public String delete (Model model, @PathVariable int id)  {
        try {
            doctorService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminado correctamente";
    }

}

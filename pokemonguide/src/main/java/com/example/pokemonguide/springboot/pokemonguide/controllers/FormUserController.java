package com.example.pokemonguide.springboot.pokemonguide.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.pokemonguide.springboot.pokemonguide.editors.PaisPropertyEditor;
import com.example.pokemonguide.springboot.pokemonguide.models.Pais;
import com.example.pokemonguide.springboot.pokemonguide.models.Usuario;
import com.example.pokemonguide.springboot.pokemonguide.services.PaisService;
import com.example.pokemonguide.springboot.pokemonguide.validacion.UsuarioValidador;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("usuario")
public class FormUserController {

    @Autowired
    private UsuarioValidador validador;

    @Autowired
    private PaisPropertyEditor paisEditor;

    @Autowired
    private PaisService paisService;

    @GetMapping("/form-user")
    public String formUser(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombreDelUsuario("Mario");
        usuario.setApellido("Prada");
        //usuario.setHabilitar(true);
        usuario.setPais(new Pais(1, "ESP", "Espania"));
        //usuario.setRoles(Arrays.asList(new Role(2, "Usuario", "ROLE_USER")));

        model.addAttribute("titulo", "Register");
        model.addAttribute("usuario", usuario);
        return "formularios/form-user";
    }

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {

        dataBinder.addValidators(validador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Evita que pongan fechas en formatos incorrectos
        dateFormat.setLenient(false);
        dataBinder.registerCustomEditor(Date.class, "fechaNac", new CustomDateEditor(dateFormat, false));

        dataBinder.registerCustomEditor(Pais.class, "pais", paisEditor);
    }

    @ModelAttribute("listaPaises")
    public List<Pais> listaPaises() {
        return paisService.listar();
    }

    @PostMapping("/form-user")
    public String procesarUser(@Valid Usuario usuario,
            BindingResult result, Model model) {

        // validador.validate(usuario, result);

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Resultado Register");
            return "formularios/form-user";
        }

        model.addAttribute("registroCompleto", true);

        return "formularios/form-login";
    }

    @PostMapping("/form-login")
    public String procesarLogin(@Valid Usuario usuario,
            BindingResult result, Model model) {

        // validador.validate(usuario, result);

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Resultado Register");
            return "formularios/form-user";
        }

        model.addAttribute("registroCompleto", true);

        return "resultado";
    }

    @GetMapping("/ver-user")
    public String verUser(@SessionAttribute(name = "usuario", required = false) Usuario usuario, Model model,
            SessionStatus status) {

        if (usuario == null) {
            return "redirect:formularios/form-user";
        }
        model.addAttribute("titulo", "Inicio De Sesion");

        status.setComplete();
        return "formularios/form-login";
    }
}

package com.example.pokemonguide.springboot.pokemonguide.controllers;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.pokemonguide.springboot.pokemonguide.editors.PaisPropertyEditor;
import com.example.pokemonguide.springboot.pokemonguide.editors.RolesEditor;
import com.example.pokemonguide.springboot.pokemonguide.models.Pais;
import com.example.pokemonguide.springboot.pokemonguide.models.Role;
import com.example.pokemonguide.springboot.pokemonguide.models.Usuario;
import com.example.pokemonguide.springboot.pokemonguide.services.PaisService;
import com.example.pokemonguide.springboot.pokemonguide.services.RoleService;
import com.example.pokemonguide.springboot.pokemonguide.validacion.UsuarioValidador;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("usuario")
public class FormController {

    @Autowired
    private UsuarioValidador validador;

    @Autowired
    private PaisService paisService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PaisPropertyEditor paisEditor;

    @Autowired
    private RolesEditor roleEditor;

    // Metodo que utilizo para establecer cosas por defecto
    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombreDelUsuario("Mario");
        usuario.setApellido("Prada");
        usuario.setHabilitar(true);
        usuario.setPais(new Pais(1, "ESP", "Espania"));
        usuario.setRoles(Arrays.asList(new Role(2, "Usuario", "ROLE_USER")));

        model.addAttribute("titulo", "Register");
        model.addAttribute("usuario", usuario);
        return "formularios/form";
    }

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {

        dataBinder.addValidators(validador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Evita que pongan fechas en formatos incorrectos
        dateFormat.setLenient(false);
        dataBinder.registerCustomEditor(Date.class, "fechaNac", new CustomDateEditor(dateFormat, false));

        dataBinder.registerCustomEditor(Pais.class, "pais", paisEditor);
        dataBinder.registerCustomEditor(Role.class, "roles", roleEditor);
    }

    @ModelAttribute("listaRoles")
    public List<Role> listaRoles() {
        return this.roleService.listar();
    }

    @ModelAttribute("listaPaises")
    public List<Pais> listaPaises() {
        return paisService.listar();
    }

    @ModelAttribute("listaRolesString")
    public List<String> listaRolesString() {
        return Arrays.asList(
                "ROLE_ADMIN",
                "ROLE_USER",
                "ROLE_MODERADOR");
    }

    @ModelAttribute("paises")
    public List<String> paises() {
        return Arrays.asList("Espania", "Mexico", "Chile", "Italia", "Francia", "Peru", "Argentina");
    }

    @ModelAttribute("listaRolesMap")
    public Map<String, String> listaRolesMap() {
        Map<String, String> roles = new HashMap<>();
        roles.put("ROLE_ADMIN", "Administrador");
        roles.put("ROLE_USER", "Usuario");
        roles.put("ROLE_MODERADOR", "Moderador");
        return roles;
    }

    @ModelAttribute("paisesMap")
    public Map<String, String> paisesMap() {
        Map<String, String> paises = new HashMap<>();
        paises.put("ESP", "Espania");
        paises.put("MX", "Mexico");
        paises.put("CL", "Chile");
        paises.put("IT", "Italia");
        paises.put("FR", "Francia");
        paises.put("PER", "Peru");
        paises.put("ARG", "Argentina");

        return paises;
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario,
            BindingResult result, Model model) {

        // validador.validate(usuario, result);

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Resultado Register");
            return "formularios/form";
        }

        model.addAttribute("registroCompleto", true);

        return "resultado";
    }



    @GetMapping("/ver")
    public String ver(@SessionAttribute(name = "usuario", required = false) Usuario usuario, Model model,
            SessionStatus status) {

        if (usuario == null) {
            return "redirect:formularios/form";
        }
        model.addAttribute("titulo", "Resultado Register");

        status.setComplete();
        return "resultado";
    }

    @GetMapping("/index")
    public String index(@SessionAttribute(name = "usuario", required = false) Usuario usuario, Model model,
            SessionStatus status) {

        if (usuario == null) {
            return "redirect:/form";
        }

        status.setComplete();
        return "index";
    }
}

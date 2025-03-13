package br.appLogin.Login.controller;


import br.appLogin.Login.model.Usuario;
import br.appLogin.Login.repository.UsuarioRepository;
import br.appLogin.Login.service.CookieService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;


@Controller
public class LoginController {

    private final UsuarioRepository user;

    @Autowired
    public LoginController(UsuarioRepository user) {
        this.user = user;
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
    public String dashboard(Model model, HttpServletRequest request) throws UnsupportedEncodingException{
        model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        return "dados";
    }

    @PostMapping("/logar")
    public String loginUsuario(Usuario usuario, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println("Tentando logar com email: " + usuario.getEmail());
        Usuario usuarioLogado = this.user.login(usuario.getEmail(), usuario.getSenha());
        if (usuarioLogado != null){
            System.out.println("Usuário logado com sucesso!");
            CookieService.setCookie(response, "usuarioId", String.valueOf(usuarioLogado.getId()), 10000);
            CookieService.setCookie(response, "nomeUsuario", String.valueOf(usuarioLogado.getNome()), 10000);
            return "redirect:/";
        }

        model.addAttribute("erro", "Usuário Invalido!");
        return "login";

    }


    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public String cadastroUsuario(@Valid Usuario usuario, BindingResult result){

        if (result.hasErrors()){
            return "redirect:/cadastro";
        }

        user.save(usuario);
        return "redirect:/login";
    }
}

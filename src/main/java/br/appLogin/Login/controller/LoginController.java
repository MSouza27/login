package br.appLogin.Login.controller;


import br.appLogin.Login.model.Usuario;
import br.appLogin.Login.repository.UsuarioRepository;
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
    public String dashboard(){
        return "dados";
    }

    @PostMapping("/logar")
    public String loginUsuario(Usuario usuario, Model model, HttpServletResponse response){
        Usuario usuarioLogado = this.user.login(usuario.getEmail(), usuario.getSenha());
        if (usuarioLogado != null){
            return "redirect:/";
        }

        model.addAttribute("erro", "Usuário Invalido");
        return "/dados";

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

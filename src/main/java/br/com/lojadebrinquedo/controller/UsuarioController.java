package br.com.lojadebrinquedo.controller;

import br.com.lojadebrinquedo.entity.Usuario;
import br.com.lojadebrinquedo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/req/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "signup";
    }

    @PostMapping("/req/signup")
    public String registerUser(Usuario usuario) {
        // Verifica se o usuário já existe
        if (usuarioRepository.findByUsername(usuario.getUsername()).isPresent()) {
            return "redirect:/req/signup?error=usuarioExistente";
        }

        // Criptografa a senha antes de salvar
        if (usuario.getPassword() != null && !usuario.getPassword().isEmpty()) {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuarioRepository.save(usuario);
        }
        return "redirect:/req/login";
    }

    @GetMapping("/req/login")
    public String showLoginForm() {
        return "login";
    }
}

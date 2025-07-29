package alura.com.forumHub.controller;

import alura.com.forumHub.Infra.security.DadosTokenJWT;
import alura.com.forumHub.Infra.security.TokenService;
import alura.com.forumHub.domain.Login;
import alura.com.forumHub.usuario.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {


    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;


    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid Login dados){
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var autor = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) autor.getPrincipal());

        return  ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }

}

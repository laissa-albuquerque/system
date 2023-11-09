package com.unifacisa.tap.controller;

import com.unifacisa.tap.domain.Acao;
import com.unifacisa.tap.domain.Conta;
import com.unifacisa.tap.domain.Usuario;
import com.unifacisa.tap.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }


    @GetMapping("/{uuid}")
    public ResponseEntity<Usuario> getContaById(@PathVariable(value = "uuid") UUID id) {
        Usuario usuario = usuarioService.findById(id);
        log.info("usuario {} criado com sucesso", usuario.getId());
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/cotacao/{uuid}")
    ResponseEntity<List<Acao>> cotacao(@PathVariable(value = "uuid") UUID id) {
        return ResponseEntity.ok(usuarioService.cotacao(id));
    }

    @PostMapping("/{uuid}/depositar")
    ResponseEntity<Conta> depositar(@PathVariable(value = "uuid") UUID id, @RequestBody Double valor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.depositar(id, valor));
    }

    @PostMapping("/{uuid}/sacar")
    ResponseEntity<Conta> sacar(@PathVariable(value = "uuid") UUID id, @RequestBody Double valor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.sacar(id, valor));
    }
}

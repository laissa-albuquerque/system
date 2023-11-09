package com.unifacisa.tap.client;

import com.unifacisa.tap.domain.Acao;
import com.unifacisa.tap.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@FeignClient(name = "UserClient", url = "http://localhost:8081/usuarios")
public interface UserClient {

    @GetMapping("/{uuid}")
    Usuario findById(@PathVariable(value = "uuid") UUID id);

    @PostMapping
    Usuario save(@RequestBody Usuario usuario);

}

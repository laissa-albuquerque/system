package com.unifacisa.tap.client;

import com.unifacisa.tap.domain.Conta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.UUID;

@FeignClient(name = "ContaClient", url = "http://localhost:8081/contas")
public interface ContaClient {

    @PostMapping("{uuid}/depositar")
    Conta depositar(@PathVariable(value = "uuid") UUID id, @RequestBody Map<String, Double> valor);

    @PostMapping("{uuid}/sacar")
    Conta sacar(@PathVariable(value = "uuid") UUID id, @RequestBody Map<String, Double> valor);

}

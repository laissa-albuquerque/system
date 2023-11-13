package com.unifacisa.tap.client;

import com.unifacisa.tap.domain.Acao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "AcaoClient", url = "http://docker-home-broker-1:8082/acoes")
public interface AcaoClient {

    @GetMapping()
    List<Acao> getAll();
}

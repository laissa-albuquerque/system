package com.unifacisa.tap.service;

import com.unifacisa.tap.client.AcaoClient;
import com.unifacisa.tap.client.ContaClient;
import com.unifacisa.tap.client.UserClient;
import com.unifacisa.tap.domain.Acao;
import com.unifacisa.tap.domain.Conta;
import com.unifacisa.tap.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UserClient userClient;
    private final AcaoClient acaoClient;
    private final ContaClient contaClient;

    public Usuario findById(UUID id) {
        return userClient.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return userClient.save(usuario);
    }

    public Conta depositar(UUID id, double valor) {
        return contaClient.depositar(id, Map.of("valor", valor));
    }

    public Conta sacar(UUID id, double valor) {
        return contaClient.sacar(id, Map.of("valor", valor));
    }

    public List<Acao> cotacao(UUID id) {
        Usuario user = findById(id);
        Double saldo = user.getConta().getSaldo();
        List<Acao> acaoList = acaoClient.getAll();
        acaoList.forEach(obj -> obj.setValorLote(obj.getValor() * 100));
        List<Acao> acoesFiltradas = acaoList.stream().filter(v -> v.getValorLote() <= saldo).collect(Collectors.toList());
        return acoesFiltradas;
    }
}

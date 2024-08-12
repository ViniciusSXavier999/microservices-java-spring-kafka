package br.com.vx.microservices.kafka.venda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {

    /* Sempre que eu for realizar essa venda eu quero postar no tópico que
    * essa venda foi realizada e ele atualizar o estoque do produto */
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public ResponseEntity<Void> realizarVenda(@RequestBody String idProduto){
        // realizando a postagem de uma nova mensagem no tópico
        kafkaTemplate.send("estoque-topico", idProduto);
        return ResponseEntity.ok().build();
    }
}

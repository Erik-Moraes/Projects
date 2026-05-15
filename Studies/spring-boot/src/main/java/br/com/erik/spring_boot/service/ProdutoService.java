package br.com.erik.spring_boot.service;

import br.com.erik.spring_boot.database.model.ProdutoEntity;
import br.com.erik.spring_boot.dto.ProdutoDTO;
import br.com.erik.spring_boot.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.util.pattern.PathPatternRouteMatcher;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {


    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static{

        PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .nome("Manga")
                .preco(new BigDecimal(5000))
                .quantidade(1000)
                .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(2)
                        .nome("Morango")
                        .preco(new BigDecimal(1000))
                        .quantidade(500)
                        .build());

    }

    public List<ProdutoEntity> findAll(){

        return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduct (ProdutoDTO produtoDTO){

        Integer identificador = PRODUTOS.stream()
                .mapToInt(ProdutoEntity::getId)
                .max()
                .orElse(0) + 1;

        ProdutoEntity novoProduto = ProdutoEntity.builder()
                .id(identificador)
                .nome(produtoDTO.getNome())
                .preco(produtoDTO.getPreco())
                .quantidade(produtoDTO.getQuantidade())
                .build();

        PRODUTOS.add(novoProduto);
        return novoProduto;

    }

    public ProdutoEntity updateProduct (ProdutoDTO produtoDTO,Integer id) throws NotFoundException {


        ProdutoEntity produto = PRODUTOS.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Produto não encontrado"));

        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());
        produto.setQuantidade(produtoDTO.getQuantidade());

        return produto;
    }

    public void deleteProduct (Integer id){
        PRODUTOS.removeIf(p -> p.getId().equals(id));
    }

    public ProdutoEntity partialUpdateProduct (ProdutoDTO produtoDTO, Integer id) throws NotFoundException {

        ProdutoEntity produto = PRODUTOS.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Produto não encontrado"));

        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());
        produto.setQuantidade(produtoDTO.getQuantidade());

        return produto;
    }


}

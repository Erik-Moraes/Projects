package br.com.erik.spring_boot.controller;

import br.com.erik.spring_boot.database.model.ProdutoEntity;
import br.com.erik.spring_boot.dto.ProdutoDTO;
import br.com.erik.spring_boot.exception.NotFoundException;
import br.com.erik.spring_boot.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping ()
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){

        return produtoService.findAll();
    }

    @PostMapping()
    @ResponseStatus (HttpStatus.CREATED)
    public ProdutoEntity createProduct (@RequestBody ProdutoDTO produtoDTO){

        return produtoService.createProduct(produtoDTO);
    }

    @PutMapping ("/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public ProdutoEntity updateProduct (@PathVariable Integer id,
                                        @RequestBody ProdutoDTO produtoDTO) throws NotFoundException {

        return produtoService.updateProduct(produtoDTO, id);
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct (@PathVariable Integer id) {
        produtoService.deleteProduct(id);

    }

}



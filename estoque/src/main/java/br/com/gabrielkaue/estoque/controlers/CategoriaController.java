package br.com.gabrielkaue.estoque.controlers;

import br.com.gabrielkaue.estoque.model.Categoria;
import br.com.gabrielkaue.estoque.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping()
     public ResponseEntity<Categoria> inserir(@RequestBody Categoria categoria){
         Categoria categoriaSalvo = categoriaService.salvar(categoria);
         return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalvo);

     }
}

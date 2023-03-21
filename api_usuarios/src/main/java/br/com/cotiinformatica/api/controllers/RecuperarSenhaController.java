package br.com.cotiinformatica.api.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.PostRecuperarSenhaDTO;
import br.com.cotiinformatica.application.dtos.ResponseRecuperarSenhaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Recuperação de senha")
@RestController
public class RecuperarSenhaController {

	@ApiOperation("ENDPOINT para recuperação da senha de acesso do usuário.")
	@PostMapping("/api/recuperar-senha")
	public ResponseEntity<ResponseRecuperarSenhaDTO> post(@Valid @RequestBody PostRecuperarSenhaDTO dto) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}

}

package br.com.cotiinformatica.api.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.PostCriarContaDTO;
import br.com.cotiinformatica.application.dtos.ResponseCriarContaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Criação de conta de usuários")
@RestController
public class CriarContaController {

	@ApiOperation("ENDPOINT para cadastro de usuários.")
	@PostMapping("/api/criar-conta")
	public ResponseEntity<ResponseCriarContaDTO> post(@Valid @RequestBody PostCriarContaDTO dto) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
}

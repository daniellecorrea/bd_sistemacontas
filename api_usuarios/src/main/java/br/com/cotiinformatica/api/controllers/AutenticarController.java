package br.com.cotiinformatica.api.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.application.dtos.PostAutenticarDTO;
import br.com.cotiinformatica.application.dtos.ResponseAutenticarDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Autenticação de usuários")
@RestController
public class AutenticarController {

	@ApiOperation("ENDPOINT para autenticação de usuários e obtenção de Token.")
	@PostMapping("/api/autenticar")
	public ResponseEntity<ResponseAutenticarDTO> post(@Valid @RequestBody PostAutenticarDTO dto) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
}

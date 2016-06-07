package br.ufpb.dcx.lcc.ia.classificador.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class SystemController {

	@RequestMapping(value = "get", method = RequestMethod.GET)
	public ResponseEntity<?> testJson() {
		return new ResponseEntity(HttpStatus.OK);
	}
}

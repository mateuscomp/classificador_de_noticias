package br.ufpb.dcx.lcc.ia.classificador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.ufpb.dcx.lcc.ia.classificador.service.NewsService;

@Controller
@RequestMapping(value = "/system")
public class SystemController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "evaluateANews", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> evaluateANewsByTitle(@RequestParam(value = "title") String title) {
		title = title.replace("_", " ");

		boolean returnValue = newsService.rank(title);
		if (returnValue) {
			return ResponseEntity.ok("{\"message\" : \"It's a successful news\" }");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\" : \"It's a unsuccessful news\" }");
	}
}

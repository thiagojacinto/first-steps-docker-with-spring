package dev.dockerspring.pingapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingPongController {
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/ping")
	public void ping() {
		System.out.println("Ping");
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/pong")
	public void pong() {
		long start = System.nanoTime();
		System.out.println("Pong");
		long end = System.nanoTime();
		
		long elapsed = (end - start)/1000;
		System.out.println("Elapsed time: " + elapsed + " milliseconds.");
	}
}

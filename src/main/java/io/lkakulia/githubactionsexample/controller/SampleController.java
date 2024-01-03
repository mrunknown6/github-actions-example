package io.lkakulia.githubactionsexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {
	@GetMapping
	public List<String> getSample() {
		return List.of("sample1", "sample2");
	}
}

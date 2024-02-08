package com.anitebeti.quiz6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class QuizController {

    @GetMapping("/add/first/{first}/second/{second}")
    public String getSum(@PathVariable String first, @PathVariable String second) {
        BigInteger n1 = new BigInteger(first);
        BigInteger n2 = new BigInteger(second);
        BigInteger sum = n1.add(n2);

        return sum.toString();
    }


}

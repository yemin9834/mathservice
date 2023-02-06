package com.example.maths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MathService mathService;

    @PostMapping("/")
    public Result getAdditionResult(@RequestParam int no1,
                                    @RequestParam int no2){
       Result result = mathService.doAddition(no1, no2);
       return result;
    }
}

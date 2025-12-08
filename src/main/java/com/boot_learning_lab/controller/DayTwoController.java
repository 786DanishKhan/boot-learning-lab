package com.boot_learning_lab.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DayTwoController {
    @GetMapping("/users/10")
    public int getUsers(@RequestParam int id){
        return id;
    }

    @GetMapping("/calc")
    public String cal(){
        return 10 + 20 + "test";
    }

    @GetMapping("/x")
    public String x (@RequestParam(required = false) String name){
        return "hi" + name;
    }

    @PostMapping("/data")
    public String m(@RequestBody String name) {
        return name.toUpperCase();
    }

    @GetMapping("/mix")
    public String mix(){
        return "5" + 5 + 5;
    }

    @GetMapping("/use")
    public String u(@RequestParam int id) {
        return id + "-" ;
    }

    @GetMapping("/user")
    public String u(@RequestParam int id, @PathVariable int age) {
        return id + "-" + age;
    }

    @GetMapping("/calcc")
    public String c(){
        return "Result:" + (10/3);
    }

    @PostMapping("/add")
    public String add(@RequestBody int age){
        return "Age=" + age;
    }

    @GetMapping("/obj")
    public Object x(){
        return List.of(1,2,3);
    }

    @GetMapping("/v/{age}")
    public String t(@PathVariable int age, @PathVariable String name){ return ""; }

    @GetMapping("/r")
    public Integer r(){
        return null;
    }

    @GetMapping("/name")
    public String name(@RequestParam(defaultValue="Guest") int name){
        return "Hello " + name;
    }

    @GetMapping("/c")
    public String a(){
        return 5 + "5" + 5;
    }

    @GetMapping("/bool")
    public Boolean b(){
        return null;
    }

    @GetMapping("/zero")
    public int z(){
        return 100 / 0;
    }

    @GetMapping("/u/{id}")
    public String f(@RequestParam int id){
        return "ID=" + id;
    }

    @RestController
    @RequestMapping("/users")
    public class UserControl {

        @GetMapping("/{id}")
        public String getUser(@PathVariable int id) {
            return "User with ID: " + id;
        }
    }
}

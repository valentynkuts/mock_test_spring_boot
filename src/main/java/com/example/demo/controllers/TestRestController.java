package com.example.demo.controllers;
/*
Zadanie 2: TestRestController
Stwórz klasę TestRestController. Ma ona być kontrolerem restowym. Przygotuj listę obiektów jakiegoś typu (może być String).
Przygotuj metody i oznacz je mappingami GET, POST, DELETE.
GET ma zwracać wszystkie elementy listy
POST ma dodawać do listy
DELETE ma usuwać z listy
Następnie:
Stwórz metodę i Mapping GET który zwraca konkretny obiekt (np. po id). Użyj @PathVariable. Przyda się @RequestBody.
Stwórz metodę i Mapping PUT który aktualizuje / zmienia istniejący już obiekt.
Przyda się @RequestBody.
 */

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TestRestController {
    ArrayList<String> list = new ArrayList<String>();

    @GetMapping()
    public ArrayList<String> allElemetsOfList(){
        return list;
    }

    @PostMapping()
    public void addElemToList(String str){
        list.add(str);
    }

    @DeleteMapping()
    public void deleteElemFromList(String str){
        list.remove(str);
    }

    @GetMapping("/test/{index}")
    public String oneGetElemOfList(@PathVariable int index){
        return list.get(index);
    }

    @PutMapping("/test/{index}/{newString}")
    public String oneChangeElemOfList(@PathVariable int index,@PathVariable String newString){
        return list.set(index,newString);
    }

}

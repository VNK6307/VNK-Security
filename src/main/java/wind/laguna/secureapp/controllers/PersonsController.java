package wind.laguna.secureapp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wind.laguna.secureapp.models.Persons;
import wind.laguna.secureapp.services.PersonsService;

import java.util.List;

@RestController
@RequestMapping("/persons")
@AllArgsConstructor
public class PersonsController {
    private PersonsService personsService;

    @GetMapping
    public List<Persons> showAll() {
        return personsService.findAll();
    }

    @GetMapping("/by-city")
    public List<Persons> showPersonsByCity(@RequestParam String city) {
        return personsService.findByCity(city);
    }

    @GetMapping("/by-age")
    public List<Persons> showPersonsByAge(@RequestParam int age) {
        return personsService.findByAge(age);
    }

    @GetMapping("/by-fio")
    public Persons showByFio(@RequestParam String name, String surname) {
        return personsService.findByFio(name, surname);
    }
}

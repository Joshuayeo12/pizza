package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.PizzaRepo;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepo pizzaRepo;

}

package com.project.coffeePreparationStep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeePreparationStepServiceImpl implements CoffeePreparationStepService{

    @Autowired
    private CoffeePreparationStepRepository coffeePreparationStepRepository;
}

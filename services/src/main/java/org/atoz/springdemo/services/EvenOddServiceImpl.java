package org.atoz.springdemo.services;

import org.springframework.stereotype.Service;

@Service
public class EvenOddServiceImpl implements EvenOddService {
    @Override
    public String isEvenOrOdd(Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}

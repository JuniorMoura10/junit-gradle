package com.aula.junit.test;

import com.aula.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class pessoaTeste {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Jullya", LocalDateTime.of(2015, 12, 9, 8, 30));
        Assertions.assertEquals(6, pessoa.getIdade());
    }
}

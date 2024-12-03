package com.example;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemLista(){
        Mockito.when(letras.get(0).thenReturn("B"));

        Assertions.assertEquals("B", letras.get(0));
        }
    }

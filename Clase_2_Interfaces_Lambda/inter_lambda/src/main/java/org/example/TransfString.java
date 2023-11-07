package org.example;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface TransfString {
    List<String>transform(List<String>lista);
     static List<String> transformador(List<String>lista){
        return lista.stream().map(nombre->nombre.toUpperCase()).collect(Collectors.toList());
    }
}

package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RdfResourceId {

    private final String id;


    @Override
    public String toString() {
        return id;
    }
}

package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RdfObjectProperty {

    private final RdfResourceProperty property;

    private final RdfResourceId resourceId;


}

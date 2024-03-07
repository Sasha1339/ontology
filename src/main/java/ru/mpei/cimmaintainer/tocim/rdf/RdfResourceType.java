package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RdfResourceType {
    private final NamespaceXml namespace;
    private final String name;

}

package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RdfDataProperty {
    private final RdfResourceProperty property;
    private final String value;


    @Override
    public String toString() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("\t\t<")
                .append(property.getType().getNamespace().getAlias()).append(":")
                .append(property.getType().getName())
                .append(".")
                .append(property.getName())
                .append(">")
                .append(value)
                .append("</")
                .append(property.getType().getNamespace().getAlias()).append(":")
                .append(property.getType().getName())
                .append(".")
                .append(property.getName())
                .append(">");
        return xmlBuilder.toString();
    }
}

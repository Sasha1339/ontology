package ru.mpei.cimmaintainer.tocim.rdf;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class RdfResource{
    private final RdfResourceId id;
    private final RdfResourceType type;
    private final List<RdfDataProperty> dataProperties;
    private final List<RdfObjectProperty> objectProperties;


    @Override
    public String toString() {
        StringBuilder xmlBuilder = new StringBuilder();

        xmlBuilder.append("\t<").append(type.getNamespace().getAlias())
                .append(":").append(type.getName()).append(" rdf:ID = \"_").append(id).append("\">\n");

        dataProperties.forEach(e -> xmlBuilder.append(e).append("\n"));
            //TODO: objectProp
        xmlBuilder.append("\t</").append(type.getNamespace().getAlias())
                .append(":").append(type.getName()).append(">\n");

        return xmlBuilder.toString();
    }
}

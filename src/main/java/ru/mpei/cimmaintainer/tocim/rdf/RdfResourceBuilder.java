package ru.mpei.cimmaintainer.tocim.rdf;

import java.util.ArrayList;
import java.util.List;


public class RdfResourceBuilder {

    private final RdfResourceId id;
    private final RdfResourceType type;

    private final List<RdfDataProperty> dataProperties = new ArrayList<>();
    private final List<RdfObjectProperty> objectProperties = new ArrayList<>();

    public RdfResourceBuilder(RdfResourceId id, RdfResourceType type) {
        this.id = id;
        this.type = type;
    }

    public RdfResourceBuilder addDataProperty(
            RdfResourceProperty property,
            String value
    ) {
        this.dataProperties.add(new RdfDataProperty(property, value));
        return this;
    }

    public RdfResourceBuilder addObjectProperty(
            RdfResourceProperty property,
            RdfResourceId resourceId
    ) {
        this.objectProperties.add(new RdfObjectProperty(property, resourceId));
        return this;
    }

    public RdfResource build() {
        return new RdfResource(id, type, dataProperties, objectProperties);
    }

}

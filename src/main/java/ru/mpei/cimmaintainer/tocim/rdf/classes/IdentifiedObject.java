package ru.mpei.cimmaintainer.tocim.rdf.classes;

import ru.mpei.cimmaintainer.tocim.rdf.NamespaceXml;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourceProperty;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourceType;

public class IdentifiedObject extends RdfResourceType {

    public IdentifiedObject(NamespaceXml namespace, String name) {
        super(namespace, name);
    }

    public RdfResourceProperty mRID = new RdfResourceProperty(this, "mRID") ;
    public RdfResourceProperty name= new RdfResourceProperty(this, "name") ;

}

package ru.mpei.cimmaintainer.tocim.rdf;

import ru.mpei.cimmaintainer.tocim.rdf.classes.IdentifiedObject;

public class CimClasses {

    public static IdentifiedObject identifiedObject = new IdentifiedObject(
            CimNamespaces.cim,
            "IdentifiedObject"
    );

    public static RdfResourceType substation = new RdfResourceType(CimNamespaces.cim, "Substation");
    public static RdfResourceType line = new RdfResourceType(CimNamespaces.cim, "Line");

    public static class Some {

    }

}

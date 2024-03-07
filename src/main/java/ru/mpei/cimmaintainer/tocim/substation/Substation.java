package ru.mpei.cimmaintainer.tocim.substation;

import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourceBuilder;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResourceId;
import ru.mpei.cimmaintainer.tocim.rdf.CimClasses;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class Substation {

    public static List<RdfResource> convert(RawSchemeDto scheme){
        return scheme.getSubstations().stream()
                .map(e -> new RdfResourceBuilder(new RdfResourceId(e.getId()), CimClasses.substation)
                        .addDataProperty(CimClasses.identifiedObject.mRID, e.getId())
                        .addDataProperty(CimClasses.identifiedObject.name, e.getName())
                        .build())
                .toList();
    }

}

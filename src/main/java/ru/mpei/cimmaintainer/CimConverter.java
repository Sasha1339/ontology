package ru.mpei.cimmaintainer;

import kotlin.NotImplementedError;
import ru.mpei.cimmaintainer.tocim.rdf.RdfResource;
import ru.mpei.cimmaintainer.tocim.substation.Substation;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.util.List;

public class CimConverter {
    public static String toCim(RawSchemeDto scheme) {
        List<RdfResource> resources = Substation.convert(scheme);
        throw new NotImplementedError();
    }
}

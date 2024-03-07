package ru.mpei.cimmaintainer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.nti.dtps.dto.scheme.RawSchemeDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.fasterxml.jackson.module.kotlin.ExtensionsKt.jacksonObjectMapper;

public class TestClass {

    private ObjectMapper mapper = jacksonObjectMapper();

    @Test
    public void test() throws IOException {
        var json = Files.readString(Paths.get("src/test/resources/lr1_scheme.json"));
        var scheme = mapper.readValue(json, RawSchemeDto.class);
        var cim = CimConverter.toCim(scheme);
        Assertions.assertNotNull(cim);
    }

//    @Test
//    public void test2() {
//        var resourceSubstation = new RdfResourceBuilder(
//                new RdfResourceId("c4b66487-d98a-4d8a-87f4-142124b18e14"), CimClasses.substation
//        )
//                .addDataProperty(
//                        CimClasses.identifiedObject.mRID, "c4b66487-d98a-4d8a-87f4-142124b18e14"
//                )
//                .addDataProperty(CimClasses.identifiedObject.name, "Substation 1")
//                .build();
//
//        System.out.println(resourceSubstation);
//    }

}

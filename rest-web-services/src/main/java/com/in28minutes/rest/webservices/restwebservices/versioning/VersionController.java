package com.in28minutes.rest.webservices.restwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
   @GetMapping("v1/getperson")
    public PersonV1  getPersonV1()
    {
        return new PersonV1("Omer Asif");
    }
    @GetMapping("v2/getperson")
    public PersonV2  getPersonV2()
    {
        return new PersonV2(new Name("Omer","Asif"));
    }

    @GetMapping(value="getperson/params",params="version=1")
    public PersonV1  getParamsv1()
    {
        return new PersonV1("Omer Asif");
    }
    @GetMapping(value="getperson/params",params="version=2")
    public PersonV2  getParamsv2()
    {
        return new PersonV2(new Name("Omer","Asif"));
    }
    @GetMapping(value="getperson/headers",headers="version=1")
    public PersonV1  getHeadersv1()
    {
        return new PersonV1("Omer Asif");
    }
    @GetMapping(value="getperson/headers",headers="version=2")
    public PersonV2  getHeadersv2()
    {
        return new PersonV2(new Name("Omer","Asif"));
    }
    @GetMapping(value="getperson/produces",produces="application/companys.v1+json")
    public PersonV1  getJsonv1()
    {
        return new PersonV1("Omer Asif");
    }
    @GetMapping(value="getperson/produces",produces="application/companys.v2+json")
    public PersonV2  getJsonv2()
    {
        return new PersonV2(new Name("Omer","Asif"));
    }

}

package com.in28minutes.rest.webservices.restwebservices.user;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filteringController {
@GetMapping("/retrieveFilter")
public MappingJacksonValue getBeam(){
    SimpleBeanPropertyFilter filter;
    filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
    FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeamFilter",filter);
    SomeBeam someBeam = new SomeBeam("Value1", "Value2", "Value3");

    MappingJacksonValue mappingJacksonValue = new  MappingJacksonValue(someBeam);
    mappingJacksonValue.setFilters(filterProvider);

    return mappingJacksonValue;

}

}

package com.poc.gateway.pocapigateway;

/**
 * Created by octaviocarpes on 2/4/18.
 */
import java.util.Date;

import com.poc.gateway.pocapigateway.pojo.Ilegran;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class IlegranController {
        @RequestMapping(value = "/echoIlegranName/{name}")
        public String echoIlegranName(@PathVariable(name = "name") String name){
            return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
        }

        @RequestMapping(value = "/getIlegranDetails/{name}")
        public Ilegran getIlegranDetails(@PathVariable(name = "name") String name){
            return new Ilegran(name, "JT");
        }

    }


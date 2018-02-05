package com.poc.gateway.pocapigatewayzuul;
import com.poc.gateway.pocapigatewayzuul.filters.ErrorFilter;
import com.poc.gateway.pocapigatewayzuul.filters.PostFilter;
import com.poc.gateway.pocapigatewayzuul.filters.PreFilter;
import com.poc.gateway.pocapigatewayzuul.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;



@EnableZuulProxy
@SpringBootApplication
public class PocApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApiGatewayZuulApplication.class, args);

	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}

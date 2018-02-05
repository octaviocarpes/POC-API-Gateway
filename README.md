# POC-API-Gateway
<p>
A POC of how does an API Gateway works. Made with Spring Cloud and Zuul.
In this repository i made a Proof of Concept of a API Gateway in java.
To use it run both projects and then, if everything is working, access this 2 links:

<ul>
<li>
<a href="http://localhost:8090/getIlegranDetails/Octavio">http://localhost:8090/getIlegranDetails/{insert a name after the dash}</a>
</li>
<li>
<a href="http://localhost:8100/ilegran/getIlegranDetails/Octavio">http://localhost:8100/ilegran/getIlegranDetails/{insert a name after the dash}</a>
</li>
</ul>
</p>
<p>
The first link represents a service without the gateway and the second one represents the same service with the API Gateway.
</p>


# Resources:
<ul>
<li>
<a href="https://howtodoinjava.com/spring/spring-cloud/spring-cloud-api-gateway-zuul/">https://howtodoinjava.com/spring/spring-cloud/spring-cloud-api-gateway-zuul/</a>
</li>
</ul>

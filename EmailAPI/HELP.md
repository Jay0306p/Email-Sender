# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

---------------------------------------------

* @RestController is nothing but the shortcut to use both @Controller and @ResponseBody annotation together.
* @Controller is used to controller which can accept and return HTML
  while @RestController annotation can be used to return JSON response.

* RequestMapping is used to define the url by which we can call this.(By default its a GET method).

*@Component is a generic stereotype for any Spring-managed component or bean. @Repository is a stereotype for the
persistence layer. @Service is a stereotype for the service layer. @Controller is a stereotype for the presentation
layer (spring-MVC).

---------------
Create & use app passwords
Account
Important: To create an app password, you need 2-Step Verification on your Google If you use 2-Step-Verification and get
a "password incorrect error when you sign in, you can
try to use an app password.

1. Go to your Google Account .
2. Select Security.
3. Under "Signing in to Google," select 2-Step Verification.
4. At the bottom of the page, select App passwords.
5. Enter a name that helps you remember where you'll use the app password.
6. Select Generate.
7. To enter the app password, follow the instructions on your screen. The app password is the
   16-character code that generates on your device.
8. Select Done.

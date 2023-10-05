# Advanced Java course

We will implement easy greeting service. In the app, you can see these packages:

1) Service - Implement business logic of the application.
2) Persistence - Simulates persistence layer of the application.

> Note: We are introducing core of the spring application. We don't want to care about WEB and DATA module.

You can find *SpringIntroductionApplication* in the project structure which contains main method.
Main method is working with application context for loading bean *GreetingService* and print result of the method to the
console.

If you run the application, the initialization of the application will fail due to unexpected state of the application
context.

Check the maven definition. We are using spring core a spring validator at the moment.

## GreetingRepository

This interface defines contract of the application's persistence layer. You should implement two implementation
with different behaviour:

First implementation (*GreetingConstantRepositoryImpl*) return a constant of the method:

```java
    public String getGreetingText(){
        return "Hello from Mongo";
        }
```

Second implementation (*GreetingFileRepositoryImpl*) load text from the configuration properties. As a properties use
this content:

```text
Key: `spring-introduction.greeting.text`, Value: Hello configuration properties file.
```

Method should be similar to:

```java
    public String getGreetingText(){
        return properties.getText();
        }
```

## GreetingService

Your goal is to implement two methods of the greeting service (*GreetingServiceImpl*) .
Both method will use with interface `GreetingRepository`.

1. Method Will use *GreetingConstantRepositoryImpl* for loading greeting text
2. Method Will use *GreetingFileRepositoryImpl* for loading greeting text

## Configuration

I have a few conditions for your spring configuration due to the educations reasons.

*ConfigurationProperties*:

1) Use configuration properties instead of @Value
2) Use validator on the attribute

*GreetingFileRepositoryImpl*:

1) Use annotation for the bean definition
2) It doesn't matter on the type of the autowiring

*GreetingConstantRepositoryImpl*:

1) Use @Bean annotation in special configuration class

# Result

If you do everything right, the application should start with expected result of the console:

```text
Constant: TextHello from Mongo
FileText: Hello configuration properties file
```

If you match the expected result, contact teacher. You can receive 1pt.

If you want to receive another point, move *SpringIntroductionApplication* to the
package `cz.inventi.kpj.spring.springintroduction.application` and try to start the application again - it shouldn't
start.

1. Do you know a reason? (1 point)
2. If you fix that you will receive 1 point.
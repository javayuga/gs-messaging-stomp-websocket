# Websocket with Spring Boot and Nuxt

This is a modified version of the code example from [https://spring.io/guides/gs/messaging-stomp-websocket/](https://spring.io/guides/gs/messaging-stomp-websocket/)

1. changed the project structure, no need for initial and complete folders, source code is now available at the root of the project


# Concepts

**WebSocket** is a thin,lightweight layer above TCP. This makes it suitable for using "`subprotocols`" to embed messages.

In this guide, we use [STOMP](http://en.wikipedia.org/wiki/Streaming_Text_Oriented_Messaging_Protocol) messaging with Spring to create an interactive web application.

STOMP is a subprotocol operating on top of the lower-level WebSocket.


**Spring Boot** is the leading Java framework to build powerful apps and components according to the microservices architecture:

[Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)

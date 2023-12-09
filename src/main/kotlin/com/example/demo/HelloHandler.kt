package com.example.demo

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class HelloHandler {
    fun helloWorld(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().bodyValue("Hello, World!")
    }
}

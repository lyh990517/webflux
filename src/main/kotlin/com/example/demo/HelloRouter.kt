package com.example.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class HelloRouter(private val handler: HelloHandler) {

    @Bean
    fun helloRoutes() = router {
        "/hello".nest {
            accept(MediaType.APPLICATION_JSON).nest {
                GET("", handler::helloWorld)
            }
        }
    }
}
package com.danielqueiroz

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.routing.header
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.html.*

fun main() {
    embeddedServer(Netty, port = 8080, watchPaths = listOf("classes", "resources")){
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        static {
            resources("static")
        }
        get(path = "/") {
            call.respondText { "Hello, Ktor Word!" }
        }
        get("/welcome") {
            val name = call.request.queryParameters["name"]
            call.respondHtml(HttpStatusCode.OK) {
                head {
                    title { +"Welcome to Ktor" }
                }
                body {
                    if (name.isNullOrEmpty())
                        h3 { +"Hello, this is a Html page." }
                    else
                        h3 { +"Hello $name, this is a Html page." }
                }
            }
        }
    }
}
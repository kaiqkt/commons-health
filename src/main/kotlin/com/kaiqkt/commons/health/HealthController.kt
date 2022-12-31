package com.kaiqkt.commons.health

import org.springframework.boot.info.BuildProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HealthController(
    private val buildProperties: BuildProperties
) {

    @GetMapping("/health")
    fun health(): Map<String, Any> {

        return mapOf(
            "application-name" to buildProperties.name,
            "application-version" to buildProperties.version
        )
    }
}




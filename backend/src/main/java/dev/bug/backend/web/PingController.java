package dev.bug.backend.web;

import dev.bug.api.ra.openapi.PingApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController implements PingApi {

    @Override
    @GetMapping("/ping")
    @ResponseBody
    public ResponseEntity<String> ping() {
        return null;
    }
}

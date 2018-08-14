package vnext.vn.jenkidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vnext.vn.jenkidemo.models.Getting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GettingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(name = "/getting", method = RequestMethod.GET)
    public Getting getting(@RequestParam(value = "name", defaultValue = "Sangnd") String name) {
        return new Getting(counter.incrementAndGet(),
                String.format(template, name));
    }
}

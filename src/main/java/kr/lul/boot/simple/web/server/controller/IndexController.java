/**
 * @see https://github.com/JustBurrow/java-lulkr-spring-data-jpa
 */
package kr.lul.boot.simple.web.server.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Just Burrow
 * @since 2016. 8. 24.
 */
@Controller
@RequestMapping("/")
public class IndexController {
  @RequestMapping
  public String index(final Model model) {
    model.addAttribute("instant", Instant.now());
    model.addAttribute("ldt", LocalDateTime.now());
    model.addAttribute("zone", ZoneId.systemDefault());
    model.addAttribute("zdt", ZonedDateTime.now());
    return "index/index";
  }
}

/**
 * @see https://github.com/JustBurrow/java-lulkr-spring-data-jpa
 */
package kr.lul.simple.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Just Burrow
 * @since 2016. 8. 23.
 */
@SpringBootApplication
public class Runner {
  /**
   * @param args
   * @author Just Burrow
   * @since 2016. 8. 23.
   */
  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }
}

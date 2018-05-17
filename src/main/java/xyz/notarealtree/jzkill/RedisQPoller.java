package xyz.notarealtree.jzkill;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.notarealtree.jzkill.model.Package;
import xyz.notarealtree.jzkill.model.RedisQResponse;

import java.io.IOException;
import java.util.Optional;

public class RedisQPoller {
    private static final Logger log = LoggerFactory.getLogger(RedisQPoller.class);
    private static final String REDIS_Q_URL = "https://redisq.zkillboard.com/listen.php";
    private final ObjectMapper objectMapper;

    public RedisQPoller() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());
    }

    public Optional<Package> poll() {
        try {
            String body = Unirest.get(REDIS_Q_URL)
                    .asJson()
                    .getBody()
                    .toString();
            return objectMapper.readValue(body, RedisQResponse.class).getMaybePackage();
        } catch (UnirestException e) {
            log.error("An error occurred while polling the ZKB Redis Q", e);
        } catch (IOException e) {
            log.error("An error occurred while parsing response json", e);
        }
        return Optional.empty();
    }
}

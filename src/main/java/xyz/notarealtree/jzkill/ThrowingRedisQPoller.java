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

public class ThrowingRedisQPoller {
    private static final Logger log = LoggerFactory.getLogger(ThrowingRedisQPoller.class);
    private static final String REDIS_Q_URL = "https://redisq.zkillboard.com/listen.php";
    private final ObjectMapper objectMapper;

    public ThrowingRedisQPoller() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());
    }

    public Optional<Package> poll() throws UnirestException, IOException {
        String body = Unirest.get(REDIS_Q_URL)
                .asJson()
                .getBody()
                .toString();
        return objectMapper.readValue(body, RedisQResponse.class).getMaybePackage();
    }
}

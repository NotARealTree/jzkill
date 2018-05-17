package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableRedisQResponse.class)
@JsonSerialize(as = ImmutableRedisQResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface RedisQResponse {
    @JsonProperty("package")
    Optional<Package> getMaybePackage();
}

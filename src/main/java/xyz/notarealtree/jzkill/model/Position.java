package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutablePosition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Position {
    @JsonProperty("x")
    double getX();
    @JsonProperty("y")
    double getY();
    @JsonProperty("z")
    double getZ();
}

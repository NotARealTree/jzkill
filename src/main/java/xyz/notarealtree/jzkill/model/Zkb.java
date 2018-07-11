package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableZkb.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Zkb {
    @JsonProperty("locationID")
    Optional<Long> getLocationId();
    @JsonProperty("hash")
    String getHash();
    @JsonProperty("fittedValue")
    double getFittedValue();
    @JsonProperty("totalValue")
    double getTotalValue();
    @JsonProperty("points")
    long points();
    @JsonProperty("npc")
    boolean getNpc();
    @JsonProperty("solo")
    boolean getSolo();
    @JsonProperty("awox")
    boolean getAwox();
    @JsonProperty("href")
    String getHref();
}

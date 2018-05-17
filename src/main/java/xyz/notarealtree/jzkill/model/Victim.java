package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableVictim.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Victim {
    @JsonProperty("alliance_id")
    Optional<Long> getAllianceId();
    @JsonProperty("character_id")
    Optional<Long> getCharacterId();
    @JsonProperty("corporation_id")
    long getCorporationId();
    @JsonProperty("damage_taken")
    long getDamageTaken();
    @JsonProperty("items")
    List<Item> getItems();
    @JsonProperty("position")
    Position getPosition();
    @JsonProperty("ship_type_id")
    long getShipTypeId();
}

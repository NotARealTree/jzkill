package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableAttacker.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Attacker {
    @JsonProperty("alliance_id")
    Optional<Long> getAllianceId();
    @JsonProperty("character_id")
    Optional<Long> getCharacterId();
    @JsonProperty("corporation_id")
    Optional<Long> getCorporationId();
    @JsonProperty("damage_done")
    long getDamageDone();
    @JsonProperty("final_blow")
    boolean getFinalBlow();
    @JsonProperty("security_status")
    Optional<Double> getSecurityStatus();
    @JsonProperty("ship_type_id")
    Optional<Long> getShipTypeId();
    @JsonProperty("weapon_type_id")
    Optional<Long> getWeaponTypeId();
}

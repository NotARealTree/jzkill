package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableKillMail.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Value.Style(jdkOnly=true)
public interface KillMail {
    @JsonProperty("attackers")
    List<Attacker> getAttackers();
    @JsonProperty("killmail_id")
    long getKillmailId();
    @JsonProperty("killmail_time")
    String getKillmailTime();
    @JsonProperty("solar_system_id")
    long getSolarSystemId();
    @JsonProperty("victim")
    Victim getVictim();
}

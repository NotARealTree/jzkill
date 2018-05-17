package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableItem.class)
@JsonSerialize(as = ImmutableItem.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Item {
    @JsonProperty("flag")
    long getFlag();
    @JsonProperty("item_type_id")
    long getItemTypeId();
    @JsonProperty("quantity_dropped")
    Optional<Long> getQuantityDropped();
    @JsonProperty("singleton")
    long singleton();
}

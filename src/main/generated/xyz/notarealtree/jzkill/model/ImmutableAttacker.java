package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Attacker}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttacker.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Attacker"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableAttacker implements Attacker {
  private final Long allianceId;
  private final Long characterId;
  private final Long corporationId;
  private final long damageDone;
  private final boolean finalBlow;
  private final Double securityStatus;
  private final long shipTypeId;
  private final long weaponTypeId;

  private ImmutableAttacker(
      Long allianceId,
      Long characterId,
      Long corporationId,
      long damageDone,
      boolean finalBlow,
      Double securityStatus,
      long shipTypeId,
      long weaponTypeId) {
    this.allianceId = allianceId;
    this.characterId = characterId;
    this.corporationId = corporationId;
    this.damageDone = damageDone;
    this.finalBlow = finalBlow;
    this.securityStatus = securityStatus;
    this.shipTypeId = shipTypeId;
    this.weaponTypeId = weaponTypeId;
  }

  /**
   * @return The value of the {@code allianceId} attribute
   */
  @JsonProperty("alliance_id")
  @Override
  public Optional<Long> getAllianceId() {
    return Optional.ofNullable(allianceId);
  }

  /**
   * @return The value of the {@code characterId} attribute
   */
  @JsonProperty("character_id")
  @Override
  public Optional<Long> getCharacterId() {
    return Optional.ofNullable(characterId);
  }

  /**
   * @return The value of the {@code corporationId} attribute
   */
  @JsonProperty("corporation_id")
  @Override
  public Optional<Long> getCorporationId() {
    return Optional.ofNullable(corporationId);
  }

  /**
   * @return The value of the {@code damageDone} attribute
   */
  @JsonProperty("damage_done")
  @Override
  public long getDamageDone() {
    return damageDone;
  }

  /**
   * @return The value of the {@code finalBlow} attribute
   */
  @JsonProperty("final_blow")
  @Override
  public boolean getFinalBlow() {
    return finalBlow;
  }

  /**
   * @return The value of the {@code securityStatus} attribute
   */
  @JsonProperty("security_status")
  @Override
  public Optional<Double> getSecurityStatus() {
    return Optional.ofNullable(securityStatus);
  }

  /**
   * @return The value of the {@code shipTypeId} attribute
   */
  @JsonProperty("ship_type_id")
  @Override
  public long getShipTypeId() {
    return shipTypeId;
  }

  /**
   * @return The value of the {@code weaponTypeId} attribute
   */
  @JsonProperty("weapon_type_id")
  @Override
  public long getWeaponTypeId() {
    return weaponTypeId;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attacker#getAllianceId() allianceId} attribute.
   * @param value The value for allianceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withAllianceId(long value) {
    Long newValue = value;
    if (Objects.equals(this.allianceId, newValue)) return this;
    return new ImmutableAttacker(
        newValue,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attacker#getAllianceId() allianceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allianceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withAllianceId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.allianceId, value)) return this;
    return new ImmutableAttacker(
        value,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attacker#getCharacterId() characterId} attribute.
   * @param value The value for characterId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withCharacterId(long value) {
    Long newValue = value;
    if (Objects.equals(this.characterId, newValue)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        newValue,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attacker#getCharacterId() characterId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characterId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withCharacterId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.characterId, value)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        value,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attacker#getCorporationId() corporationId} attribute.
   * @param value The value for corporationId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withCorporationId(long value) {
    Long newValue = value;
    if (Objects.equals(this.corporationId, newValue)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        newValue,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attacker#getCorporationId() corporationId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for corporationId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withCorporationId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.corporationId, value)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        value,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Attacker#getDamageDone() damageDone} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for damageDone
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttacker withDamageDone(long value) {
    if (this.damageDone == value) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        value,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Attacker#getFinalBlow() finalBlow} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for finalBlow
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttacker withFinalBlow(boolean value) {
    if (this.finalBlow == value) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageDone,
        value,
        this.securityStatus,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attacker#getSecurityStatus() securityStatus} attribute.
   * @param value The value for securityStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withSecurityStatus(double value) {
    Double newValue = value;
    if (Objects.equals(this.securityStatus, newValue)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        newValue,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attacker#getSecurityStatus() securityStatus} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttacker withSecurityStatus(Optional<Double> optional) {
    Double value = optional.orElse(null);
    if (Objects.equals(this.securityStatus, value)) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        value,
        this.shipTypeId,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Attacker#getShipTypeId() shipTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for shipTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttacker withShipTypeId(long value) {
    if (this.shipTypeId == value) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        value,
        this.weaponTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Attacker#getWeaponTypeId() weaponTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for weaponTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttacker withWeaponTypeId(long value) {
    if (this.weaponTypeId == value) return this;
    return new ImmutableAttacker(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageDone,
        this.finalBlow,
        this.securityStatus,
        this.shipTypeId,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttacker} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttacker
        && equalTo((ImmutableAttacker) another);
  }

  private boolean equalTo(ImmutableAttacker another) {
    return Objects.equals(allianceId, another.allianceId)
        && Objects.equals(characterId, another.characterId)
        && Objects.equals(corporationId, another.corporationId)
        && damageDone == another.damageDone
        && finalBlow == another.finalBlow
        && Objects.equals(securityStatus, another.securityStatus)
        && shipTypeId == another.shipTypeId
        && weaponTypeId == another.weaponTypeId;
  }

  /**
   * Computes a hash code from attributes: {@code allianceId}, {@code characterId}, {@code corporationId}, {@code damageDone}, {@code finalBlow}, {@code securityStatus}, {@code shipTypeId}, {@code weaponTypeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(allianceId);
    h += (h << 5) + Objects.hashCode(characterId);
    h += (h << 5) + Objects.hashCode(corporationId);
    h += (h << 5) + Long.hashCode(damageDone);
    h += (h << 5) + Boolean.hashCode(finalBlow);
    h += (h << 5) + Objects.hashCode(securityStatus);
    h += (h << 5) + Long.hashCode(shipTypeId);
    h += (h << 5) + Long.hashCode(weaponTypeId);
    return h;
  }

  /**
   * Prints the immutable value {@code Attacker} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Attacker{");
    if (allianceId != null) {
      builder.append("allianceId=").append(allianceId);
    }
    if (characterId != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("characterId=").append(characterId);
    }
    if (corporationId != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("corporationId=").append(corporationId);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("damageDone=").append(damageDone);
    builder.append(", ");
    builder.append("finalBlow=").append(finalBlow);
    if (securityStatus != null) {
      builder.append(", ");
      builder.append("securityStatus=").append(securityStatus);
    }
    builder.append(", ");
    builder.append("shipTypeId=").append(shipTypeId);
    builder.append(", ");
    builder.append("weaponTypeId=").append(weaponTypeId);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Attacker {
    Optional<Long> allianceId = Optional.empty();
    Optional<Long> characterId = Optional.empty();
    Optional<Long> corporationId = Optional.empty();
    long damageDone;
    boolean damageDoneIsSet;
    boolean finalBlow;
    boolean finalBlowIsSet;
    Optional<Double> securityStatus = Optional.empty();
    long shipTypeId;
    boolean shipTypeIdIsSet;
    long weaponTypeId;
    boolean weaponTypeIdIsSet;
    @JsonProperty("alliance_id")
    public void setAllianceId(Optional<Long> allianceId) {
      this.allianceId = allianceId;
    }
    @JsonProperty("character_id")
    public void setCharacterId(Optional<Long> characterId) {
      this.characterId = characterId;
    }
    @JsonProperty("corporation_id")
    public void setCorporationId(Optional<Long> corporationId) {
      this.corporationId = corporationId;
    }
    @JsonProperty("damage_done")
    public void setDamageDone(long damageDone) {
      this.damageDone = damageDone;
      this.damageDoneIsSet = true;
    }
    @JsonProperty("final_blow")
    public void setFinalBlow(boolean finalBlow) {
      this.finalBlow = finalBlow;
      this.finalBlowIsSet = true;
    }
    @JsonProperty("security_status")
    public void setSecurityStatus(Optional<Double> securityStatus) {
      this.securityStatus = securityStatus;
    }
    @JsonProperty("ship_type_id")
    public void setShipTypeId(long shipTypeId) {
      this.shipTypeId = shipTypeId;
      this.shipTypeIdIsSet = true;
    }
    @JsonProperty("weapon_type_id")
    public void setWeaponTypeId(long weaponTypeId) {
      this.weaponTypeId = weaponTypeId;
      this.weaponTypeIdIsSet = true;
    }
    @Override
    public Optional<Long> getAllianceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> getCharacterId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> getCorporationId() { throw new UnsupportedOperationException(); }
    @Override
    public long getDamageDone() { throw new UnsupportedOperationException(); }
    @Override
    public boolean getFinalBlow() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> getSecurityStatus() { throw new UnsupportedOperationException(); }
    @Override
    public long getShipTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public long getWeaponTypeId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttacker fromJson(Json json) {
    ImmutableAttacker.Builder builder = ImmutableAttacker.builder();
    if (json.allianceId != null) {
      builder.allianceId(json.allianceId);
    }
    if (json.characterId != null) {
      builder.characterId(json.characterId);
    }
    if (json.corporationId != null) {
      builder.corporationId(json.corporationId);
    }
    if (json.damageDoneIsSet) {
      builder.damageDone(json.damageDone);
    }
    if (json.finalBlowIsSet) {
      builder.finalBlow(json.finalBlow);
    }
    if (json.securityStatus != null) {
      builder.securityStatus(json.securityStatus);
    }
    if (json.shipTypeIdIsSet) {
      builder.shipTypeId(json.shipTypeId);
    }
    if (json.weaponTypeIdIsSet) {
      builder.weaponTypeId(json.weaponTypeId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Attacker} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Attacker instance
   */
  public static ImmutableAttacker copyOf(Attacker instance) {
    if (instance instanceof ImmutableAttacker) {
      return (ImmutableAttacker) instance;
    }
    return ImmutableAttacker.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttacker ImmutableAttacker}.
   * @return A new ImmutableAttacker builder
   */
  public static ImmutableAttacker.Builder builder() {
    return new ImmutableAttacker.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttacker ImmutableAttacker}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DAMAGE_DONE = 0x1L;
    private static final long INIT_BIT_FINAL_BLOW = 0x2L;
    private static final long INIT_BIT_SHIP_TYPE_ID = 0x4L;
    private static final long INIT_BIT_WEAPON_TYPE_ID = 0x8L;
    private long initBits = 0xfL;

    private Long allianceId;
    private Long characterId;
    private Long corporationId;
    private long damageDone;
    private boolean finalBlow;
    private Double securityStatus;
    private long shipTypeId;
    private long weaponTypeId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Attacker} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Attacker instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Long> allianceIdOptional = instance.getAllianceId();
      if (allianceIdOptional.isPresent()) {
        allianceId(allianceIdOptional);
      }
      Optional<Long> characterIdOptional = instance.getCharacterId();
      if (characterIdOptional.isPresent()) {
        characterId(characterIdOptional);
      }
      Optional<Long> corporationIdOptional = instance.getCorporationId();
      if (corporationIdOptional.isPresent()) {
        corporationId(corporationIdOptional);
      }
      damageDone(instance.getDamageDone());
      finalBlow(instance.getFinalBlow());
      Optional<Double> securityStatusOptional = instance.getSecurityStatus();
      if (securityStatusOptional.isPresent()) {
        securityStatus(securityStatusOptional);
      }
      shipTypeId(instance.getShipTypeId());
      weaponTypeId(instance.getWeaponTypeId());
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getAllianceId() allianceId} to allianceId.
     * @param allianceId The value for allianceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder allianceId(long allianceId) {
      this.allianceId = allianceId;
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getAllianceId() allianceId} to allianceId.
     * @param allianceId The value for allianceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alliance_id")
    public final Builder allianceId(Optional<Long> allianceId) {
      this.allianceId = allianceId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getCharacterId() characterId} to characterId.
     * @param characterId The value for characterId
     * @return {@code this} builder for chained invocation
     */
    public final Builder characterId(long characterId) {
      this.characterId = characterId;
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getCharacterId() characterId} to characterId.
     * @param characterId The value for characterId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("character_id")
    public final Builder characterId(Optional<Long> characterId) {
      this.characterId = characterId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getCorporationId() corporationId} to corporationId.
     * @param corporationId The value for corporationId
     * @return {@code this} builder for chained invocation
     */
    public final Builder corporationId(long corporationId) {
      this.corporationId = corporationId;
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getCorporationId() corporationId} to corporationId.
     * @param corporationId The value for corporationId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("corporation_id")
    public final Builder corporationId(Optional<Long> corporationId) {
      this.corporationId = corporationId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Attacker#getDamageDone() damageDone} attribute.
     * @param damageDone The value for damageDone 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("damage_done")
    public final Builder damageDone(long damageDone) {
      this.damageDone = damageDone;
      initBits &= ~INIT_BIT_DAMAGE_DONE;
      return this;
    }

    /**
     * Initializes the value for the {@link Attacker#getFinalBlow() finalBlow} attribute.
     * @param finalBlow The value for finalBlow 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("final_blow")
    public final Builder finalBlow(boolean finalBlow) {
      this.finalBlow = finalBlow;
      initBits &= ~INIT_BIT_FINAL_BLOW;
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getSecurityStatus() securityStatus} to securityStatus.
     * @param securityStatus The value for securityStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityStatus(double securityStatus) {
      this.securityStatus = securityStatus;
      return this;
    }

    /**
     * Initializes the optional value {@link Attacker#getSecurityStatus() securityStatus} to securityStatus.
     * @param securityStatus The value for securityStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("security_status")
    public final Builder securityStatus(Optional<Double> securityStatus) {
      this.securityStatus = securityStatus.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Attacker#getShipTypeId() shipTypeId} attribute.
     * @param shipTypeId The value for shipTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ship_type_id")
    public final Builder shipTypeId(long shipTypeId) {
      this.shipTypeId = shipTypeId;
      initBits &= ~INIT_BIT_SHIP_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Attacker#getWeaponTypeId() weaponTypeId} attribute.
     * @param weaponTypeId The value for weaponTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("weapon_type_id")
    public final Builder weaponTypeId(long weaponTypeId) {
      this.weaponTypeId = weaponTypeId;
      initBits &= ~INIT_BIT_WEAPON_TYPE_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttacker ImmutableAttacker}.
     * @return An immutable instance of Attacker
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttacker build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttacker(
          allianceId,
          characterId,
          corporationId,
          damageDone,
          finalBlow,
          securityStatus,
          shipTypeId,
          weaponTypeId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DAMAGE_DONE) != 0) attributes.add("damageDone");
      if ((initBits & INIT_BIT_FINAL_BLOW) != 0) attributes.add("finalBlow");
      if ((initBits & INIT_BIT_SHIP_TYPE_ID) != 0) attributes.add("shipTypeId");
      if ((initBits & INIT_BIT_WEAPON_TYPE_ID) != 0) attributes.add("weaponTypeId");
      return "Cannot build Attacker, some of required attributes are not set " + attributes;
    }
  }
}

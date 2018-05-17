package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Victim}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVictim.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Victim"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableVictim implements Victim {
  private final Long allianceId;
  private final long characterId;
  private final long corporationId;
  private final long damageTaken;
  private final List<Item> items;
  private final Position position;
  private final long shipTypeId;

  private ImmutableVictim(
      Long allianceId,
      long characterId,
      long corporationId,
      long damageTaken,
      List<Item> items,
      Position position,
      long shipTypeId) {
    this.allianceId = allianceId;
    this.characterId = characterId;
    this.corporationId = corporationId;
    this.damageTaken = damageTaken;
    this.items = items;
    this.position = position;
    this.shipTypeId = shipTypeId;
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
  public long getCharacterId() {
    return characterId;
  }

  /**
   * @return The value of the {@code corporationId} attribute
   */
  @JsonProperty("corporation_id")
  @Override
  public long getCorporationId() {
    return corporationId;
  }

  /**
   * @return The value of the {@code damageTaken} attribute
   */
  @JsonProperty("damage_taken")
  @Override
  public long getDamageTaken() {
    return damageTaken;
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @JsonProperty("items")
  @Override
  public List<Item> getItems() {
    return items;
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public Position getPosition() {
    return position;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Victim#getAllianceId() allianceId} attribute.
   * @param value The value for allianceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVictim withAllianceId(long value) {
    Long newValue = value;
    if (Objects.equals(this.allianceId, newValue)) return this;
    return new ImmutableVictim(
        newValue,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        this.items,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Victim#getAllianceId() allianceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allianceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVictim withAllianceId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.allianceId, value)) return this;
    return new ImmutableVictim(
        value,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        this.items,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Victim#getCharacterId() characterId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for characterId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVictim withCharacterId(long value) {
    if (this.characterId == value) return this;
    return new ImmutableVictim(
        this.allianceId,
        value,
        this.corporationId,
        this.damageTaken,
        this.items,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Victim#getCorporationId() corporationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for corporationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVictim withCorporationId(long value) {
    if (this.corporationId == value) return this;
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        value,
        this.damageTaken,
        this.items,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Victim#getDamageTaken() damageTaken} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for damageTaken
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVictim withDamageTaken(long value) {
    if (this.damageTaken == value) return this;
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        this.corporationId,
        value,
        this.items,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Victim#getItems() items}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVictim withItems(Item... elements) {
    List<Item> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        newValue,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Victim#getItems() items}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of items elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVictim withItems(Iterable<? extends Item> elements) {
    if (this.items == elements) return this;
    List<Item> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        newValue,
        this.position,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Victim#getPosition() position} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVictim withPosition(Position value) {
    if (this.position == value) return this;
    Position newValue = Objects.requireNonNull(value, "position");
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        this.items,
        newValue,
        this.shipTypeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Victim#getShipTypeId() shipTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for shipTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVictim withShipTypeId(long value) {
    if (this.shipTypeId == value) return this;
    return new ImmutableVictim(
        this.allianceId,
        this.characterId,
        this.corporationId,
        this.damageTaken,
        this.items,
        this.position,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVictim} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVictim
        && equalTo((ImmutableVictim) another);
  }

  private boolean equalTo(ImmutableVictim another) {
    return Objects.equals(allianceId, another.allianceId)
        && characterId == another.characterId
        && corporationId == another.corporationId
        && damageTaken == another.damageTaken
        && items.equals(another.items)
        && position.equals(another.position)
        && shipTypeId == another.shipTypeId;
  }

  /**
   * Computes a hash code from attributes: {@code allianceId}, {@code characterId}, {@code corporationId}, {@code damageTaken}, {@code items}, {@code position}, {@code shipTypeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(allianceId);
    h += (h << 5) + Long.hashCode(characterId);
    h += (h << 5) + Long.hashCode(corporationId);
    h += (h << 5) + Long.hashCode(damageTaken);
    h += (h << 5) + items.hashCode();
    h += (h << 5) + position.hashCode();
    h += (h << 5) + Long.hashCode(shipTypeId);
    return h;
  }

  /**
   * Prints the immutable value {@code Victim} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Victim{");
    if (allianceId != null) {
      builder.append("allianceId=").append(allianceId);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("characterId=").append(characterId);
    builder.append(", ");
    builder.append("corporationId=").append(corporationId);
    builder.append(", ");
    builder.append("damageTaken=").append(damageTaken);
    builder.append(", ");
    builder.append("items=").append(items);
    builder.append(", ");
    builder.append("position=").append(position);
    builder.append(", ");
    builder.append("shipTypeId=").append(shipTypeId);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Victim {
    Optional<Long> allianceId = Optional.empty();
    long characterId;
    boolean characterIdIsSet;
    long corporationId;
    boolean corporationIdIsSet;
    long damageTaken;
    boolean damageTakenIsSet;
    List<Item> items = Collections.emptyList();
    Position position;
    long shipTypeId;
    boolean shipTypeIdIsSet;
    @JsonProperty("alliance_id")
    public void setAllianceId(Optional<Long> allianceId) {
      this.allianceId = allianceId;
    }
    @JsonProperty("character_id")
    public void setCharacterId(long characterId) {
      this.characterId = characterId;
      this.characterIdIsSet = true;
    }
    @JsonProperty("corporation_id")
    public void setCorporationId(long corporationId) {
      this.corporationId = corporationId;
      this.corporationIdIsSet = true;
    }
    @JsonProperty("damage_taken")
    public void setDamageTaken(long damageTaken) {
      this.damageTaken = damageTaken;
      this.damageTakenIsSet = true;
    }
    @JsonProperty("items")
    public void setItems(List<Item> items) {
      this.items = items;
    }
    @JsonProperty("position")
    public void setPosition(Position position) {
      this.position = position;
    }
    @JsonProperty("ship_type_id")
    public void setShipTypeId(long shipTypeId) {
      this.shipTypeId = shipTypeId;
      this.shipTypeIdIsSet = true;
    }
    @Override
    public Optional<Long> getAllianceId() { throw new UnsupportedOperationException(); }
    @Override
    public long getCharacterId() { throw new UnsupportedOperationException(); }
    @Override
    public long getCorporationId() { throw new UnsupportedOperationException(); }
    @Override
    public long getDamageTaken() { throw new UnsupportedOperationException(); }
    @Override
    public List<Item> getItems() { throw new UnsupportedOperationException(); }
    @Override
    public Position getPosition() { throw new UnsupportedOperationException(); }
    @Override
    public long getShipTypeId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVictim fromJson(Json json) {
    ImmutableVictim.Builder builder = ImmutableVictim.builder();
    if (json.allianceId != null) {
      builder.allianceId(json.allianceId);
    }
    if (json.characterIdIsSet) {
      builder.characterId(json.characterId);
    }
    if (json.corporationIdIsSet) {
      builder.corporationId(json.corporationId);
    }
    if (json.damageTakenIsSet) {
      builder.damageTaken(json.damageTaken);
    }
    if (json.items != null) {
      builder.addAllItems(json.items);
    }
    if (json.position != null) {
      builder.position(json.position);
    }
    if (json.shipTypeIdIsSet) {
      builder.shipTypeId(json.shipTypeId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Victim} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Victim instance
   */
  public static ImmutableVictim copyOf(Victim instance) {
    if (instance instanceof ImmutableVictim) {
      return (ImmutableVictim) instance;
    }
    return ImmutableVictim.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableVictim ImmutableVictim}.
   * @return A new ImmutableVictim builder
   */
  public static ImmutableVictim.Builder builder() {
    return new ImmutableVictim.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableVictim ImmutableVictim}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CHARACTER_ID = 0x1L;
    private static final long INIT_BIT_CORPORATION_ID = 0x2L;
    private static final long INIT_BIT_DAMAGE_TAKEN = 0x4L;
    private static final long INIT_BIT_POSITION = 0x8L;
    private static final long INIT_BIT_SHIP_TYPE_ID = 0x10L;
    private long initBits = 0x1fL;

    private Long allianceId;
    private long characterId;
    private long corporationId;
    private long damageTaken;
    private List<Item> items = new ArrayList<Item>();
    private Position position;
    private long shipTypeId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Victim} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Victim instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Long> allianceIdOptional = instance.getAllianceId();
      if (allianceIdOptional.isPresent()) {
        allianceId(allianceIdOptional);
      }
      characterId(instance.getCharacterId());
      corporationId(instance.getCorporationId());
      damageTaken(instance.getDamageTaken());
      addAllItems(instance.getItems());
      position(instance.getPosition());
      shipTypeId(instance.getShipTypeId());
      return this;
    }

    /**
     * Initializes the optional value {@link Victim#getAllianceId() allianceId} to allianceId.
     * @param allianceId The value for allianceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder allianceId(long allianceId) {
      this.allianceId = allianceId;
      return this;
    }

    /**
     * Initializes the optional value {@link Victim#getAllianceId() allianceId} to allianceId.
     * @param allianceId The value for allianceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alliance_id")
    public final Builder allianceId(Optional<Long> allianceId) {
      this.allianceId = allianceId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Victim#getCharacterId() characterId} attribute.
     * @param characterId The value for characterId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("character_id")
    public final Builder characterId(long characterId) {
      this.characterId = characterId;
      initBits &= ~INIT_BIT_CHARACTER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Victim#getCorporationId() corporationId} attribute.
     * @param corporationId The value for corporationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("corporation_id")
    public final Builder corporationId(long corporationId) {
      this.corporationId = corporationId;
      initBits &= ~INIT_BIT_CORPORATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Victim#getDamageTaken() damageTaken} attribute.
     * @param damageTaken The value for damageTaken 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("damage_taken")
    public final Builder damageTaken(long damageTaken) {
      this.damageTaken = damageTaken;
      initBits &= ~INIT_BIT_DAMAGE_TAKEN;
      return this;
    }

    /**
     * Adds one element to {@link Victim#getItems() items} list.
     * @param element A items element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItems(Item element) {
      this.items.add(Objects.requireNonNull(element, "items element"));
      return this;
    }

    /**
     * Adds elements to {@link Victim#getItems() items} list.
     * @param elements An array of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItems(Item... elements) {
      for (Item element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Victim#getItems() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("items")
    public final Builder items(Iterable<? extends Item> elements) {
      this.items.clear();
      return addAllItems(elements);
    }

    /**
     * Adds elements to {@link Victim#getItems() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllItems(Iterable<? extends Item> elements) {
      for (Item element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Victim#getPosition() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(Position position) {
      this.position = Objects.requireNonNull(position, "position");
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the value for the {@link Victim#getShipTypeId() shipTypeId} attribute.
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
     * Builds a new {@link ImmutableVictim ImmutableVictim}.
     * @return An immutable instance of Victim
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableVictim build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableVictim(
          allianceId,
          characterId,
          corporationId,
          damageTaken,
          createUnmodifiableList(true, items),
          position,
          shipTypeId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CHARACTER_ID) != 0) attributes.add("characterId");
      if ((initBits & INIT_BIT_CORPORATION_ID) != 0) attributes.add("corporationId");
      if ((initBits & INIT_BIT_DAMAGE_TAKEN) != 0) attributes.add("damageTaken");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      if ((initBits & INIT_BIT_SHIP_TYPE_ID) != 0) attributes.add("shipTypeId");
      return "Cannot build Victim, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}

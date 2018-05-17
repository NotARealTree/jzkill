package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Zkb}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableZkb.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Zkb"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableZkb implements Zkb {
  private final long locationId;
  private final String hash;
  private final double fittedValue;
  private final double totalValue;
  private final long points;
  private final boolean npc;
  private final boolean solo;
  private final boolean awox;
  private final String href;

  private ImmutableZkb(
      long locationId,
      String hash,
      double fittedValue,
      double totalValue,
      long points,
      boolean npc,
      boolean solo,
      boolean awox,
      String href) {
    this.locationId = locationId;
    this.hash = hash;
    this.fittedValue = fittedValue;
    this.totalValue = totalValue;
    this.points = points;
    this.npc = npc;
    this.solo = solo;
    this.awox = awox;
    this.href = href;
  }

  /**
   * @return The value of the {@code locationId} attribute
   */
  @JsonProperty("locationID")
  @Override
  public long getLocationId() {
    return locationId;
  }

  /**
   * @return The value of the {@code hash} attribute
   */
  @JsonProperty("hash")
  @Override
  public String getHash() {
    return hash;
  }

  /**
   * @return The value of the {@code fittedValue} attribute
   */
  @JsonProperty("fittedValue")
  @Override
  public double getFittedValue() {
    return fittedValue;
  }

  /**
   * @return The value of the {@code totalValue} attribute
   */
  @JsonProperty("totalValue")
  @Override
  public double getTotalValue() {
    return totalValue;
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @JsonProperty("points")
  @Override
  public long points() {
    return points;
  }

  /**
   * @return The value of the {@code npc} attribute
   */
  @JsonProperty("npc")
  @Override
  public boolean getNpc() {
    return npc;
  }

  /**
   * @return The value of the {@code solo} attribute
   */
  @JsonProperty("solo")
  @Override
  public boolean getSolo() {
    return solo;
  }

  /**
   * @return The value of the {@code awox} attribute
   */
  @JsonProperty("awox")
  @Override
  public boolean getAwox() {
    return awox;
  }

  /**
   * @return The value of the {@code href} attribute
   */
  @JsonProperty("href")
  @Override
  public String getHref() {
    return href;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getLocationId() locationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for locationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withLocationId(long value) {
    if (this.locationId == value) return this;
    return new ImmutableZkb(
        value,
        this.hash,
        this.fittedValue,
        this.totalValue,
        this.points,
        this.npc,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getHash() hash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withHash(String value) {
    if (this.hash.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "hash");
    return new ImmutableZkb(
        this.locationId,
        newValue,
        this.fittedValue,
        this.totalValue,
        this.points,
        this.npc,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getFittedValue() fittedValue} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fittedValue
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withFittedValue(double value) {
    if (Double.doubleToLongBits(this.fittedValue) == Double.doubleToLongBits(value)) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        value,
        this.totalValue,
        this.points,
        this.npc,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getTotalValue() totalValue} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalValue
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withTotalValue(double value) {
    if (Double.doubleToLongBits(this.totalValue) == Double.doubleToLongBits(value)) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        value,
        this.points,
        this.npc,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#points() points} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for points
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withPoints(long value) {
    if (this.points == value) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        this.totalValue,
        value,
        this.npc,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getNpc() npc} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for npc
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withNpc(boolean value) {
    if (this.npc == value) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        this.totalValue,
        this.points,
        value,
        this.solo,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getSolo() solo} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for solo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withSolo(boolean value) {
    if (this.solo == value) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        this.totalValue,
        this.points,
        this.npc,
        value,
        this.awox,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getAwox() awox} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for awox
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withAwox(boolean value) {
    if (this.awox == value) return this;
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        this.totalValue,
        this.points,
        this.npc,
        this.solo,
        value,
        this.href);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Zkb#getHref() href} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for href
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableZkb withHref(String value) {
    if (this.href.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "href");
    return new ImmutableZkb(
        this.locationId,
        this.hash,
        this.fittedValue,
        this.totalValue,
        this.points,
        this.npc,
        this.solo,
        this.awox,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableZkb} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableZkb
        && equalTo((ImmutableZkb) another);
  }

  private boolean equalTo(ImmutableZkb another) {
    return locationId == another.locationId
        && hash.equals(another.hash)
        && Double.doubleToLongBits(fittedValue) == Double.doubleToLongBits(another.fittedValue)
        && Double.doubleToLongBits(totalValue) == Double.doubleToLongBits(another.totalValue)
        && points == another.points
        && npc == another.npc
        && solo == another.solo
        && awox == another.awox
        && href.equals(another.href);
  }

  /**
   * Computes a hash code from attributes: {@code locationId}, {@code hash}, {@code fittedValue}, {@code totalValue}, {@code points}, {@code npc}, {@code solo}, {@code awox}, {@code href}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(locationId);
    h += (h << 5) + hash.hashCode();
    h += (h << 5) + Double.hashCode(fittedValue);
    h += (h << 5) + Double.hashCode(totalValue);
    h += (h << 5) + Long.hashCode(points);
    h += (h << 5) + Boolean.hashCode(npc);
    h += (h << 5) + Boolean.hashCode(solo);
    h += (h << 5) + Boolean.hashCode(awox);
    h += (h << 5) + href.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Zkb} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Zkb{"
        + "locationId=" + locationId
        + ", hash=" + hash
        + ", fittedValue=" + fittedValue
        + ", totalValue=" + totalValue
        + ", points=" + points
        + ", npc=" + npc
        + ", solo=" + solo
        + ", awox=" + awox
        + ", href=" + href
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Zkb {
    long locationId;
    boolean locationIdIsSet;
    String hash;
    double fittedValue;
    boolean fittedValueIsSet;
    double totalValue;
    boolean totalValueIsSet;
    long points;
    boolean pointsIsSet;
    boolean npc;
    boolean npcIsSet;
    boolean solo;
    boolean soloIsSet;
    boolean awox;
    boolean awoxIsSet;
    String href;
    @JsonProperty("locationID")
    public void setLocationId(long locationId) {
      this.locationId = locationId;
      this.locationIdIsSet = true;
    }
    @JsonProperty("hash")
    public void setHash(String hash) {
      this.hash = hash;
    }
    @JsonProperty("fittedValue")
    public void setFittedValue(double fittedValue) {
      this.fittedValue = fittedValue;
      this.fittedValueIsSet = true;
    }
    @JsonProperty("totalValue")
    public void setTotalValue(double totalValue) {
      this.totalValue = totalValue;
      this.totalValueIsSet = true;
    }
    @JsonProperty("points")
    public void setPoints(long points) {
      this.points = points;
      this.pointsIsSet = true;
    }
    @JsonProperty("npc")
    public void setNpc(boolean npc) {
      this.npc = npc;
      this.npcIsSet = true;
    }
    @JsonProperty("solo")
    public void setSolo(boolean solo) {
      this.solo = solo;
      this.soloIsSet = true;
    }
    @JsonProperty("awox")
    public void setAwox(boolean awox) {
      this.awox = awox;
      this.awoxIsSet = true;
    }
    @JsonProperty("href")
    public void setHref(String href) {
      this.href = href;
    }
    @Override
    public long getLocationId() { throw new UnsupportedOperationException(); }
    @Override
    public String getHash() { throw new UnsupportedOperationException(); }
    @Override
    public double getFittedValue() { throw new UnsupportedOperationException(); }
    @Override
    public double getTotalValue() { throw new UnsupportedOperationException(); }
    @Override
    public long points() { throw new UnsupportedOperationException(); }
    @Override
    public boolean getNpc() { throw new UnsupportedOperationException(); }
    @Override
    public boolean getSolo() { throw new UnsupportedOperationException(); }
    @Override
    public boolean getAwox() { throw new UnsupportedOperationException(); }
    @Override
    public String getHref() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableZkb fromJson(Json json) {
    ImmutableZkb.Builder builder = ImmutableZkb.builder();
    if (json.locationIdIsSet) {
      builder.locationId(json.locationId);
    }
    if (json.hash != null) {
      builder.hash(json.hash);
    }
    if (json.fittedValueIsSet) {
      builder.fittedValue(json.fittedValue);
    }
    if (json.totalValueIsSet) {
      builder.totalValue(json.totalValue);
    }
    if (json.pointsIsSet) {
      builder.points(json.points);
    }
    if (json.npcIsSet) {
      builder.npc(json.npc);
    }
    if (json.soloIsSet) {
      builder.solo(json.solo);
    }
    if (json.awoxIsSet) {
      builder.awox(json.awox);
    }
    if (json.href != null) {
      builder.href(json.href);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Zkb} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Zkb instance
   */
  public static ImmutableZkb copyOf(Zkb instance) {
    if (instance instanceof ImmutableZkb) {
      return (ImmutableZkb) instance;
    }
    return ImmutableZkb.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableZkb ImmutableZkb}.
   * @return A new ImmutableZkb builder
   */
  public static ImmutableZkb.Builder builder() {
    return new ImmutableZkb.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableZkb ImmutableZkb}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_LOCATION_ID = 0x1L;
    private static final long INIT_BIT_HASH = 0x2L;
    private static final long INIT_BIT_FITTED_VALUE = 0x4L;
    private static final long INIT_BIT_TOTAL_VALUE = 0x8L;
    private static final long INIT_BIT_POINTS = 0x10L;
    private static final long INIT_BIT_NPC = 0x20L;
    private static final long INIT_BIT_SOLO = 0x40L;
    private static final long INIT_BIT_AWOX = 0x80L;
    private static final long INIT_BIT_HREF = 0x100L;
    private long initBits = 0x1ffL;

    private long locationId;
    private String hash;
    private double fittedValue;
    private double totalValue;
    private long points;
    private boolean npc;
    private boolean solo;
    private boolean awox;
    private String href;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Zkb} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Zkb instance) {
      Objects.requireNonNull(instance, "instance");
      locationId(instance.getLocationId());
      hash(instance.getHash());
      fittedValue(instance.getFittedValue());
      totalValue(instance.getTotalValue());
      points(instance.points());
      npc(instance.getNpc());
      solo(instance.getSolo());
      awox(instance.getAwox());
      href(instance.getHref());
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getLocationId() locationId} attribute.
     * @param locationId The value for locationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationID")
    public final Builder locationId(long locationId) {
      this.locationId = locationId;
      initBits &= ~INIT_BIT_LOCATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getHash() hash} attribute.
     * @param hash The value for hash 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hash")
    public final Builder hash(String hash) {
      this.hash = Objects.requireNonNull(hash, "hash");
      initBits &= ~INIT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getFittedValue() fittedValue} attribute.
     * @param fittedValue The value for fittedValue 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fittedValue")
    public final Builder fittedValue(double fittedValue) {
      this.fittedValue = fittedValue;
      initBits &= ~INIT_BIT_FITTED_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getTotalValue() totalValue} attribute.
     * @param totalValue The value for totalValue 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("totalValue")
    public final Builder totalValue(double totalValue) {
      this.totalValue = totalValue;
      initBits &= ~INIT_BIT_TOTAL_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#points() points} attribute.
     * @param points The value for points 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("points")
    public final Builder points(long points) {
      this.points = points;
      initBits &= ~INIT_BIT_POINTS;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getNpc() npc} attribute.
     * @param npc The value for npc 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("npc")
    public final Builder npc(boolean npc) {
      this.npc = npc;
      initBits &= ~INIT_BIT_NPC;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getSolo() solo} attribute.
     * @param solo The value for solo 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("solo")
    public final Builder solo(boolean solo) {
      this.solo = solo;
      initBits &= ~INIT_BIT_SOLO;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getAwox() awox} attribute.
     * @param awox The value for awox 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("awox")
    public final Builder awox(boolean awox) {
      this.awox = awox;
      initBits &= ~INIT_BIT_AWOX;
      return this;
    }

    /**
     * Initializes the value for the {@link Zkb#getHref() href} attribute.
     * @param href The value for href 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("href")
    public final Builder href(String href) {
      this.href = Objects.requireNonNull(href, "href");
      initBits &= ~INIT_BIT_HREF;
      return this;
    }

    /**
     * Builds a new {@link ImmutableZkb ImmutableZkb}.
     * @return An immutable instance of Zkb
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableZkb build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableZkb(locationId, hash, fittedValue, totalValue, points, npc, solo, awox, href);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_LOCATION_ID) != 0) attributes.add("locationId");
      if ((initBits & INIT_BIT_HASH) != 0) attributes.add("hash");
      if ((initBits & INIT_BIT_FITTED_VALUE) != 0) attributes.add("fittedValue");
      if ((initBits & INIT_BIT_TOTAL_VALUE) != 0) attributes.add("totalValue");
      if ((initBits & INIT_BIT_POINTS) != 0) attributes.add("points");
      if ((initBits & INIT_BIT_NPC) != 0) attributes.add("npc");
      if ((initBits & INIT_BIT_SOLO) != 0) attributes.add("solo");
      if ((initBits & INIT_BIT_AWOX) != 0) attributes.add("awox");
      if ((initBits & INIT_BIT_HREF) != 0) attributes.add("href");
      return "Cannot build Zkb, some of required attributes are not set " + attributes;
    }
  }
}

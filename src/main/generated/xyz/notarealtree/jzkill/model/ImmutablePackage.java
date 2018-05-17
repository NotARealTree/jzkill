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
 * Immutable implementation of {@link Package}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePackage.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Package"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutablePackage implements Package {
  private final long killId;
  private final KillMail killmail;
  private final Zkb zkb;

  private ImmutablePackage(long killId, KillMail killmail, Zkb zkb) {
    this.killId = killId;
    this.killmail = killmail;
    this.zkb = zkb;
  }

  /**
   * @return The value of the {@code killId} attribute
   */
  @JsonProperty("killID")
  @Override
  public long getKillId() {
    return killId;
  }

  /**
   * @return The value of the {@code killmail} attribute
   */
  @JsonProperty("killmail")
  @Override
  public KillMail getKillmail() {
    return killmail;
  }

  /**
   * @return The value of the {@code zkb} attribute
   */
  @JsonProperty("zkb")
  @Override
  public Zkb getZkb() {
    return zkb;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Package#getKillId() killId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for killId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePackage withKillId(long value) {
    if (this.killId == value) return this;
    return new ImmutablePackage(value, this.killmail, this.zkb);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Package#getKillmail() killmail} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for killmail
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePackage withKillmail(KillMail value) {
    if (this.killmail == value) return this;
    KillMail newValue = Objects.requireNonNull(value, "killmail");
    return new ImmutablePackage(this.killId, newValue, this.zkb);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Package#getZkb() zkb} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for zkb
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePackage withZkb(Zkb value) {
    if (this.zkb == value) return this;
    Zkb newValue = Objects.requireNonNull(value, "zkb");
    return new ImmutablePackage(this.killId, this.killmail, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePackage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePackage
        && equalTo((ImmutablePackage) another);
  }

  private boolean equalTo(ImmutablePackage another) {
    return killId == another.killId
        && killmail.equals(another.killmail)
        && zkb.equals(another.zkb);
  }

  /**
   * Computes a hash code from attributes: {@code killId}, {@code killmail}, {@code zkb}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(killId);
    h += (h << 5) + killmail.hashCode();
    h += (h << 5) + zkb.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Package} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Package{"
        + "killId=" + killId
        + ", killmail=" + killmail
        + ", zkb=" + zkb
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Package {
    long killId;
    boolean killIdIsSet;
    KillMail killmail;
    Zkb zkb;
    @JsonProperty("killID")
    public void setKillId(long killId) {
      this.killId = killId;
      this.killIdIsSet = true;
    }
    @JsonProperty("killmail")
    public void setKillmail(KillMail killmail) {
      this.killmail = killmail;
    }
    @JsonProperty("zkb")
    public void setZkb(Zkb zkb) {
      this.zkb = zkb;
    }
    @Override
    public long getKillId() { throw new UnsupportedOperationException(); }
    @Override
    public KillMail getKillmail() { throw new UnsupportedOperationException(); }
    @Override
    public Zkb getZkb() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePackage fromJson(Json json) {
    ImmutablePackage.Builder builder = ImmutablePackage.builder();
    if (json.killIdIsSet) {
      builder.killId(json.killId);
    }
    if (json.killmail != null) {
      builder.killmail(json.killmail);
    }
    if (json.zkb != null) {
      builder.zkb(json.zkb);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Package} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Package instance
   */
  public static ImmutablePackage copyOf(Package instance) {
    if (instance instanceof ImmutablePackage) {
      return (ImmutablePackage) instance;
    }
    return ImmutablePackage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePackage ImmutablePackage}.
   * @return A new ImmutablePackage builder
   */
  public static ImmutablePackage.Builder builder() {
    return new ImmutablePackage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePackage ImmutablePackage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KILL_ID = 0x1L;
    private static final long INIT_BIT_KILLMAIL = 0x2L;
    private static final long INIT_BIT_ZKB = 0x4L;
    private long initBits = 0x7L;

    private long killId;
    private KillMail killmail;
    private Zkb zkb;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Package} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Package instance) {
      Objects.requireNonNull(instance, "instance");
      killId(instance.getKillId());
      killmail(instance.getKillmail());
      zkb(instance.getZkb());
      return this;
    }

    /**
     * Initializes the value for the {@link Package#getKillId() killId} attribute.
     * @param killId The value for killId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("killID")
    public final Builder killId(long killId) {
      this.killId = killId;
      initBits &= ~INIT_BIT_KILL_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Package#getKillmail() killmail} attribute.
     * @param killmail The value for killmail 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("killmail")
    public final Builder killmail(KillMail killmail) {
      this.killmail = Objects.requireNonNull(killmail, "killmail");
      initBits &= ~INIT_BIT_KILLMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link Package#getZkb() zkb} attribute.
     * @param zkb The value for zkb 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("zkb")
    public final Builder zkb(Zkb zkb) {
      this.zkb = Objects.requireNonNull(zkb, "zkb");
      initBits &= ~INIT_BIT_ZKB;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePackage ImmutablePackage}.
     * @return An immutable instance of Package
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePackage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePackage(killId, killmail, zkb);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KILL_ID) != 0) attributes.add("killId");
      if ((initBits & INIT_BIT_KILLMAIL) != 0) attributes.add("killmail");
      if ((initBits & INIT_BIT_ZKB) != 0) attributes.add("zkb");
      return "Cannot build Package, some of required attributes are not set " + attributes;
    }
  }
}

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
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link KillMail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableKillMail.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "KillMail"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableKillMail implements KillMail {
  private final List<Attacker> attackers;
  private final long killmailId;
  private final String killmailTime;
  private final long solarSystemId;
  private final Victim victim;

  private ImmutableKillMail(
      List<Attacker> attackers,
      long killmailId,
      String killmailTime,
      long solarSystemId,
      Victim victim) {
    this.attackers = attackers;
    this.killmailId = killmailId;
    this.killmailTime = killmailTime;
    this.solarSystemId = solarSystemId;
    this.victim = victim;
  }

  /**
   * @return The value of the {@code attackers} attribute
   */
  @JsonProperty("attackers")
  @Override
  public List<Attacker> getAttackers() {
    return attackers;
  }

  /**
   * @return The value of the {@code killmailId} attribute
   */
  @JsonProperty("killmail_id")
  @Override
  public long getKillmailId() {
    return killmailId;
  }

  /**
   * @return The value of the {@code killmailTime} attribute
   */
  @JsonProperty("killmail_time")
  @Override
  public String getKillmailTime() {
    return killmailTime;
  }

  /**
   * @return The value of the {@code solarSystemId} attribute
   */
  @JsonProperty("solar_system_id")
  @Override
  public long getSolarSystemId() {
    return solarSystemId;
  }

  /**
   * @return The value of the {@code victim} attribute
   */
  @JsonProperty("victim")
  @Override
  public Victim getVictim() {
    return victim;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link KillMail#getAttackers() attackers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableKillMail withAttackers(Attacker... elements) {
    List<Attacker> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableKillMail(newValue, this.killmailId, this.killmailTime, this.solarSystemId, this.victim);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link KillMail#getAttackers() attackers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of attackers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableKillMail withAttackers(Iterable<? extends Attacker> elements) {
    if (this.attackers == elements) return this;
    List<Attacker> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableKillMail(newValue, this.killmailId, this.killmailTime, this.solarSystemId, this.victim);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link KillMail#getKillmailId() killmailId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for killmailId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableKillMail withKillmailId(long value) {
    if (this.killmailId == value) return this;
    return new ImmutableKillMail(this.attackers, value, this.killmailTime, this.solarSystemId, this.victim);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link KillMail#getKillmailTime() killmailTime} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for killmailTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableKillMail withKillmailTime(String value) {
    if (this.killmailTime.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "killmailTime");
    return new ImmutableKillMail(this.attackers, this.killmailId, newValue, this.solarSystemId, this.victim);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link KillMail#getSolarSystemId() solarSystemId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for solarSystemId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableKillMail withSolarSystemId(long value) {
    if (this.solarSystemId == value) return this;
    return new ImmutableKillMail(this.attackers, this.killmailId, this.killmailTime, value, this.victim);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link KillMail#getVictim() victim} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for victim
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableKillMail withVictim(Victim value) {
    if (this.victim == value) return this;
    Victim newValue = Objects.requireNonNull(value, "victim");
    return new ImmutableKillMail(this.attackers, this.killmailId, this.killmailTime, this.solarSystemId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableKillMail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableKillMail
        && equalTo((ImmutableKillMail) another);
  }

  private boolean equalTo(ImmutableKillMail another) {
    return attackers.equals(another.attackers)
        && killmailId == another.killmailId
        && killmailTime.equals(another.killmailTime)
        && solarSystemId == another.solarSystemId
        && victim.equals(another.victim);
  }

  /**
   * Computes a hash code from attributes: {@code attackers}, {@code killmailId}, {@code killmailTime}, {@code solarSystemId}, {@code victim}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + attackers.hashCode();
    h += (h << 5) + Long.hashCode(killmailId);
    h += (h << 5) + killmailTime.hashCode();
    h += (h << 5) + Long.hashCode(solarSystemId);
    h += (h << 5) + victim.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code KillMail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "KillMail{"
        + "attackers=" + attackers
        + ", killmailId=" + killmailId
        + ", killmailTime=" + killmailTime
        + ", solarSystemId=" + solarSystemId
        + ", victim=" + victim
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements KillMail {
    List<Attacker> attackers = Collections.emptyList();
    long killmailId;
    boolean killmailIdIsSet;
    String killmailTime;
    long solarSystemId;
    boolean solarSystemIdIsSet;
    Victim victim;
    @JsonProperty("attackers")
    public void setAttackers(List<Attacker> attackers) {
      this.attackers = attackers;
    }
    @JsonProperty("killmail_id")
    public void setKillmailId(long killmailId) {
      this.killmailId = killmailId;
      this.killmailIdIsSet = true;
    }
    @JsonProperty("killmail_time")
    public void setKillmailTime(String killmailTime) {
      this.killmailTime = killmailTime;
    }
    @JsonProperty("solar_system_id")
    public void setSolarSystemId(long solarSystemId) {
      this.solarSystemId = solarSystemId;
      this.solarSystemIdIsSet = true;
    }
    @JsonProperty("victim")
    public void setVictim(Victim victim) {
      this.victim = victim;
    }
    @Override
    public List<Attacker> getAttackers() { throw new UnsupportedOperationException(); }
    @Override
    public long getKillmailId() { throw new UnsupportedOperationException(); }
    @Override
    public String getKillmailTime() { throw new UnsupportedOperationException(); }
    @Override
    public long getSolarSystemId() { throw new UnsupportedOperationException(); }
    @Override
    public Victim getVictim() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableKillMail fromJson(Json json) {
    ImmutableKillMail.Builder builder = ImmutableKillMail.builder();
    if (json.attackers != null) {
      builder.addAllAttackers(json.attackers);
    }
    if (json.killmailIdIsSet) {
      builder.killmailId(json.killmailId);
    }
    if (json.killmailTime != null) {
      builder.killmailTime(json.killmailTime);
    }
    if (json.solarSystemIdIsSet) {
      builder.solarSystemId(json.solarSystemId);
    }
    if (json.victim != null) {
      builder.victim(json.victim);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link KillMail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable KillMail instance
   */
  public static ImmutableKillMail copyOf(KillMail instance) {
    if (instance instanceof ImmutableKillMail) {
      return (ImmutableKillMail) instance;
    }
    return ImmutableKillMail.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableKillMail ImmutableKillMail}.
   * @return A new ImmutableKillMail builder
   */
  public static ImmutableKillMail.Builder builder() {
    return new ImmutableKillMail.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableKillMail ImmutableKillMail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KILLMAIL_ID = 0x1L;
    private static final long INIT_BIT_KILLMAIL_TIME = 0x2L;
    private static final long INIT_BIT_SOLAR_SYSTEM_ID = 0x4L;
    private static final long INIT_BIT_VICTIM = 0x8L;
    private long initBits = 0xfL;

    private List<Attacker> attackers = new ArrayList<Attacker>();
    private long killmailId;
    private String killmailTime;
    private long solarSystemId;
    private Victim victim;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code KillMail} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(KillMail instance) {
      Objects.requireNonNull(instance, "instance");
      addAllAttackers(instance.getAttackers());
      killmailId(instance.getKillmailId());
      killmailTime(instance.getKillmailTime());
      solarSystemId(instance.getSolarSystemId());
      victim(instance.getVictim());
      return this;
    }

    /**
     * Adds one element to {@link KillMail#getAttackers() attackers} list.
     * @param element A attackers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAttackers(Attacker element) {
      this.attackers.add(Objects.requireNonNull(element, "attackers element"));
      return this;
    }

    /**
     * Adds elements to {@link KillMail#getAttackers() attackers} list.
     * @param elements An array of attackers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAttackers(Attacker... elements) {
      for (Attacker element : elements) {
        this.attackers.add(Objects.requireNonNull(element, "attackers element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link KillMail#getAttackers() attackers} list.
     * @param elements An iterable of attackers elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attackers")
    public final Builder attackers(Iterable<? extends Attacker> elements) {
      this.attackers.clear();
      return addAllAttackers(elements);
    }

    /**
     * Adds elements to {@link KillMail#getAttackers() attackers} list.
     * @param elements An iterable of attackers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAttackers(Iterable<? extends Attacker> elements) {
      for (Attacker element : elements) {
        this.attackers.add(Objects.requireNonNull(element, "attackers element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link KillMail#getKillmailId() killmailId} attribute.
     * @param killmailId The value for killmailId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("killmail_id")
    public final Builder killmailId(long killmailId) {
      this.killmailId = killmailId;
      initBits &= ~INIT_BIT_KILLMAIL_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link KillMail#getKillmailTime() killmailTime} attribute.
     * @param killmailTime The value for killmailTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("killmail_time")
    public final Builder killmailTime(String killmailTime) {
      this.killmailTime = Objects.requireNonNull(killmailTime, "killmailTime");
      initBits &= ~INIT_BIT_KILLMAIL_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link KillMail#getSolarSystemId() solarSystemId} attribute.
     * @param solarSystemId The value for solarSystemId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("solar_system_id")
    public final Builder solarSystemId(long solarSystemId) {
      this.solarSystemId = solarSystemId;
      initBits &= ~INIT_BIT_SOLAR_SYSTEM_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link KillMail#getVictim() victim} attribute.
     * @param victim The value for victim 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("victim")
    public final Builder victim(Victim victim) {
      this.victim = Objects.requireNonNull(victim, "victim");
      initBits &= ~INIT_BIT_VICTIM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableKillMail ImmutableKillMail}.
     * @return An immutable instance of KillMail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableKillMail build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableKillMail(createUnmodifiableList(true, attackers), killmailId, killmailTime, solarSystemId, victim);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KILLMAIL_ID) != 0) attributes.add("killmailId");
      if ((initBits & INIT_BIT_KILLMAIL_TIME) != 0) attributes.add("killmailTime");
      if ((initBits & INIT_BIT_SOLAR_SYSTEM_ID) != 0) attributes.add("solarSystemId");
      if ((initBits & INIT_BIT_VICTIM) != 0) attributes.add("victim");
      return "Cannot build KillMail, some of required attributes are not set " + attributes;
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

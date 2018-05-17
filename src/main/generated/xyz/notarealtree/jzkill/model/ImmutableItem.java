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
 * Immutable implementation of {@link Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Item"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableItem implements Item {
  private final long flag;
  private final long itemTypeId;
  private final long quantityDropped;
  private final long singleton;

  private ImmutableItem(long flag, long itemTypeId, long quantityDropped, long singleton) {
    this.flag = flag;
    this.itemTypeId = itemTypeId;
    this.quantityDropped = quantityDropped;
    this.singleton = singleton;
  }

  /**
   * @return The value of the {@code flag} attribute
   */
  @JsonProperty("flag")
  @Override
  public long getFlag() {
    return flag;
  }

  /**
   * @return The value of the {@code itemTypeId} attribute
   */
  @JsonProperty("item_type_id")
  @Override
  public long getItemTypeId() {
    return itemTypeId;
  }

  /**
   * @return The value of the {@code quantityDropped} attribute
   */
  @JsonProperty("quantity_dropped")
  @Override
  public long getQuantityDropped() {
    return quantityDropped;
  }

  /**
   * @return The value of the {@code singleton} attribute
   */
  @JsonProperty("singleton")
  @Override
  public long singleton() {
    return singleton;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#getFlag() flag} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for flag
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withFlag(long value) {
    if (this.flag == value) return this;
    return new ImmutableItem(value, this.itemTypeId, this.quantityDropped, this.singleton);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#getItemTypeId() itemTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for itemTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withItemTypeId(long value) {
    if (this.itemTypeId == value) return this;
    return new ImmutableItem(this.flag, value, this.quantityDropped, this.singleton);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#getQuantityDropped() quantityDropped} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantityDropped
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withQuantityDropped(long value) {
    if (this.quantityDropped == value) return this;
    return new ImmutableItem(this.flag, this.itemTypeId, value, this.singleton);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#singleton() singleton} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for singleton
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withSingleton(long value) {
    if (this.singleton == value) return this;
    return new ImmutableItem(this.flag, this.itemTypeId, this.quantityDropped, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableItem
        && equalTo((ImmutableItem) another);
  }

  private boolean equalTo(ImmutableItem another) {
    return flag == another.flag
        && itemTypeId == another.itemTypeId
        && quantityDropped == another.quantityDropped
        && singleton == another.singleton;
  }

  /**
   * Computes a hash code from attributes: {@code flag}, {@code itemTypeId}, {@code quantityDropped}, {@code singleton}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(flag);
    h += (h << 5) + Long.hashCode(itemTypeId);
    h += (h << 5) + Long.hashCode(quantityDropped);
    h += (h << 5) + Long.hashCode(singleton);
    return h;
  }

  /**
   * Prints the immutable value {@code Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Item{"
        + "flag=" + flag
        + ", itemTypeId=" + itemTypeId
        + ", quantityDropped=" + quantityDropped
        + ", singleton=" + singleton
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Item {
    long flag;
    boolean flagIsSet;
    long itemTypeId;
    boolean itemTypeIdIsSet;
    long quantityDropped;
    boolean quantityDroppedIsSet;
    long singleton;
    boolean singletonIsSet;
    @JsonProperty("flag")
    public void setFlag(long flag) {
      this.flag = flag;
      this.flagIsSet = true;
    }
    @JsonProperty("item_type_id")
    public void setItemTypeId(long itemTypeId) {
      this.itemTypeId = itemTypeId;
      this.itemTypeIdIsSet = true;
    }
    @JsonProperty("quantity_dropped")
    public void setQuantityDropped(long quantityDropped) {
      this.quantityDropped = quantityDropped;
      this.quantityDroppedIsSet = true;
    }
    @JsonProperty("singleton")
    public void setSingleton(long singleton) {
      this.singleton = singleton;
      this.singletonIsSet = true;
    }
    @Override
    public long getFlag() { throw new UnsupportedOperationException(); }
    @Override
    public long getItemTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public long getQuantityDropped() { throw new UnsupportedOperationException(); }
    @Override
    public long singleton() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableItem fromJson(Json json) {
    ImmutableItem.Builder builder = ImmutableItem.builder();
    if (json.flagIsSet) {
      builder.flag(json.flag);
    }
    if (json.itemTypeIdIsSet) {
      builder.itemTypeId(json.itemTypeId);
    }
    if (json.quantityDroppedIsSet) {
      builder.quantityDropped(json.quantityDropped);
    }
    if (json.singletonIsSet) {
      builder.singleton(json.singleton);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Item instance
   */
  public static ImmutableItem copyOf(Item instance) {
    if (instance instanceof ImmutableItem) {
      return (ImmutableItem) instance;
    }
    return ImmutableItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableItem ImmutableItem}.
   * @return A new ImmutableItem builder
   */
  public static ImmutableItem.Builder builder() {
    return new ImmutableItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableItem ImmutableItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_FLAG = 0x1L;
    private static final long INIT_BIT_ITEM_TYPE_ID = 0x2L;
    private static final long INIT_BIT_QUANTITY_DROPPED = 0x4L;
    private static final long INIT_BIT_SINGLETON = 0x8L;
    private long initBits = 0xfL;

    private long flag;
    private long itemTypeId;
    private long quantityDropped;
    private long singleton;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Item} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Item instance) {
      Objects.requireNonNull(instance, "instance");
      flag(instance.getFlag());
      itemTypeId(instance.getItemTypeId());
      quantityDropped(instance.getQuantityDropped());
      singleton(instance.singleton());
      return this;
    }

    /**
     * Initializes the value for the {@link Item#getFlag() flag} attribute.
     * @param flag The value for flag 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flag")
    public final Builder flag(long flag) {
      this.flag = flag;
      initBits &= ~INIT_BIT_FLAG;
      return this;
    }

    /**
     * Initializes the value for the {@link Item#getItemTypeId() itemTypeId} attribute.
     * @param itemTypeId The value for itemTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item_type_id")
    public final Builder itemTypeId(long itemTypeId) {
      this.itemTypeId = itemTypeId;
      initBits &= ~INIT_BIT_ITEM_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Item#getQuantityDropped() quantityDropped} attribute.
     * @param quantityDropped The value for quantityDropped 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity_dropped")
    public final Builder quantityDropped(long quantityDropped) {
      this.quantityDropped = quantityDropped;
      initBits &= ~INIT_BIT_QUANTITY_DROPPED;
      return this;
    }

    /**
     * Initializes the value for the {@link Item#singleton() singleton} attribute.
     * @param singleton The value for singleton 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("singleton")
    public final Builder singleton(long singleton) {
      this.singleton = singleton;
      initBits &= ~INIT_BIT_SINGLETON;
      return this;
    }

    /**
     * Builds a new {@link ImmutableItem ImmutableItem}.
     * @return An immutable instance of Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableItem(flag, itemTypeId, quantityDropped, singleton);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_FLAG) != 0) attributes.add("flag");
      if ((initBits & INIT_BIT_ITEM_TYPE_ID) != 0) attributes.add("itemTypeId");
      if ((initBits & INIT_BIT_QUANTITY_DROPPED) != 0) attributes.add("quantityDropped");
      if ((initBits & INIT_BIT_SINGLETON) != 0) attributes.add("singleton");
      return "Cannot build Item, some of required attributes are not set " + attributes;
    }
  }
}

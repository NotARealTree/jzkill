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
 * Immutable implementation of {@link Position}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePosition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Position"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutablePosition implements Position {
  private final double x;
  private final double y;
  private final double z;

  private ImmutablePosition(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * @return The value of the {@code x} attribute
   */
  @JsonProperty("x")
  @Override
  public double getX() {
    return x;
  }

  /**
   * @return The value of the {@code y} attribute
   */
  @JsonProperty("y")
  @Override
  public double getY() {
    return y;
  }

  /**
   * @return The value of the {@code z} attribute
   */
  @JsonProperty("z")
  @Override
  public double getZ() {
    return z;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Position#getX() x} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for x
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePosition withX(double value) {
    if (Double.doubleToLongBits(this.x) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePosition(value, this.y, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Position#getY() y} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for y
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePosition withY(double value) {
    if (Double.doubleToLongBits(this.y) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePosition(this.x, value, this.z);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Position#getZ() z} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for z
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePosition withZ(double value) {
    if (Double.doubleToLongBits(this.z) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePosition(this.x, this.y, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePosition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePosition
        && equalTo((ImmutablePosition) another);
  }

  private boolean equalTo(ImmutablePosition another) {
    return Double.doubleToLongBits(x) == Double.doubleToLongBits(another.x)
        && Double.doubleToLongBits(y) == Double.doubleToLongBits(another.y)
        && Double.doubleToLongBits(z) == Double.doubleToLongBits(another.z);
  }

  /**
   * Computes a hash code from attributes: {@code x}, {@code y}, {@code z}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Double.hashCode(x);
    h += (h << 5) + Double.hashCode(y);
    h += (h << 5) + Double.hashCode(z);
    return h;
  }

  /**
   * Prints the immutable value {@code Position} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Position{"
        + "x=" + x
        + ", y=" + y
        + ", z=" + z
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Position {
    double x;
    boolean xIsSet;
    double y;
    boolean yIsSet;
    double z;
    boolean zIsSet;
    @JsonProperty("x")
    public void setX(double x) {
      this.x = x;
      this.xIsSet = true;
    }
    @JsonProperty("y")
    public void setY(double y) {
      this.y = y;
      this.yIsSet = true;
    }
    @JsonProperty("z")
    public void setZ(double z) {
      this.z = z;
      this.zIsSet = true;
    }
    @Override
    public double getX() { throw new UnsupportedOperationException(); }
    @Override
    public double getY() { throw new UnsupportedOperationException(); }
    @Override
    public double getZ() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePosition fromJson(Json json) {
    ImmutablePosition.Builder builder = ImmutablePosition.builder();
    if (json.xIsSet) {
      builder.x(json.x);
    }
    if (json.yIsSet) {
      builder.y(json.y);
    }
    if (json.zIsSet) {
      builder.z(json.z);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Position} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Position instance
   */
  public static ImmutablePosition copyOf(Position instance) {
    if (instance instanceof ImmutablePosition) {
      return (ImmutablePosition) instance;
    }
    return ImmutablePosition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePosition ImmutablePosition}.
   * @return A new ImmutablePosition builder
   */
  public static ImmutablePosition.Builder builder() {
    return new ImmutablePosition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePosition ImmutablePosition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_X = 0x1L;
    private static final long INIT_BIT_Y = 0x2L;
    private static final long INIT_BIT_Z = 0x4L;
    private long initBits = 0x7L;

    private double x;
    private double y;
    private double z;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Position} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Position instance) {
      Objects.requireNonNull(instance, "instance");
      x(instance.getX());
      y(instance.getY());
      z(instance.getZ());
      return this;
    }

    /**
     * Initializes the value for the {@link Position#getX() x} attribute.
     * @param x The value for x 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("x")
    public final Builder x(double x) {
      this.x = x;
      initBits &= ~INIT_BIT_X;
      return this;
    }

    /**
     * Initializes the value for the {@link Position#getY() y} attribute.
     * @param y The value for y 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("y")
    public final Builder y(double y) {
      this.y = y;
      initBits &= ~INIT_BIT_Y;
      return this;
    }

    /**
     * Initializes the value for the {@link Position#getZ() z} attribute.
     * @param z The value for z 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("z")
    public final Builder z(double z) {
      this.z = z;
      initBits &= ~INIT_BIT_Z;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePosition ImmutablePosition}.
     * @return An immutable instance of Position
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePosition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePosition(x, y, z);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_X) != 0) attributes.add("x");
      if ((initBits & INIT_BIT_Y) != 0) attributes.add("y");
      if ((initBits & INIT_BIT_Z) != 0) attributes.add("z");
      return "Cannot build Position, some of required attributes are not set " + attributes;
    }
  }
}

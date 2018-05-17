package xyz.notarealtree.jzkill.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RedisQResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRedisQResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RedisQResponse"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableRedisQResponse implements RedisQResponse {
  private final Package maybePackage;

  private ImmutableRedisQResponse(Package maybePackage) {
    this.maybePackage = maybePackage;
  }

  /**
   * @return The value of the {@code maybePackage} attribute
   */
  @JsonProperty("package")
  @Override
  public Optional<Package> getMaybePackage() {
    return Optional.ofNullable(maybePackage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RedisQResponse#getMaybePackage() maybePackage} attribute.
   * @param value The value for maybePackage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRedisQResponse withMaybePackage(Package value) {
    Package newValue = Objects.requireNonNull(value, "maybePackage");
    if (this.maybePackage == newValue) return this;
    return new ImmutableRedisQResponse(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RedisQResponse#getMaybePackage() maybePackage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maybePackage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRedisQResponse withMaybePackage(Optional<? extends Package> optional) {
    Package value = optional.orElse(null);
    if (this.maybePackage == value) return this;
    return new ImmutableRedisQResponse(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRedisQResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRedisQResponse
        && equalTo((ImmutableRedisQResponse) another);
  }

  private boolean equalTo(ImmutableRedisQResponse another) {
    return Objects.equals(maybePackage, another.maybePackage);
  }

  /**
   * Computes a hash code from attributes: {@code maybePackage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(maybePackage);
    return h;
  }

  /**
   * Prints the immutable value {@code RedisQResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RedisQResponse{");
    if (maybePackage != null) {
      builder.append("maybePackage=").append(maybePackage);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RedisQResponse {
    Optional<Package> maybePackage = Optional.empty();
    @JsonProperty("package")
    public void setMaybePackage(Optional<Package> maybePackage) {
      this.maybePackage = maybePackage;
    }
    @Override
    public Optional<Package> getMaybePackage() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRedisQResponse fromJson(Json json) {
    ImmutableRedisQResponse.Builder builder = ImmutableRedisQResponse.builder();
    if (json.maybePackage != null) {
      builder.maybePackage(json.maybePackage);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RedisQResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RedisQResponse instance
   */
  public static ImmutableRedisQResponse copyOf(RedisQResponse instance) {
    if (instance instanceof ImmutableRedisQResponse) {
      return (ImmutableRedisQResponse) instance;
    }
    return ImmutableRedisQResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRedisQResponse ImmutableRedisQResponse}.
   * @return A new ImmutableRedisQResponse builder
   */
  public static ImmutableRedisQResponse.Builder builder() {
    return new ImmutableRedisQResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRedisQResponse ImmutableRedisQResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private Package maybePackage;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RedisQResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RedisQResponse instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Package> maybePackageOptional = instance.getMaybePackage();
      if (maybePackageOptional.isPresent()) {
        maybePackage(maybePackageOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link RedisQResponse#getMaybePackage() maybePackage} to maybePackage.
     * @param maybePackage The value for maybePackage
     * @return {@code this} builder for chained invocation
     */
    public final Builder maybePackage(Package maybePackage) {
      this.maybePackage = Objects.requireNonNull(maybePackage, "maybePackage");
      return this;
    }

    /**
     * Initializes the optional value {@link RedisQResponse#getMaybePackage() maybePackage} to maybePackage.
     * @param maybePackage The value for maybePackage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("package")
    public final Builder maybePackage(Optional<? extends Package> maybePackage) {
      this.maybePackage = maybePackage.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableRedisQResponse ImmutableRedisQResponse}.
     * @return An immutable instance of RedisQResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRedisQResponse build() {
      return new ImmutableRedisQResponse(maybePackage);
    }
  }
}

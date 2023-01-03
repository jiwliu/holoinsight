/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace.proto

package io.opentelemetry.proto.trace.v1;

/**
 * <pre>
 * The Status type defines a logical error model that is suitable for different
 * programming environments, including REST APIs and RPC APIs.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.trace.v1.Status}
 */
public  final class Status extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.trace.v1.Status)
    StatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Status.newBuilder() to construct.
  private Status(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Status() {
    message_ = "";
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Status();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Status(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_Status_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_Status_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.trace.v1.Status.class, io.opentelemetry.proto.trace.v1.Status.Builder.class);
  }

  /**
   * <pre>
   * For the semantics of status codes see
   * https://github.com/open-telemetry/opentelemetry-specification/blob/main/specification/trace/api.md#set-status
   * </pre>
   *
   * Protobuf enum {@code opentelemetry.proto.trace.v1.Status.StatusCode}
   */
  public enum StatusCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default status.
     * </pre>
     *
     * <code>STATUS_CODE_UNSET = 0;</code>
     */
    STATUS_CODE_UNSET(0),
    /**
     * <pre>
     * The Span has been validated by an Application developer or Operator to 
     * have completed successfully.
     * </pre>
     *
     * <code>STATUS_CODE_OK = 1;</code>
     */
    STATUS_CODE_OK(1),
    /**
     * <pre>
     * The Span contains an error.
     * </pre>
     *
     * <code>STATUS_CODE_ERROR = 2;</code>
     */
    STATUS_CODE_ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The default status.
     * </pre>
     *
     * <code>STATUS_CODE_UNSET = 0;</code>
     */
    public static final int STATUS_CODE_UNSET_VALUE = 0;
    /**
     * <pre>
     * The Span has been validated by an Application developer or Operator to 
     * have completed successfully.
     * </pre>
     *
     * <code>STATUS_CODE_OK = 1;</code>
     */
    public static final int STATUS_CODE_OK_VALUE = 1;
    /**
     * <pre>
     * The Span contains an error.
     * </pre>
     *
     * <code>STATUS_CODE_ERROR = 2;</code>
     */
    public static final int STATUS_CODE_ERROR_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCode valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCode forNumber(int value) {
      switch (value) {
        case 0: return STATUS_CODE_UNSET;
        case 1: return STATUS_CODE_OK;
        case 2: return STATUS_CODE_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StatusCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
            public StatusCode findValueByNumber(int number) {
              return StatusCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.opentelemetry.proto.trace.v1.Status.getDescriptor().getEnumTypes().get(0);
    }

    private static final StatusCode[] VALUES = values();

    public static StatusCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private StatusCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opentelemetry.proto.trace.v1.Status.StatusCode)
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * A developer-facing human readable error message.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A developer-facing human readable error message.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 3;
  private int code_;
  /**
   * <pre>
   * The status code.
   * </pre>
   *
   * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <pre>
   * The status code.
   * </pre>
   *
   * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
   */
  public io.opentelemetry.proto.trace.v1.Status.StatusCode getCode() {
    @SuppressWarnings("deprecation")
    io.opentelemetry.proto.trace.v1.Status.StatusCode result = io.opentelemetry.proto.trace.v1.Status.StatusCode.valueOf(code_);
    return result == null ? io.opentelemetry.proto.trace.v1.Status.StatusCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (code_ != io.opentelemetry.proto.trace.v1.Status.StatusCode.STATUS_CODE_UNSET.getNumber()) {
      output.writeEnum(3, code_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (code_ != io.opentelemetry.proto.trace.v1.Status.StatusCode.STATUS_CODE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, code_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentelemetry.proto.trace.v1.Status)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.trace.v1.Status other = (io.opentelemetry.proto.trace.v1.Status) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (code_ != other.code_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.trace.v1.Status parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opentelemetry.proto.trace.v1.Status prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The Status type defines a logical error model that is suitable for different
   * programming environments, including REST APIs and RPC APIs.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.trace.v1.Status}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.trace.v1.Status)
      io.opentelemetry.proto.trace.v1.StatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_Status_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_Status_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.trace.v1.Status.class, io.opentelemetry.proto.trace.v1.Status.Builder.class);
    }

    // Construct using io.opentelemetry.proto.trace.v1.Status.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      code_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_Status_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.Status getDefaultInstanceForType() {
      return io.opentelemetry.proto.trace.v1.Status.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.Status build() {
      io.opentelemetry.proto.trace.v1.Status result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.Status buildPartial() {
      io.opentelemetry.proto.trace.v1.Status result = new io.opentelemetry.proto.trace.v1.Status(this);
      result.message_ = message_;
      result.code_ = code_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentelemetry.proto.trace.v1.Status) {
        return mergeFrom((io.opentelemetry.proto.trace.v1.Status)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.trace.v1.Status other) {
      if (other == io.opentelemetry.proto.trace.v1.Status.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.opentelemetry.proto.trace.v1.Status parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.trace.v1.Status) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * A developer-facing human readable error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A developer-facing human readable error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A developer-facing human readable error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A developer-facing human readable error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A developer-facing human readable error message.
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private int code_ = 0;
    /**
     * <pre>
     * The status code.
     * </pre>
     *
     * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <pre>
     * The status code.
     * </pre>
     *
     * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status code.
     * </pre>
     *
     * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
     */
    public io.opentelemetry.proto.trace.v1.Status.StatusCode getCode() {
      @SuppressWarnings("deprecation")
      io.opentelemetry.proto.trace.v1.Status.StatusCode result = io.opentelemetry.proto.trace.v1.Status.StatusCode.valueOf(code_);
      return result == null ? io.opentelemetry.proto.trace.v1.Status.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The status code.
     * </pre>
     *
     * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
     */
    public Builder setCode(io.opentelemetry.proto.trace.v1.Status.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status code.
     * </pre>
     *
     * <code>.opentelemetry.proto.trace.v1.Status.StatusCode code = 3;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.trace.v1.Status)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.trace.v1.Status)
  private static final io.opentelemetry.proto.trace.v1.Status DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.trace.v1.Status();
  }

  public static io.opentelemetry.proto.trace.v1.Status getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Status>
      PARSER = new com.google.protobuf.AbstractParser<Status>() {
    @java.lang.Override
    public Status parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Status(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Status> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Status> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.trace.v1.Status getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


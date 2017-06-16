package iochti.processRule.grpc;

/**
 * Protobuf type {@code proto.ProcessRule}
 */
public  final class ProcessRule extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:proto.ProcessRule)
    ProcessRuleOrBuilder {
  // Use ProcessRule.newBuilder() to construct.
  private ProcessRule(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ProcessRule() {
    id_ = "";
    name_ = "";
    ruleTypeId_ = "";
    thingGroupId_ = "";
    parameters_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProcessRule(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            ruleTypeId_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            thingGroupId_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            parameters_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ProcessRuleProto.internal_static_proto_ProcessRule_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ProcessRuleProto.internal_static_proto_ProcessRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProcessRule.class, ProcessRule.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>optional string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULETYPEID_FIELD_NUMBER = 3;
  private volatile java.lang.Object ruleTypeId_;
  /**
   * <code>optional string ruleTypeId = 3;</code>
   */
  public java.lang.String getRuleTypeId() {
    java.lang.Object ref = ruleTypeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleTypeId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ruleTypeId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRuleTypeIdBytes() {
    java.lang.Object ref = ruleTypeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleTypeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THINGGROUPID_FIELD_NUMBER = 4;
  private volatile java.lang.Object thingGroupId_;
  /**
   * <code>optional string thingGroupId = 4;</code>
   */
  public java.lang.String getThingGroupId() {
    java.lang.Object ref = thingGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thingGroupId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string thingGroupId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getThingGroupIdBytes() {
    java.lang.Object ref = thingGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      thingGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 5;
  private volatile java.lang.Object parameters_;
  /**
   * <code>optional string parameters = 5;</code>
   */
  public java.lang.String getParameters() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parameters_ = s;
      return s;
    }
  }
  /**
   * <code>optional string parameters = 5;</code>
   */
  public com.google.protobuf.ByteString
      getParametersBytes() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parameters_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
    }
    if (!getRuleTypeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, ruleTypeId_);
    }
    if (!getThingGroupIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, thingGroupId_);
    }
    if (!getParametersBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, parameters_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
    }
    if (!getRuleTypeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, ruleTypeId_);
    }
    if (!getThingGroupIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, thingGroupId_);
    }
    if (!getParametersBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, parameters_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static ProcessRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProcessRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProcessRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProcessRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProcessRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ProcessRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static ProcessRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static ProcessRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static ProcessRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ProcessRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ProcessRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ProcessRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ProcessRule)
      ProcessRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProcessRuleProto.internal_static_proto_ProcessRule_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProcessRuleProto.internal_static_proto_ProcessRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProcessRule.class, ProcessRule.Builder.class);
    }

    // Construct using ProcessRule.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      name_ = "";

      ruleTypeId_ = "";

      thingGroupId_ = "";

      parameters_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ProcessRuleProto.internal_static_proto_ProcessRule_descriptor;
    }

    public ProcessRule getDefaultInstanceForType() {
      return ProcessRule.getDefaultInstance();
    }

    public ProcessRule build() {
      ProcessRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ProcessRule buildPartial() {
      ProcessRule result = new ProcessRule(this);
      result.id_ = id_;
      result.name_ = name_;
      result.ruleTypeId_ = ruleTypeId_;
      result.thingGroupId_ = thingGroupId_;
      result.parameters_ = parameters_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ProcessRule) {
        return mergeFrom((ProcessRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProcessRule other) {
      if (other == ProcessRule.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getRuleTypeId().isEmpty()) {
        ruleTypeId_ = other.ruleTypeId_;
        onChanged();
      }
      if (!other.getThingGroupId().isEmpty()) {
        thingGroupId_ = other.thingGroupId_;
        onChanged();
      }
      if (!other.getParameters().isEmpty()) {
        parameters_ = other.parameters_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ProcessRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProcessRule) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ruleTypeId_ = "";
    /**
     * <code>optional string ruleTypeId = 3;</code>
     */
    public java.lang.String getRuleTypeId() {
      java.lang.Object ref = ruleTypeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleTypeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ruleTypeId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRuleTypeIdBytes() {
      java.lang.Object ref = ruleTypeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ruleTypeId = 3;</code>
     */
    public Builder setRuleTypeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ruleTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ruleTypeId = 3;</code>
     */
    public Builder clearRuleTypeId() {
      
      ruleTypeId_ = getDefaultInstance().getRuleTypeId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ruleTypeId = 3;</code>
     */
    public Builder setRuleTypeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ruleTypeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object thingGroupId_ = "";
    /**
     * <code>optional string thingGroupId = 4;</code>
     */
    public java.lang.String getThingGroupId() {
      java.lang.Object ref = thingGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thingGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string thingGroupId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getThingGroupIdBytes() {
      java.lang.Object ref = thingGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        thingGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string thingGroupId = 4;</code>
     */
    public Builder setThingGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      thingGroupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string thingGroupId = 4;</code>
     */
    public Builder clearThingGroupId() {
      
      thingGroupId_ = getDefaultInstance().getThingGroupId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string thingGroupId = 4;</code>
     */
    public Builder setThingGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      thingGroupId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parameters_ = "";
    /**
     * <code>optional string parameters = 5;</code>
     */
    public java.lang.String getParameters() {
      java.lang.Object ref = parameters_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parameters_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string parameters = 5;</code>
     */
    public com.google.protobuf.ByteString
        getParametersBytes() {
      java.lang.Object ref = parameters_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parameters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string parameters = 5;</code>
     */
    public Builder setParameters(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parameters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string parameters = 5;</code>
     */
    public Builder clearParameters() {
      
      parameters_ = getDefaultInstance().getParameters();
      onChanged();
      return this;
    }
    /**
     * <code>optional string parameters = 5;</code>
     */
    public Builder setParametersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parameters_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.ProcessRule)
  }

  // @@protoc_insertion_point(class_scope:proto.ProcessRule)
  private static final ProcessRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProcessRule();
  }

  public static ProcessRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessRule>
      PARSER = new com.google.protobuf.AbstractParser<ProcessRule>() {
    public ProcessRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ProcessRule(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ProcessRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessRule> getParserForType() {
    return PARSER;
  }

  public ProcessRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


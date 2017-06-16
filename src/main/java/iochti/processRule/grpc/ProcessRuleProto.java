package iochti.processRule.grpc;

public final class ProcessRuleProto {
  private ProcessRuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProcessRule_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_ProcessRule_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_IdRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_IdRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022process_rule.proto\022\005proto\032\033google/prot" +
      "obuf/empty.proto\"e\n\013ProcessRule\022\n\n\002id\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\022\022\n\nruleTypeId\030\003 \001(\t\022\024\n" +
      "\014thingGroupId\030\004 \001(\t\022\022\n\nparameters\030\005 \001(\t\"" +
      "\027\n\tIdRequest\022\n\n\002id\030\001 \001(\t2\315\002\n\022ProcessRule" +
      "Service\022>\n\022FindByThingGroupId\022\020.proto.Id" +
      "Request\032\022.proto.ProcessRule\"\0000\001\0228\n\016GetPr" +
      "ocessRule\022\020.proto.IdRequest\032\022.proto.Proc" +
      "essRule\"\000\022=\n\021CreateProcessRule\022\022.proto.P" +
      "rocessRule\032\022.proto.ProcessRule\"\000\022=\n\021Upda",
      "teProcessRule\022\022.proto.ProcessRule\032\022.prot" +
      "o.ProcessRule\"\000\022?\n\021DeleteProcessRule\022\020.p" +
      "roto.IdRequest\032\026.google.protobuf.Empty\"\000" +
      "B(\n\022iochti.processRuleB\020ProcessRuleProto" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_proto_ProcessRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ProcessRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_ProcessRule_descriptor,
        new java.lang.String[] { "Id", "Name", "RuleTypeId", "ThingGroupId", "Parameters", });
    internal_static_proto_IdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_IdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_IdRequest_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

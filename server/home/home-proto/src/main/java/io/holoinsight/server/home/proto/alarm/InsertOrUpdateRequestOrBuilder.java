/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AlarmService.proto

package io.holoinsight.server.home.proto.alarm;

public interface InsertOrUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:InsertOrUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tenant = 1;</code>
   */
  String getTenant();
  /**
   * <code>string tenant = 1;</code>
   */
  com.google.protobuf.ByteString
      getTenantBytes();

  /**
   * <code>string rowsJson = 2;</code>
   */
  String getRowsJson();
  /**
   * <code>string rowsJson = 2;</code>
   */
  com.google.protobuf.ByteString
      getRowsJsonBytes();

  /**
   * <code>string traceId = 3;</code>
   */
  String getTraceId();
  /**
   * <code>string traceId = 3;</code>
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();
}

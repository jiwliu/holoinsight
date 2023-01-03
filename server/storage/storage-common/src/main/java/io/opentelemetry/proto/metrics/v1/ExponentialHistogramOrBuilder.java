/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public interface ExponentialHistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.ExponentialHistogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.ExponentialHistogramDataPointOrBuilder getDataPointsOrBuilder(
      int index);

  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   */
  int getAggregationTemporalityValue();
  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   */
  io.opentelemetry.proto.metrics.v1.AggregationTemporality getAggregationTemporality();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListJobTriggersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListJobTriggersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name, for example `projects/my-project-id`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name, for example `projects/my-project-id`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to ListJobTriggers. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to ListJobTriggers. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional size of the page, can be limited by a server.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional comma separated list of triggeredJob fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc,update_time, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the JobTrigger was created.
   * - `update_time`: corresponds to time the JobTrigger was last updated.
   * - `last_run_time`: corresponds to the last time the JobTrigger ran.
   * - `name`: corresponds to JobTrigger's name.
   * - `display_name`: corresponds to JobTrigger's display name.
   * - `status`: corresponds to JobTrigger's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional comma separated list of triggeredJob fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc,update_time, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the JobTrigger was created.
   * - `update_time`: corresponds to time the JobTrigger was last updated.
   * - `last_run_time`: corresponds to the last time the JobTrigger ran.
   * - `name`: corresponds to JobTrigger's name.
   * - `display_name`: corresponds to JobTrigger's display name.
   * - `status`: corresponds to JobTrigger's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `status` - HEALTHY|PAUSED|CANCELLED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
   *     quotation marks. Nanoseconds are ignored.
   *     - 'error_count' - Number of errors that have occurred while running.
   * * The operator must be `=` or `!=` for status and inspected_storage.
   * Examples:
   * * inspected_storage = cloud_storage AND status = HEALTHY
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
   * * last_run_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `status` - HEALTHY|PAUSED|CANCELLED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
   *     quotation marks. Nanoseconds are ignored.
   *     - 'error_count' - Number of errors that have occurred while running.
   * * The operator must be `=` or `!=` for status and inspected_storage.
   * Examples:
   * * inspected_storage = cloud_storage AND status = HEALTHY
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
   * * last_run_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();
}

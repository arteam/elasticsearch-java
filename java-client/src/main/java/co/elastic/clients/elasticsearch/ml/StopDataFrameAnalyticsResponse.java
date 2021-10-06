/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.stop_data_frame_analytics.Response
@JsonpDeserializable
public final class StopDataFrameAnalyticsResponse implements JsonpSerializable {
	private final boolean stopped;

	// ---------------------------------------------------------------------------------------------

	public StopDataFrameAnalyticsResponse(Builder builder) {

		this.stopped = Objects.requireNonNull(builder.stopped, "stopped");

	}

	public StopDataFrameAnalyticsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code stopped}
	 */
	public boolean stopped() {
		return this.stopped;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("stopped");
		generator.write(this.stopped);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopDataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StopDataFrameAnalyticsResponse> {
		private Boolean stopped;

		/**
		 * Required - API name: {@code stopped}
		 */
		public Builder stopped(boolean value) {
			this.stopped = value;
			return this;
		}

		/**
		 * Builds a {@link StopDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopDataFrameAnalyticsResponse build() {

			return new StopDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<StopDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StopDataFrameAnalyticsResponse::setupStopDataFrameAnalyticsResponseDeserializer,
					Builder::build);

	protected static void setupStopDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<StopDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::stopped, JsonpDeserializer.booleanDeserializer(), "stopped");

	}

}

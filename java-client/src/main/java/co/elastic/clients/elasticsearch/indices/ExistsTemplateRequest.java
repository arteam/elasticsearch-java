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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.BooleanEndpoint;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.exists_template.Request

public final class ExistsTemplateRequest extends RequestBase {
	private final List<String> name;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	// ---------------------------------------------------------------------------------------------

	public ExistsTemplateRequest(Builder builder) {

		this.name = ModelTypeHelper.unmodifiableNonNull(builder.name, "name");
		this.flatSettings = builder.flatSettings;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;

	}

	public ExistsTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The comma separated names of the index templates
	 * <p>
	 * API name: {@code name}
	 */
	public List<String> name() {
		return this.name;
	}

	/**
	 * Return settings in flat format (default: false)
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * Return local information, do not retrieve the state from master node
	 * (default: false)
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public Boolean local() {
		return this.local;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExistsTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExistsTemplateRequest> {
		private List<String> name;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		/**
		 * Required - The comma separated names of the index templates
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The comma separated names of the index templates
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
			return this;
		}

		/**
		 * Return settings in flat format (default: false)
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * Return local information, do not retrieve the state from master node
		 * (default: false)
		 * <p>
		 * API name: {@code local}
		 */
		public Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link ExistsTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsTemplateRequest build() {

			return new ExistsTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.exists_template}".
	 */
	public static final Endpoint<ExistsTemplateRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new BooleanEndpoint<>(
			// Request method
			request -> {
				return "HEAD";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);
}

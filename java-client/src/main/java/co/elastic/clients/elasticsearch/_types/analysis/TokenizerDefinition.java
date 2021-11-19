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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.TokenizerDefinition
// union type: InternalTag[tag=type]
@JsonpDeserializable
public class TokenizerDefinition implements TaggedUnion<TokenizerDefinitionVariant>, JsonpSerializable {

	public static final String CHAR_GROUP = "char_group";
	public static final String EDGE_NGRAM = "edge_ngram";
	public static final String ICU_TOKENIZER = "icu_tokenizer";
	public static final String KEYWORD = "keyword";
	public static final String KUROMOJI_TOKENIZER = "kuromoji_tokenizer";
	public static final String LETTER = "letter";
	public static final String LOWERCASE = "lowercase";
	public static final String NGRAM = "ngram";
	public static final String NORI_TOKENIZER = "nori_tokenizer";
	public static final String PATH_HIERARCHY = "path_hierarchy";
	public static final String PATTERN = "pattern";
	public static final String STANDARD = "standard";
	public static final String UAX_URL_EMAIL = "uax_url_email";
	public static final String WHITESPACE = "whitespace";

	private final String _type;
	private final TokenizerDefinitionVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final TokenizerDefinitionVariant _get() {
		return _value;
	}

	public TokenizerDefinition(TokenizerDefinitionVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TokenizerDefinition(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TokenizerDefinition of(Function<Builder, ObjectBuilder<TokenizerDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code char_group}?
	 */
	public boolean _isCharGroup() {
		return CHAR_GROUP.equals(_type());
	}

	/**
	 * Get the {@code char_group} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code char_group} kind.
	 */
	public CharGroupTokenizer charGroup() {
		return TaggedUnionUtils.get(this, CHAR_GROUP);
	}

	/**
	 * Is this variant instance of kind {@code edge_ngram}?
	 */
	public boolean _isEdgeNgram() {
		return EDGE_NGRAM.equals(_type());
	}

	/**
	 * Get the {@code edge_ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code edge_ngram} kind.
	 */
	public EdgeNGramTokenizer edgeNgram() {
		return TaggedUnionUtils.get(this, EDGE_NGRAM);
	}

	/**
	 * Is this variant instance of kind {@code icu_tokenizer}?
	 */
	public boolean _isIcuTokenizer() {
		return ICU_TOKENIZER.equals(_type());
	}

	/**
	 * Get the {@code icu_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_tokenizer} kind.
	 */
	public IcuTokenizer icuTokenizer() {
		return TaggedUnionUtils.get(this, ICU_TOKENIZER);
	}

	/**
	 * Is this variant instance of kind {@code keyword}?
	 */
	public boolean _isKeyword() {
		return KEYWORD.equals(_type());
	}

	/**
	 * Get the {@code keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword} kind.
	 */
	public KeywordTokenizer keyword() {
		return TaggedUnionUtils.get(this, KEYWORD);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_tokenizer}?
	 */
	public boolean _isKuromojiTokenizer() {
		return KUROMOJI_TOKENIZER.equals(_type());
	}

	/**
	 * Get the {@code kuromoji_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_tokenizer}
	 *             kind.
	 */
	public KuromojiTokenizer kuromojiTokenizer() {
		return TaggedUnionUtils.get(this, KUROMOJI_TOKENIZER);
	}

	/**
	 * Is this variant instance of kind {@code letter}?
	 */
	public boolean _isLetter() {
		return LETTER.equals(_type());
	}

	/**
	 * Get the {@code letter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code letter} kind.
	 */
	public LetterTokenizer letter() {
		return TaggedUnionUtils.get(this, LETTER);
	}

	/**
	 * Is this variant instance of kind {@code lowercase}?
	 */
	public boolean _isLowercase() {
		return LOWERCASE.equals(_type());
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseTokenizer lowercase() {
		return TaggedUnionUtils.get(this, LOWERCASE);
	}

	/**
	 * Is this variant instance of kind {@code ngram}?
	 */
	public boolean _isNgram() {
		return NGRAM.equals(_type());
	}

	/**
	 * Get the {@code ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ngram} kind.
	 */
	public NGramTokenizer ngram() {
		return TaggedUnionUtils.get(this, NGRAM);
	}

	/**
	 * Is this variant instance of kind {@code nori_tokenizer}?
	 */
	public boolean _isNoriTokenizer() {
		return NORI_TOKENIZER.equals(_type());
	}

	/**
	 * Get the {@code nori_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori_tokenizer} kind.
	 */
	public NoriTokenizer noriTokenizer() {
		return TaggedUnionUtils.get(this, NORI_TOKENIZER);
	}

	/**
	 * Is this variant instance of kind {@code path_hierarchy}?
	 */
	public boolean _isPathHierarchy() {
		return PATH_HIERARCHY.equals(_type());
	}

	/**
	 * Get the {@code path_hierarchy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code path_hierarchy} kind.
	 */
	public PathHierarchyTokenizer pathHierarchy() {
		return TaggedUnionUtils.get(this, PATH_HIERARCHY);
	}

	/**
	 * Is this variant instance of kind {@code pattern}?
	 */
	public boolean _isPattern() {
		return PATTERN.equals(_type());
	}

	/**
	 * Get the {@code pattern} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern} kind.
	 */
	public PatternTokenizer pattern() {
		return TaggedUnionUtils.get(this, PATTERN);
	}

	/**
	 * Is this variant instance of kind {@code standard}?
	 */
	public boolean _isStandard() {
		return STANDARD.equals(_type());
	}

	/**
	 * Get the {@code standard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code standard} kind.
	 */
	public StandardTokenizer standard() {
		return TaggedUnionUtils.get(this, STANDARD);
	}

	/**
	 * Is this variant instance of kind {@code uax_url_email}?
	 */
	public boolean _isUaxUrlEmail() {
		return UAX_URL_EMAIL.equals(_type());
	}

	/**
	 * Get the {@code uax_url_email} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uax_url_email} kind.
	 */
	public UaxEmailUrlTokenizer uaxUrlEmail() {
		return TaggedUnionUtils.get(this, UAX_URL_EMAIL);
	}

	/**
	 * Is this variant instance of kind {@code whitespace}?
	 */
	public boolean _isWhitespace() {
		return WHITESPACE.equals(_type());
	}

	/**
	 * Get the {@code whitespace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code whitespace} kind.
	 */
	public WhitespaceTokenizer whitespace() {
		return TaggedUnionUtils.get(this, WHITESPACE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenizerDefinition> {
		private String _type;
		private TokenizerDefinitionVariant _value;

		public Builder charGroup(CharGroupTokenizer v) {
			this._type = CHAR_GROUP;
			this._value = v;
			return this;
		}

		public Builder charGroup(Function<CharGroupTokenizer.Builder, ObjectBuilder<CharGroupTokenizer>> f) {
			return this.charGroup(f.apply(new CharGroupTokenizer.Builder()).build());
		}

		public Builder edgeNgram(EdgeNGramTokenizer v) {
			this._type = EDGE_NGRAM;
			this._value = v;
			return this;
		}

		public Builder edgeNgram(Function<EdgeNGramTokenizer.Builder, ObjectBuilder<EdgeNGramTokenizer>> f) {
			return this.edgeNgram(f.apply(new EdgeNGramTokenizer.Builder()).build());
		}

		public Builder icuTokenizer(IcuTokenizer v) {
			this._type = ICU_TOKENIZER;
			this._value = v;
			return this;
		}

		public Builder icuTokenizer(Function<IcuTokenizer.Builder, ObjectBuilder<IcuTokenizer>> f) {
			return this.icuTokenizer(f.apply(new IcuTokenizer.Builder()).build());
		}

		public Builder keyword(KeywordTokenizer v) {
			this._type = KEYWORD;
			this._value = v;
			return this;
		}

		public Builder keyword(Function<KeywordTokenizer.Builder, ObjectBuilder<KeywordTokenizer>> f) {
			return this.keyword(f.apply(new KeywordTokenizer.Builder()).build());
		}

		public Builder kuromojiTokenizer(KuromojiTokenizer v) {
			this._type = KUROMOJI_TOKENIZER;
			this._value = v;
			return this;
		}

		public Builder kuromojiTokenizer(Function<KuromojiTokenizer.Builder, ObjectBuilder<KuromojiTokenizer>> f) {
			return this.kuromojiTokenizer(f.apply(new KuromojiTokenizer.Builder()).build());
		}

		public Builder letter(LetterTokenizer v) {
			this._type = LETTER;
			this._value = v;
			return this;
		}

		public Builder letter(Function<LetterTokenizer.Builder, ObjectBuilder<LetterTokenizer>> f) {
			return this.letter(f.apply(new LetterTokenizer.Builder()).build());
		}

		public Builder lowercase(LowercaseTokenizer v) {
			this._type = LOWERCASE;
			this._value = v;
			return this;
		}

		public Builder lowercase(Function<LowercaseTokenizer.Builder, ObjectBuilder<LowercaseTokenizer>> f) {
			return this.lowercase(f.apply(new LowercaseTokenizer.Builder()).build());
		}

		public Builder ngram(NGramTokenizer v) {
			this._type = NGRAM;
			this._value = v;
			return this;
		}

		public Builder ngram(Function<NGramTokenizer.Builder, ObjectBuilder<NGramTokenizer>> f) {
			return this.ngram(f.apply(new NGramTokenizer.Builder()).build());
		}

		public Builder noriTokenizer(NoriTokenizer v) {
			this._type = NORI_TOKENIZER;
			this._value = v;
			return this;
		}

		public Builder noriTokenizer(Function<NoriTokenizer.Builder, ObjectBuilder<NoriTokenizer>> f) {
			return this.noriTokenizer(f.apply(new NoriTokenizer.Builder()).build());
		}

		public Builder pathHierarchy(PathHierarchyTokenizer v) {
			this._type = PATH_HIERARCHY;
			this._value = v;
			return this;
		}

		public Builder pathHierarchy(
				Function<PathHierarchyTokenizer.Builder, ObjectBuilder<PathHierarchyTokenizer>> f) {
			return this.pathHierarchy(f.apply(new PathHierarchyTokenizer.Builder()).build());
		}

		public Builder pattern(PatternTokenizer v) {
			this._type = PATTERN;
			this._value = v;
			return this;
		}

		public Builder pattern(Function<PatternTokenizer.Builder, ObjectBuilder<PatternTokenizer>> f) {
			return this.pattern(f.apply(new PatternTokenizer.Builder()).build());
		}

		public Builder standard(StandardTokenizer v) {
			this._type = STANDARD;
			this._value = v;
			return this;
		}

		public Builder standard(Function<StandardTokenizer.Builder, ObjectBuilder<StandardTokenizer>> f) {
			return this.standard(f.apply(new StandardTokenizer.Builder()).build());
		}

		public Builder uaxUrlEmail(UaxEmailUrlTokenizer v) {
			this._type = UAX_URL_EMAIL;
			this._value = v;
			return this;
		}

		public Builder uaxUrlEmail(Function<UaxEmailUrlTokenizer.Builder, ObjectBuilder<UaxEmailUrlTokenizer>> f) {
			return this.uaxUrlEmail(f.apply(new UaxEmailUrlTokenizer.Builder()).build());
		}

		public Builder whitespace(WhitespaceTokenizer v) {
			this._type = WHITESPACE;
			this._value = v;
			return this;
		}

		public Builder whitespace(Function<WhitespaceTokenizer.Builder, ObjectBuilder<WhitespaceTokenizer>> f) {
			return this.whitespace(f.apply(new WhitespaceTokenizer.Builder()).build());
		}

		public TokenizerDefinition build() {
			_checkSingleUse();
			return new TokenizerDefinition(this);
		}

	}

	protected static void setupTokenizerDefinitionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::charGroup, CharGroupTokenizer._DESERIALIZER, "char_group");
		op.add(Builder::edgeNgram, EdgeNGramTokenizer._DESERIALIZER, "edge_ngram");
		op.add(Builder::icuTokenizer, IcuTokenizer._DESERIALIZER, "icu_tokenizer");
		op.add(Builder::keyword, KeywordTokenizer._DESERIALIZER, "keyword");
		op.add(Builder::kuromojiTokenizer, KuromojiTokenizer._DESERIALIZER, "kuromoji_tokenizer");
		op.add(Builder::letter, LetterTokenizer._DESERIALIZER, "letter");
		op.add(Builder::lowercase, LowercaseTokenizer._DESERIALIZER, "lowercase");
		op.add(Builder::ngram, NGramTokenizer._DESERIALIZER, "ngram");
		op.add(Builder::noriTokenizer, NoriTokenizer._DESERIALIZER, "nori_tokenizer");
		op.add(Builder::pathHierarchy, PathHierarchyTokenizer._DESERIALIZER, "path_hierarchy");
		op.add(Builder::pattern, PatternTokenizer._DESERIALIZER, "pattern");
		op.add(Builder::standard, StandardTokenizer._DESERIALIZER, "standard");
		op.add(Builder::uaxUrlEmail, UaxEmailUrlTokenizer._DESERIALIZER, "uax_url_email");
		op.add(Builder::whitespace, WhitespaceTokenizer._DESERIALIZER, "whitespace");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<TokenizerDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenizerDefinition::setupTokenizerDefinitionDeserializer, Builder::build);
}
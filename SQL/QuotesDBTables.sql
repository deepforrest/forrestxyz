CREATE TABLE quotes(
	id SERIAL PRIMARY KEY,
	author TEXT,
	quotation TEXT NOT NULL
);

CREATE TABLE keywords(
	id SERIAL PRIMARY KEY,
	keyword TEXT
);

CREATE TABLE quote_keywords(
	quote_id INTEGER,
	keyword_id INTEGER,
	
	CONSTRAINT fk_quote_idx FOREIGN KEY (quote_id) REFERENCES quotes(id),
	CONSTRAINT fk_keyword_idx FOREIGN KEY (keyword_id) REFERENCES keywords(id)
);
DROP TABLE IF EXISTS author;
CREATE TABLE author(
	id SERIAL PRIMARY KEY,
	name TEXT,
	wiki TEXT
);

DROP TABLE IF EXISTS quotes;
CREATE TABLE quotes(
	id SERIAL PRIMARY KEY,
	author TEXT,
	quotation TEXT NOT NULL
);

ALTER TABLE quotes
RENAME COLUMN author to author_id
ALTER TABLE quotes;
ALTER COLUMN author_id TYPE INTEGER USING author_id::integer
ALTER TABLE quotes
ADD CONSTRAINT fk_author_idx FOREIGN KEY(author_id) REFERENCES author(id);

DROP TABLE IF EXISTS keywords;
CREATE TABLE keywords(
	id SERIAL PRIMARY KEY,
	keyword TEXT
);

DROP TABLE IF EXISTS quote_keywords;
CREATE TABLE quote_keywords(
	quote_id INTEGER,
	keyword_id INTEGER,
	
	CONSTRAINT fk_quote_idx FOREIGN KEY (quote_id) REFERENCES quotes(id),
	CONSTRAINT fk_keyword_idx FOREIGN KEY (keyword_id) REFERENCES keywords(id)
);
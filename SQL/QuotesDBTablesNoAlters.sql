DROP TABLE IF EXISTS author CASCADE;
CREATE TABLE author(
	id SERIAL PRIMARY KEY,
	name TEXT,
	wiki TEXT,
    UNIQUE(name)
);

DROP TABLE IF EXISTS quotes CASCADE;
CREATE TABLE quotes(
    id SERIAL PRIMARY KEY,
    author_id INTEGER,
    quotation TEXT NOT NULL,
    UNIQUE(quotation),
    CONSTRAINT fk_author_idx FOREIGN KEY(author_id) REFERENCES author(id)
);

DROP TABLE IF EXISTS keywords CASCADE;
CREATE TABLE keywords(
	id SERIAL PRIMARY KEY,
	keyword TEXT,
    UNIQUE(keyword)
);

DROP TABLE IF EXISTS quote_keywords;
CREATE TABLE quote_keywords(
	quote_id INTEGER,
	keyword_id INTEGER,
	
	CONSTRAINT fk_quote_idx FOREIGN KEY (quote_id) REFERENCES quotes(id),
	CONSTRAINT fk_keyword_idx FOREIGN KEY (keyword_id) REFERENCES keywords(id)
);
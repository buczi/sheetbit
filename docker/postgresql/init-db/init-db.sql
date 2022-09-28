CREATE SCHEMA community;
CREATE SCHEMA statistics;
CREATE SCHEMA rules;
CREATE SCHEMA games;

CREATE USER sb_social WITH PASSWORD 'sb_social';
CREATE USER sb_stats WITH PASSWORD 'sb_stats';
CREATE USER sb_rules WITH PASSWORD 'sb_rules';
CREATE USER sb_games WITH PASSWORD 'sb_games';

GRANT ALL PRIVILEGES ON SCHEMA community TO postgres;
GRANT ALL PRIVILEGES ON SCHEMA statistics TO postgres;
GRANT ALL PRIVILEGES ON SCHEMA rules TO postgres;
GRANT ALL PRIVILEGES ON SCHEMA games TO postgres;

GRANT ALL PRIVILEGES ON SCHEMA community TO sb_social;
GRANT ALL PRIVILEGES ON SCHEMA statistics TO sb_stats;
GRANT ALL PRIVILEGES ON SCHEMA rules TO sb_rules;
GRANT ALL PRIVILEGES ON SCHEMA games TO sb_games;

ALTER ROLE sb_social SET search_path TO community;
ALTER ROLE sb_stats SET search_path TO statistics;
ALTER ROLE sb_rules SET search_path TO rules;
ALTER ROLE sb_games SET search_path TO games;
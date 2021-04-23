use covid19;

CREATE TABLE `listings` (
  `id`         BIGINT(20)   NOT NULL AUTO_INCREMENT,
  `category`       VARCHAR(50)            NOT NULL,
    `city`       VARCHAR(50)            NOT NULL,
    `state`       VARCHAR(50)            NOT NULL,
    `country`       VARCHAR(50)            NOT NULL,
    `info`       VARCHAR(200)           DEFAULT NULL,
    `address`       VARCHAR(500)            NOT NULL,
    `contact_number`       VARCHAR(200)            NOT NULL,
    `user_id` BIGINT(20)           NOT NULL,
  `created_on` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_on` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY idx_updated_on (updated_on),
  KEY idx_state_city (state,city),
  KEY idx_state (state),
  KEY idx_city (city),
  KEY idx_category (category),
  KEY idx_category_state_city (category,state,city)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
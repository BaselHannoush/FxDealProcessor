CREATE TABLE deals (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       dealUniqueId VARCHAR(255) NOT NULL,
                       fromCurrency VARCHAR(3) NOT NULL,
                       toCurrency VARCHAR(3) NOT NULL,
                       dealTimestamp DATETIME NOT NULL,
                       dealAmount DOUBLE NOT NULL,
                       UNIQUE (dealUniqueId)
);

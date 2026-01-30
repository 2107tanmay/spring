CREATE TABLE IF NOT EXISTS flight (
    flightid INT PRIMARY KEY,
    noofseats INT NOT NULL
);

CREATE TABLE IF NOT EXISTS book_flight (
    bookingid INT PRIMARY KEY,
    flightid INT,
    noofseatsbooked INT,
    FOREIGN KEY (flightid) REFERENCES flight(flightid)
);

-- Insert sample data
INSERT INTO flight (flightid, noofseats) VALUES (2000, 100);